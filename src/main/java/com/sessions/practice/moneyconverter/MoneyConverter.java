package com.sessions.practice.moneyconverter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoneyConverter {

    public static void converter() {
        JFrame f = new JFrame("CurrencyConverter");
        JLabel label1 = new JLabel("Euro");
        JLabel label2 = new JLabel("Lei");

        JTextField eurotxt = new JTextField(10);
        JTextField leitxt = new JTextField(10);

        JButton fromEToL = new JButton("Convert Euro in Lei");


        JButton fromLToE = new JButton("Convert Lei in Euro");

        JButton clear = new JButton("CLEAR");


        fromEToL.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        String eText = eurotxt.getText();
                        double euro = Double.parseDouble(eText);
                        double lei = euro * 4.96;
                        leitxt.setText(String.valueOf(lei));
                    }
                }
        );

        fromLToE.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        String lText = leitxt.getText();
                        double lei = Double.parseDouble(lText);
                        double euro = lei / 4.96;
                        eurotxt.setText(String.valueOf(euro));
                    }
                }
        );

        clear.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {


                        leitxt.setText("");
                        eurotxt.setText("");
                    }
                }
        );


        f.add(label1);
        f.add(eurotxt);
        f.add(fromEToL);

        f.add(label2);
        f.add(leitxt);
        f.add(fromLToE);
        f.add(clear);

        f.setLayout(new FlowLayout());
        f.setSize(400, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        converter();
    }
}


