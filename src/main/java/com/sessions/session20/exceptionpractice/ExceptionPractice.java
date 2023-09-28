package com.sessions.session20.exceptionpractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ExceptionPractice {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("src/main/java/com/sessions/session20/example.txt");
        try {
            Stream<String> lines = Files.lines(filePath);
            lines.forEach(System.out::println);
            lines.close();
        } catch (IOException e) {

            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

}
