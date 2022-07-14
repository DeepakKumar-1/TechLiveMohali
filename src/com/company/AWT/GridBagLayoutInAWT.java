package com.company.AWT;
import java.awt.*;

class MyFrame12 extends Frame{
    Button b1, b2, b3, b4, b5;
    MyFrame12(){
        super("Grid Bag Layout");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");

        GridBagLayout gb = new GridBagLayout();
        setLayout(gb);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(b1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(b2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(b3, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        add(b4, gbc);

        add(b5);
    }
}
public class GridBagLayoutInAWT {
    public static void main(String []args){
        MyFrame12 f = new MyFrame12();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
