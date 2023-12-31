package com.sessions.session20;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;

public class FileReader {

    public static void main(String[] args) {
        String path = "src/main/java/com/sessions/session20/exceptionpractice/example2.txt";
        readFile(path);
    }

    private static void readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Exception occured " + e.getMessage());
        }


    }

}
