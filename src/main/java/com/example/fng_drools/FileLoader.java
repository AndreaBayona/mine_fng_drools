package com.example.fng_drools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {
	 // Define a method to load the CSV file
    public static List<String[]> loadCSVFile(String filePath) throws IOException {
        List<String[]> data = new ArrayList<>();
        
        // Use a BufferedReader to read the file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line by comma (or another delimiter)
                String[] values = line.split(";");
                // Add the parsed values to the data list
                data.add(values);
            }
        }
        
        return data;
    }
    
    public static boolean isCSVFile(String filePath) {
        // Check if the file path ends with ".csv" (case-insensitive)
        return filePath.toLowerCase().endsWith("csv");
    }

}
