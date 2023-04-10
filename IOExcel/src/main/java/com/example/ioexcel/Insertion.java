package com.example.ioexcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@SpringBootApplication
public class Insertion {

    public static void main(String[] args) {

        SpringApplication.run(Insertion.class, args);

        try (//classeur vierge
        XSSFWorkbook workbook = new XSSFWorkbook()) {
            //creation d'une feuille
            XSSFSheet sheet = workbook.createSheet("Employee Data");

      //Ces données vont être insérées
      Map<String, Object[]> data = new TreeMap<String, Object[]>();
      data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
      data.put("2", new Object[] {1, "Amit", "Shukla"});
      data.put("3", new Object[] {2, "Lokesh", "Gupta"});
      data.put("4", new Object[] {3, "John", "Adwards"});
      data.put("5", new Object[] {4, "Brian", "Schultz"});

      //Iteration des données et insertion sur la feuille

      Set<String> keyset = data.keySet();
      int rownum = 0;
      //iteration sur les clés du dictionnaire
      for (String key : keyset)
      {
            //creation d'une ligne
               Row row = sheet.createRow(rownum++);
               Object [] dataToInsert = data.get(key);
               int cellnum = 0;
               for (Object dataInserted : dataToInsert)
               {
                //creation d'une cellule
                  Cell cell = row.createCell(cellnum++);
                  if(dataInserted instanceof String)
                        //insertion de la data dans la cellule
                       cell.setCellValue((String)dataInserted);
                   else if(dataInserted instanceof Integer)
                       cell.setCellValue((Integer)dataInserted);
                    else if(dataInserted instanceof Float)
                    cell.setCellValue((Float)dataInserted);
               }
      }

      try
            {
                //creation d'un fichier et insertion des donnees depuis le classeur workbook
                FileOutputStream out = new FileOutputStream(new File("test.xlsx"));
                workbook.write(out);
                out.close();
                System.out.println("Donnees inserees avec success");
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
