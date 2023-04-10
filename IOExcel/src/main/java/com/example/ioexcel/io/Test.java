package com.example.ioexcel.io;



public class Test {
    public static void main(String[] args) {
        try {
            ExcelFile file_xls = new ExcelFile("fruitDataset.xlsx"); 
            file_xls.chooseSheet(1);
            file_xls.writeCell(16, 3, 2000);
            file_xls.writeCell(16, 4, 10);
            file_xls.writeCell(16, 5, 15);
            System.out.println(file_xls.readCell(16, 6));
            System.out.println(file_xls.readCell(14,2 ));

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
