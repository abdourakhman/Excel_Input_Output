package com.example.ioexcel.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
    private XSSFWorkbook workbook ;
    private Sheet sheet;
    private File file;
    private int sheetNumber = 1;
    private int lastDataRowNum =0;

    //constructors
    public ExcelFile() {
    }
    public ExcelFile(String file){        
        try (InputStream fileStream = new FileInputStream(file)) {
            this.file = new File(file);
            this.workbook = new XSSFWorkbook(fileStream);
            //Toutes les cellules de calcul sont recalculées avant la lecture
            this.workbook.setForceFormulaRecalculation(true);
        }catch(Exception e){System.err.println("Problème rencontré ! Verifiez si le fichier existe...");}
    }

    //getter & setters
    public Sheet getSheet() {
        return sheet;
    }
    public void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }
    public int getSheetNumber() {
        return sheetNumber;
    }
    public void setSheetNumber(int sheetNumber) {
        this.sheetNumber = sheetNumber;
    }

    

    /*
     * La méthode getLastDataRowNum() renvoie le numéro de la dernière ligne contenant au moins une donnée en parcourant les lignes 
     * depuis la dernière ligne jusqu'à la première ligne. La méthode isRowEmpty() vérifie si une ligne donnée est vide ou non en 
     * parcourant toutes les cellules de la ligne et en vérifiant si elles sont vides ou non.
     */
    public int getLastDataRowNum() {
        int lastRowNum = this.sheet.getLastRowNum();
        for (int i = lastRowNum; i >= 0; i--) {
            Row row = this.sheet.getRow(i);
            if (row != null && !isRowEmpty(row)) {
                this.lastDataRowNum =i;
                return i;
            }
        }
        // Si aucune ligne non vide n'est trouvée, retourner -1
        return -1;
    }
    
    private boolean isRowEmpty(Row row) {
        for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {
            Cell cell = row.getCell(j);
    
            if (cell != null && cell.getCellType() != CellType.BLANK) {
                if (cell.getCellType() == CellType.FORMULA) {
                    if (cell.getCachedFormulaResultType() != CellType.BLANK) {
                        return false;
                    }
                } else if (cell.getCellStyle().getIndex() != 0) {
                    return false;
                } else if (cell.getCellType() == CellType.STRING || cell.getCellType() == CellType.NUMERIC) {
                    if (!cell.getStringCellValue().trim().isEmpty()) {
                        return false;
                    }
                }
            }
        }
    
        return true;
    }
    
    
    
    //methods Input output
    public Object readCell(int row, int column){
        // 1048575 max row number
        Cell cell = this.sheet.createRow(1048575).createCell(0); 
        
        if(this.sheet.getRow(row-1) == null){
           cell =  this.sheet.createRow(row-1).createCell(column-1);
        }
        else if(this.sheet.getRow(row-1).getCell(column-1) == null){
           cell = this.sheet.getRow(row-1).createCell(column-1);
        }else{
           cell = this.sheet.getRow(row-1).getCell(column-1);
        }
        FormulaEvaluator evaluator = this.workbook.getCreationHelper().createFormulaEvaluator(); 
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue();
                } 
                if (cell.getNumericCellValue() %2 == 0)
                    return (int)cell.getNumericCellValue();
                else
                    return cell.getNumericCellValue();
            case BOOLEAN:
                return cell.getBooleanCellValue();
            case BLANK:
                return "VIDE";
            case FORMULA:
                CellValue cellValue = evaluator.evaluate(cell);
                switch(cellValue.getCellType()){
                    case STRING:
                        return cellValue.getStringValue();
                    case NUMERIC:
                            return cellValue.getNumberValue();
                    case BOOLEAN:
                        return cellValue.getBooleanValue();
                    default:
                        return "VIDE";
                }
            default:
                return 0;
        }
    }


    /*
     * A noter que les données seront au format texte dans le fichier excel
     * Ajoute automatiquement la ou les données sur la ligne suivante 
     */
    public void writeCell(int column, Object value) throws IOException{
        Cell  cell = null;
        int row = this.lastDataRowNum+1;
        if((this.sheet.getRow(row) == null)){
            cell = this.sheet.createRow(row).createCell(column-1);
        }
        else if(this.sheet.getRow(row).getCell(column-1) == null){
            cell = this.sheet.getRow(row).createCell(column-1);
        }else{
            cell = this.sheet.getRow(row).getCell(column-1);
        }
        
        cell.setCellValue(value.toString());
        
        // Set cell format to "Text"
        CellStyle style = this.workbook.createCellStyle();
        DataFormat dataFormat = this.workbook.createDataFormat();
        style.setDataFormat(dataFormat.getFormat("@"));
        cell.setCellStyle(style);
        
    }
    /*
     * ecrit la donnée en precisant les coordonées exactes de la cellule
     */
    public void writeCell(int row, int column, Object value) throws IOException{
        Cell cell = null;
        if(this.sheet.getRow(row-1) == null){
            cell = this.sheet.createRow(row-1).createCell(column-1);
        }
        else if(this.sheet.getRow(row-1).getCell(column-1) == null){
            cell = this.sheet.getRow(row-1).createCell(column-1);
        }else{
            cell = this.sheet.getRow(row-1).getCell(column-1);
        }
        if(value instanceof String){
            cell.setCellValue((String)value);
            // Set cell format to "Standard"
            CellStyle style = this.workbook.createCellStyle();
            DataFormat dataFormat = this.workbook.createDataFormat();
            style.setDataFormat(dataFormat.getFormat("General"));
            cell.setCellStyle(style);
        }
        else if(value instanceof Number){
            cell.setCellValue(((Number)value).doubleValue());
            // Set cell format to "Standard"
            CellStyle style = this.workbook.createCellStyle();
            DataFormat dataFormat = this.workbook.createDataFormat();
            style.setDataFormat(dataFormat.getFormat("General"));
            cell.setCellStyle(style);
        }
        else if(value instanceof Date){
            cell.setCellValue((Date)value);
            // Set cell format to "Date"
            CellStyle style = this.workbook.createCellStyle();
            DataFormat dataFormat = this.workbook.createDataFormat();
            style.setDataFormat(dataFormat.getFormat("dd/MM/yyyy"));
            cell.setCellStyle(style);
        }
        else if(value instanceof Boolean){
            cell.setCellValue((Boolean)value);
            // Set cell format to "Standard"
            CellStyle style = this.workbook.createCellStyle();
            DataFormat dataFormat = this.workbook.createDataFormat();
            style.setDataFormat(dataFormat.getFormat("General"));
            cell.setCellStyle(style);
        }
        else{
            cell.setCellValue("");
        }
    }
    
    
    /*
     * General: le format de cellule par défaut qui est utilisé pour les données générales.
     * Number: le format de cellule qui est utilisé pour les nombres.
     * Currency: le format de cellule qui est utilisé pour les valeurs monétaires.
     * Date: le format de cellule qui est utilisé pour les dates.
     * Time: le format de cellule qui est utilisé pour les heures.
     * %: le format de cellule qui est utilisé pour les pourcentages.
     * Scientific: le format de cellule qui est utilisé pour les nombres en notation scientifique.
     * Text: le format de cellule qui est utilisé pour le texte.
     */
    public void writeCellWithFormat(int row, int column, Object value, String format) throws IOException {
        Cell cell = null;
        if (this.sheet.getRow(row - 1) == null) {
            cell = this.sheet.createRow(row - 1).createCell(column - 1);
        } else if (this.sheet.getRow(row - 1).getCell(column - 1) == null) {
            cell = this.sheet.getRow(row - 1).createCell(column - 1);
        } else {
            cell = this.sheet.getRow(row - 1).getCell(column - 1);
        }
        if (value instanceof String) {
            cell.setCellValue((String)value);
            // Set cell format to "General"
            CellStyle style = this.workbook.createCellStyle();
            DataFormat dataFormat = this.workbook.createDataFormat();
            style.setDataFormat(dataFormat.getFormat("General"));
            cell.setCellStyle(style);
        } else if (value instanceof Number) {
            cell.setCellValue(((Number)value).doubleValue());
            // Set cell format to specified format
            CellStyle style = this.workbook.createCellStyle();
            DataFormat dataFormat = this.workbook.createDataFormat();
            style.setDataFormat(dataFormat.getFormat(format));
            cell.setCellStyle(style);
        } else if (value instanceof Date) {
            cell.setCellValue((Date)value);
            // Set cell format to "dd/MM/yyyy"
            CellStyle style = this.workbook.createCellStyle();
            DataFormat dataFormat = this.workbook.createDataFormat();
            style.setDataFormat(dataFormat.getFormat("dd/MM/yyyy"));
            cell.setCellStyle(style);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean)value);
            // Set cell format to "General"
            CellStyle style = this.workbook.createCellStyle();
            DataFormat dataFormat = this.workbook.createDataFormat();
            style.setDataFormat(dataFormat.getFormat("General"));
            cell.setCellStyle(style);
        } else {
            cell.setCellValue("");
        }
    }
    
    
    public void chooseSheet(int number){
        this.sheetNumber = number-1;
        try {
            this.sheet = this.workbook.getSheetAt(sheetNumber);
            this.lastDataRowNum = getLastDataRowNum();
        } catch (Exception e) {
            System.err.println("Vous essayez d'accéder à une feuille Alors qu'un problème a été détecté lors de l'ouverture du fichier");
        }
    }
    public void close() throws IOException {
        FileOutputStream output = new FileOutputStream(this.file);
        //On positionne le curseur sur la ligne suivante pour une future insertion
        //mis a jour sur le fichier physique
        this.sheet.getWorkbook().write(output);
        output.close();
        this.workbook.close();
        this.lastDataRowNum+=1;
    }
}
