package com.example.ioexcel.io;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        ExcelFile file_xls = new ExcelFile("Canevas.xlsx"); 
        file_xls.chooseSheet(4);

        // file_xls.writeCell(5, 1, 1);
        // file_xls.writeCell(5, 2, "Commerces/ restauration");
        // file_xls.writeCell(5, 3, "Benslimane");
        // file_xls.writeCell(5, 4, 50);
        // file_xls.writeCell(5, 5, 0);
        // file_xls.writeCell(5, 6, 1);
        // file_xls.writeCell(5, 7, 0);
        // file_xls.writeCell(5, 8, 16);
        // file_xls.writeCell(5, 9, 64);
        // file_xls.writeCell(5, 10, 2026);
        int anneeDebutPrevisionelle = (int)file_xls.readCell(5, 11);
        System.out.println(anneeDebutPrevisionelle);
        file_xls.writeCell(5, 12, 2);
        int totalEmplois = (int)file_xls.readCell(5, 13);
        System.out.println(totalEmplois);
    }
}
