package com.company.AWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame13 extends Frame implements ItemListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Choice c;
    Panel main, p1, p2, p3;
    CardLayout cl;
    MyFrame13(){
        super("card Layout");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");
        b7 = new Button("Seven");
        b8 = new Button("Eight");
        b9 = new Button("Nine");

        c = new Choice();
        c.add("One");
        c.add("Two");
        c.add("Three");
        c.addItemListener(this);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);

        p3 = new Panel();
        p3.add(b7);
        p3.add(b8);
        p3.add(b9);

        main = new Panel();
        cl = new CardLayout();
        main.setLayout(cl);

        main.add("One", p1);
        main.add("Two", p2);
        main.add("Three", p3);

        add(c, BorderLayout.NORTH);
        add(main, BorderLayout.CENTER);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c.getSelectedItem().equals("One")){
            cl.first(main);
        }
        if(c.getSelectedItem().equals("Two")){
            cl.next(main);
        }
        if(c.getSelectedItem().equals("Three")){
            cl.next(main);
        }
    }
}

public class CardLayoutInAWT {
    public static void main(String []args){
        MyFrame13 f = new MyFrame13();
        f.setSize(500, 500);
        f.setVisible(true);

    }
}
