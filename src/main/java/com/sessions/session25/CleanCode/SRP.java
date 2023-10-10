package com.sessions.session25.CleanCode;

import java.util.Objects;

public class SRP {

}
class TextProcessor {
    private String text;

    public TextProcessor(String text) {
        this.text = text;
    }

    public String processText() {
        text = text.trim().toUpperCase();
        return text;
    }

    public String getText() {
        return text;
    }
}

class FileSaver {
    public void saveToFile(String text, String filePath) {
        System.out.println("Your file: " + text + " is saved in: " + filePath);
    }
}

class Printer {
    public void printText(String text) {
        System.out.println("Your file has been printed: " + text);
    }
}

class Main4 {
    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor("Luni, marti, miercuri");
        String processedText = textProcessor.processText();
        System.out.println(textProcessor.getText());

        FileSaver fileSaver = new FileSaver();
        String filePath = "C:/output.txt";
        fileSaver.saveToFile(processedText, filePath);

        Printer printer = new Printer();
        printer.printText(processedText);
    }
}



