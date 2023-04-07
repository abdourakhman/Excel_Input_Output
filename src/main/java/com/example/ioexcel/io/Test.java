package com.example.ioexcel.io;



public class Test {
    public static void main(String[] args) {
        try {
            ExcelFileV2 file_xls = new ExcelFileV2("fruitDataset.xlsx"); 
            file_xls.chooseSheet(1);
            file_xls.writeCell(16, 3, 500);
            file_xls.writeCell(16, 4, 80);
            file_xls.writeCell(16, 5, 220);
            System.out.println(file_xls.readCell(16, 6));
            System.out.println(file_xls.readCell(14,2 ));

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
