package com.company.AWT;
import java.awt.*;

class MyFrame11 extends Frame{
    Button b1, b2, b3, b4, b5;
    MyFrame11(){
        super("Grid Layout");
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");

        setLayout(new GridLayout(3, 2));

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }
}
public class GridLayoutInAWT {
    public static void main(String []args){
        MyFrame11 f = new MyFrame11();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
