package com.sessions.session20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderR
{
    public static void main(String[] args)
    {
        String path="src/main/java/com/sessions/session20/Exemple2.txt";
        readFile(path);
    }
    private static void readFile(String path)
    {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(path)))
        {
            String line;
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
        }catch (IOException e)
        {
            System.err.println("Exception occured"+e.getMessage());
        }
    }
}
