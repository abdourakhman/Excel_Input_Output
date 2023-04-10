package com.example.ioexcel.append;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Add {
    public static void main(String[] args) {
    File file = new File("test.xlsx");

    List<DataHeader> recordsToWrite = new ArrayList();
    recordsToWrite.add(new DataHeader(5, "abdourahmane", "ndiaye"));
    recordsToWrite.add(new DataHeader(6, "ibrahima", "thiam"));

    try {
     new DataHeader().appendRows(recordsToWrite, file);
    } catch (IOException | InvalidFormatException e) {
      e.printStackTrace();
    }
        
    }
    
}
