package com.company.AWT;
import java.awt.*;

class MyFrame9 extends Frame{
    Button b1, b2, b3, b4, b5;
    MyFrame9() {
        super("Flow Layout");
        
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        setLayout(new FlowLayout());
    }
}
public class FlowLayoutInAWT {
    public static void main(String []args){
        MyFrame9 f = new MyFrame9();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
