package com.sessions.practice.temperatureconverter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverterGUI {

    //declare the GUI elements
    public static JFrame frmMain;

    public static JLabel lblCelsius;
    public static JLabel lblFahrenheit;
    public static JLabel lblKelvin;

    public static JTextField textCelsius;
    public static JTextField textFahrenheit;
    public static JTextField textKelvin;


    public static JButton btnCalculateCToF;
    public static JButton btnCalculateFToC;
    public static JButton btnCalculateCToK;
    public static JButton btnCalculateKToC;
    public static JButton btnCalculateKToF;
    public static JButton btnCalculateFToK;

    public static JButton btnClear;

    public static void main(String[] args) {

        // Set up the frame
        frmMain = new JFrame("Temperature converter");
        frmMain.setSize(400, 500);
        frmMain.setLayout(new FlowLayout());

        // Create GUI elements
        lblCelsius = new JLabel("Celsius:");
        textCelsius = new JTextField(10); //10 is the number of columns of this text field

        lblFahrenheit = new JLabel("Fahrenheit: ");
        textFahrenheit = new JTextField(10);

        lblKelvin = new JLabel("Kelvin: ");
        textKelvin = new JTextField(10);

        // Button to convert from Celsius to Fahrenheit
        btnCalculateCToF = new JButton("Convert C to F");

        // Add ActionListener
        btnCalculateCToF.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Convert C to F
                        String cText = textCelsius.getText(); // atribuie variabilei cText orice e introdus in casuta textCelsius
                        double c = Double.parseDouble(cText); // functia pareDouble converteste string-ul in double
                        double f = (c * 9 / 5) +32;
                        textFahrenheit.setText(String.valueOf(f)); // valoarea obtinuta prin conversie e atribuita casutei f
                        // pt afisare

                    }
                }
        );



        // Button to convert from Fahrenheit to Celsius
        btnCalculateFToC = new JButton("Convert F to C");

        // Add ActionListener
        btnCalculateFToC.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Convert F to C
                        String fText = textFahrenheit.getText(); // atribuie variabilei cText orice e introdus in casuta textCelsius
                        double f = Double.parseDouble(fText); // functia pareDouble converteste string-ul in double
                        double c = (f - 32)*5/9;
                        textCelsius.setText(String.valueOf(c)); // valoarea obtinuta prin conversie e atribuita casutei f
                        // pt afisare

                    }
                }
        );


        // Button to convert from Celsius to Kelvin
        btnCalculateCToK = new JButton("Convert C to K");

        // Add ActionListener
        btnCalculateCToK.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Convert C to K
                        String cText = textCelsius.getText(); // atribuie variabilei cText orice e introdus in casuta textCelsius
                        double c = Double.parseDouble(cText); // functia pareDouble converteste string-ul in double
                        double k = c + 273.15;
                        textKelvin.setText(String.valueOf(k)); // valoarea obtinuta prin conversie e atribuita casutei f
                        // pt afisare

                    }
                }
        );

        // Button to convert from Kelvin to Celsius
        btnCalculateKToC = new JButton("Convert K to C");

        // Add ActionListener
        btnCalculateKToC.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Convert K to C
                        String kText = textKelvin.getText();
                        double k = Double.parseDouble(kText);
                        double c = k - 273.15;
                        textCelsius.setText(String.valueOf(c));

                    }
                }
        );



        // Button to convert From Kelvin to Fahrenheit
        btnCalculateKToF = new JButton("Convert K to F");

        // Add ActionListener
        btnCalculateKToF.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Convert K to F
                        String kText = textKelvin.getText();
                        double k = Double.parseDouble(kText);
                        double f = (k - 273.15)* 9 / 5 + 32;
                        textFahrenheit.setText(String.valueOf(f));

                    }
                }
        );


        // Button to convert From Fahrenheit to Kelvin
        btnCalculateFToK = new JButton("Convert F to K");

        // Add ActionListener
        btnCalculateFToK.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Convert F to K
                        String fText = textFahrenheit.getText();
                        double f = Double.parseDouble(fText);
                        double k = (f + 459.67) * 5 / 9; ;
                        textKelvin.setText(String.valueOf(k));

                    }
                }
        );

        // Button to clear all the text fields
        btnClear = new JButton("Clear");

        // Add ActionListener
        btnClear.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textCelsius.setText(" ");
                        textFahrenheit.setText(" ");
                        textKelvin.setText(" ");
                    }
                }
        );


        //Add the GUI elements to the frame
        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);

        frmMain.add(lblFahrenheit);
        frmMain.add(textFahrenheit);

        frmMain.add(lblKelvin);
        frmMain.add(textKelvin);

        frmMain.add(btnCalculateCToF);
        frmMain.add(btnCalculateFToC);

        frmMain.add(btnCalculateCToK);
        frmMain.add(btnCalculateKToC);

        frmMain.add(btnCalculateKToF);
        frmMain.add(btnCalculateFToK);

        frmMain.add(btnClear);

        //Make the frame visible
        frmMain.setVisible(true);
    }
}
