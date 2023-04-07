package com.example.ioexcel.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
    private File file;
    private XSSFWorkbook workbook ;
    private Sheet sheet;
    private int number = 1;

    public ExcelFile(){}
    public ExcelFile(File file) { 
        this.file = file;
        try {
            this.workbook = new XSSFWorkbook(new FileInputStream(this.file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ExcelFile(Workbook workbook){ 
        this.workbook = new XSSFWorkbook();
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(int number){
        return this.number;
    }
    
    public void setFile(File file){this.file = file;}

    public File getFile() {
        return file;
    }
    public XSSFWorkbook getWorkbook() {
        return workbook;
    }
    public void setWorkbook(XSSFWorkbook workbook) {
        this.workbook = workbook;
    }
    public Sheet getSheet(int number){
        return this.workbook.getSheetAt(number-1);
    }

    public Sheet getSheet(String name){
        return this.workbook.getSheet(name);
    }
    public Sheet getSheet() {
        return sheet;
    }
    public void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }
    public void setSheet(int number) {
        //TODO gerer le cas ou la feuille n'existe pas !
        this.sheet = this.workbook.getSheetAt(number-1);
    }

    public Object readCell(int row, int column){
        Cell cell = this.sheet.getRow(row-1).getCell(column-1);

        DataFormatter formatter = new DataFormatter();
        switch (cell.getCellType()) 
        {
            // Cell.CELL_TYPE_NUMERIC dans les versions < 4.0.0 
            case NUMERIC:
                String numericValue = formatter.formatCellValue(sheet.getRow(row-1).getCell(column-1));
                return Double.valueOf(numericValue);
            default:
                String stringValue = formatter.formatCellValue(sheet.getRow(row-1).getCell(column-1));
                return stringValue;
        }
    }

    public void writeOnCell(int row, int column, Object data) throws IOException{
        if(data instanceof String)
        this.sheet.getRow(row-1).createCell(column-1).setCellValue((String)data);
        else if(data instanceof Integer)
        this.sheet.getRow(row-1).createCell(column-1).setCellValue((Integer)data);
        else if(data instanceof Float)
            this.sheet.getRow(row-1).createCell(column-1).setCellValue((Float)data);
        
        //mis a jour sur le fichier physique
        FileOutputStream output = new FileOutputStream(this.file);
        this.sheet.getWorkbook().write(output);
        output.close();

    }
    
    public void performFormula(int row, int column, String formula){
        this.sheet.createRow(row-1).createCell(column-1).setCellFormula(formula);
        try (//mis a jour sur le fichier physique
        FileOutputStream output = new FileOutputStream(this.file)) {
            this.sheet.getWorkbook().write(output);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
