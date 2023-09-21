package com.sessions.session20.practice;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args){
        //String path = "src/main/java/com/sessions/session21/practice/a.txt";
        String path = "a.txt";
        readFile(path);
        readFileRes(path);
    }

    private static void readFile(String path){
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(path));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }
        catch (IOException e){
            System.out.println("File not find!");
        }
    }

    private static void readFileRes(String path){
        // This will automatically close the resource at the end
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(path))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            // This is redundant
            //reader.close();
        }
        catch (IOException e){
            System.out.println("File not find!");
        }
    }


}
