package com.example.ioexcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

@SpringBootApplication
public class Lecture {

    public static void main(String[] args) {
        SpringApplication.run(Lecture.class, args);

        try
        {
            FileInputStream file = new FileInputStream(new File("fruitDataset.xlsx"));
 
            //Create Workbook instance holding reference to .xlsx file
            //creation d'une instance de classeur XSSFWorkbook en lui donnant en parametre le fichier excel
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //on se place sur la feuille désireé | l'index commence par zéro
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //puis on itère sur chaque ligne de la feuille
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                //pour chaque ligne on itère sur chaque colone
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext()) 
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) 
                    {
                        // Cell.CELL_TYPE_NUMERIC dans les versions < 4.0.0
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + ",,,,,,");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + ",,,,,,");
                            break;
                    }
                }
                System.out.println("");
            }
            file.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
