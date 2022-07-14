package com.company.AWT;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class MyFrame8 extends Frame implements AdjustmentListener {
    Scrollbar red, green, blue;
    TextField tf;

    MyFrame8(){
        super("Title");

        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        tf = new TextField(20);

        setLayout(null);

        tf.setBounds(50, 50, 300, 30);
        red.setBounds(50, 150, 300, 30);
        green.setBounds(50, 200, 300, 30);
        blue.setBounds(50, 250, 300, 30);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

        add(tf);
        add(red);
        add(green);
        add(blue);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
    }
}

public class ScrollBarAndAdjustmentEvent {
    public static void main(String []args){
        MyFrame8 f = new MyFrame8();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
