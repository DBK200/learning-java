package com.sessions.session20;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    public static void main(String[] args) {
        String path = "D:\\workspace intelliJ\\MyProject\\learning-java\\src\\main\\java\\com\\sessions\\session20\\example.txt"; // copy path/ reference -> path from content root
        readFile(path);
    }

    private static void readFile(String path) {
        try ( BufferedReader reader = new BufferedReader(new java.io.FileReader(path)) ){  // pt a inchide resursa automat la final

            String line;
            while( (line=reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch(IOException e){
            System.err.println("Exception occurred " + e.getMessage());
        }
    }

}
