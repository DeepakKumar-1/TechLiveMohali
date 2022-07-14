package com.company.AWT;
import java.awt.*;

class MyFrame10 extends Frame{
    Button b1, b2, b3, b4, b5;

    MyFrame10(){
        super("Border Layout");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");

        BorderLayout bl = new BorderLayout();
        setLayout(bl);

        add(b1, bl.NORTH);
//        add(b2, bl.EAST);
        add(b3, bl.WEST);
        add(b4, bl.SOUTH);
        add(b5, bl.CENTER);

        Panel panel = new Panel();
        panel.add(new Button("Mon"));
        panel.add(new Button("Tue"));
        panel.add(new Button("Wed"));

        add(panel, bl.EAST);
    }
}

public class BorderLayoutInAWT {
    public static void main(String []args){
        MyFrame10 f = new MyFrame10();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
