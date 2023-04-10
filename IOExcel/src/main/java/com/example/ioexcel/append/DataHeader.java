package com.example.ioexcel.append;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHeader {
    private int id;
    private String firstName;
    private String lastName;

    public DataHeader(){}
    public DataHeader(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //retourne un ou +sieurs  enregistrement(s) de données ou tableau de DataHeader
    private static Map<Integer, Object[]> prepareData(int numRow, List<DataHeader>dataHeader){
        Map<Integer, Object[]> data = new HashMap<>();

        for(DataHeader newData : dataHeader){
            numRow++;
            data.put(numRow, new Object[] {newData.getId(),newData.getFirstName(),newData.getLastName()});
        }
        return data;
    } 

    public  void appendRows(List<DataHeader> recordsToWrite, File file)
        throws IOException, InvalidFormatException {

        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
            Sheet sheet = workbook.getSheetAt(0);
            int rowNum = sheet.getLastRowNum() + 1;

            Map<Integer, Object[]> data = prepareData(rowNum, recordsToWrite);

            Set<Integer> keySet = data.keySet();
            for (Integer key : keySet) {
                Row row = sheet.createRow(rowNum++);
                Object[] objArr = data.get(key);
                int cellNum = 0;
                for (Object obj : objArr) {
                Cell cell = row.createCell(cellNum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
                }
            }
            try {
            FileOutputStream out = new FileOutputStream(file);
            workbook.write(out);
            out.close();
            } catch (Exception e) {
            e.printStackTrace();
            }
        }
    
}
