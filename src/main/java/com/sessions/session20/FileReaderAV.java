package com.sessions.session20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAV {
    public static void main(String[] args) {

        String path = "src/main/java/com/sessions/session20/example2.txt";

        readFile(path);
    }

    private static void readFile(String path) {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
           // reader.close();
        } catch (IOException e) {
            System.out.println("Exception occured: " + e.getMessage());
        }

    }
}
