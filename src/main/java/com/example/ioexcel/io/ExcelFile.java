package com.example.ioexcel.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
    private XSSFWorkbook workbook ;
    private Sheet sheet;
    private File file;
    private int sheetNumber = 1;

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
                } else {
                    return cell.getNumericCellValue();
                }
            case BOOLEAN:
                return cell.getBooleanCellValue();
            case BLANK:
                return "Cellule Vide";
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
                    return "NEANT";
                }
            default:
                return null;
        }
    }
    
    public void writeCell(int row, int column, Object data) throws IOException{
        
        if(data instanceof String)
            if(this.sheet.getRow(-1) == null)
                this.sheet.createRow(row-1).createCell(column-1).setCellValue((String)data);
            else
                this.sheet.getRow(row-1).createCell(column-1).setCellValue((String)data);
        else if(data instanceof Integer)
            if(this.sheet.getRow(row-1) == null)
                this.sheet.createRow(row-1).createCell(column-1).setCellValue((Integer)data);
            else
                this.sheet.getRow(row-1).createCell(column-1).setCellValue((Integer)data);
        else if(data instanceof Float)
            if(this.sheet.getRow(row-1) == null)
                this.sheet.createRow(row-1).createCell(column-1).setCellValue((Float)data);
            else
                this.sheet.getRow(row-1).createCell(column-1).setCellValue((Float)data);
        
        //mis a jour sur le fichier physique
        FileOutputStream output = new FileOutputStream(this.file);
        this.sheet.getWorkbook().write(output);
        output.close();
    }

    public void chooseSheet(int number){
        this.sheetNumber = number-1;
        try {
            this.sheet = this.workbook.getSheetAt(sheetNumber);
        } catch (Exception e) {
            System.err.println("Vous essayez d'accéder à une feuille Alors qu'un problème a été détecté lors de l'ouverture du fichier");
        }
    }
}
