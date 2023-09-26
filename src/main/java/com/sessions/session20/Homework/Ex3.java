package com.sessions.session20.Homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex3
{
    //Write a program that performs some risky operations (e.g., division, file manipulation, invalid arguments..etc..)
    // and handles specific exceptions differently. Use multi-catch to handle related exceptions in a single block
    // and individual catch blocks for others

    public static void main(String[] args)
    {
        try {
            // Operații riscante
            int result = divide(10, 0); // Divizare la zero
            openFile("nonexistent.txt"); // Deschidere fișier inexistent
            String nullString = null;
            int length = nullString.length(); // Operare pe referință null

        } catch (ArithmeticException | FileNotFoundException e) {
            // Capturăm excepțiile de tip ArithmeticException și FileNotFoundException într-un singur bloc
            System.out.println("O eroare a survenit: " + e.getMessage());

        } catch (NullPointerException e) {
            // Capturăm excepția de tip NullPointerException separat
            System.out.println("NullPointerException a fost aruncată: " + e.getMessage());

        } catch (Exception e) {
            // Capturăm orice altă excepție care nu se potrivește cu cele de mai sus
            System.out.println("O excepție necunoscută a fost aruncată: " + e.getMessage());

        } finally {
            // Blocul finally este executat întotdeauna, indiferent de existența excepțiilor
            System.out.println("Blocul finally a fost executat.");
        }
    }

    // Metodă care efectuează o divizare și aruncă o excepție în caz de încercare de divizare la zero
    public static int divide(int a, int b)
    {
        if (b == 0) {
            throw new ArithmeticException("Încercare de divizare la zero.");
        }
        return a / b;
    }

    // Metodă care încearcă să deschidă un fișier și aruncă o excepție în cazul în care fișierul nu există
    public static void openFile(String fileName) throws FileNotFoundException
    {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();


    }
}
