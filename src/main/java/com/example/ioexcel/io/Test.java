package com.example.ioexcel.io;



public class Test {
    public static void main(String[] args) {
        try {
            ExcelFile file_xls = new ExcelFile("Canevas.xlsx"); 
            file_xls.chooseSheet(4);
            System.out.println(file_xls.readCell(3, 2));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
