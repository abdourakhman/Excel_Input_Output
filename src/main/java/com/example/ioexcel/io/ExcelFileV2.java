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

public class ExcelFileV2 {
    private XSSFWorkbook workbook ;
    private Sheet sheet;
    private File file;
    private int sheetNumber = 1;

    //constructors
    public ExcelFileV2() {
    }
    public ExcelFileV2(String file) {
        try (InputStream fileStream = new FileInputStream(file)) {
            this.file = new File(file);
            this.workbook = new XSSFWorkbook(fileStream);
        }catch(Exception e){System.err.println(e.getMessage());}
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
        Cell cell = this.sheet.createRow(this.sheet.getLastRowNum()+1).createCell(0); 
        if(this.sheet.getRow(row-1) == null){
           cell =  this.sheet.createRow(row-1).createCell(-1);
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
                    cell.getDateCellValue();
                } else {
                    cell.getNumericCellValue();
                }
            case BOOLEAN:
                return cell.getBooleanCellValue();
            case BLANK:
                return "NaN";
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
                    return "NaN";
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
        this.sheet = this.workbook.getSheetAt(sheetNumber);
        // if(number > (this.workbook.getNumberOfSheets()-1)){
        //     for(int i =0; i < (number - (this.workbook.getNumberOfSheets()-1)); i++){
        //         Sheet newSheet = this.workbook.createSheet("feuille"+(i+2));
        //         this.sheet = newSheet;
        //     }
        // }
    }
}