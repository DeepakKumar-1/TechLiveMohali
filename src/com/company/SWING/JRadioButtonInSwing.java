package com.company.SWING;
import javax.swing.*;
import java.awt.*;

class MyFrame5 extends JFrame{
    JRadioButton b1, b2;
    ButtonGroup bg;
    MyFrame5(){
        super("JRadio Button");

        b1 = new JRadioButton("Chocolate");
        b2 = new JRadioButton("Ice-Cream");

        bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);

        add(b1);
        add(b2);

        setLayout(new FlowLayout());
    }
}
public class JRadioButtonInSwing {
    public static void main(String []args){
        MyFrame5 f = new MyFrame5();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
