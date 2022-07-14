package com.company.AWT;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.util.Date;

class MyFrame14 extends Frame implements KeyListener{
    Label l1, l2, l3, l4;
    MyFrame14(){
        super("Key Events");

        l1 = new Label("A");
        l2 = new Label("B");
        l3 = new Label("C");
        l4 = new Label("D");

        setLayout(null);

        l1.setBounds(30, 30, 100, 20);
        l2.setBounds(30, 60, 100, 20);
        l3.setBounds(30, 90, 100, 20);
        l4.setBounds(30, 120, 200, 20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l2.setText("Key Typed " + e.getKeyChar());
        l4.setText(String.valueOf(new Date(e.getWhen())));
        l3.setText("");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed " + e.getKeyChar());
        l3.setText("");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l3.setText("Key Released");
        l2.setText("");
        l1.setText("");
    }
}

public class HandlingKeyEvent {
    public static void main(String []args){
        MyFrame14 f = new MyFrame14();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
