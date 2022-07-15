package com.company.SWING;
import javax.swing.*;
import java.awt.*;

class MyFrame3 extends JFrame{
    JTextField tf;
    MyFrame3(){
        super("JTextField");
        tf = new JTextField(30);
        add(tf);

        setLayout(new FlowLayout());
    }
}
public class JTextFieldInSwing {
    public static void main(String []args){
        MyFrame3 f = new MyFrame3();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
