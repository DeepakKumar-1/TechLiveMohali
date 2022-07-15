package com.company.SWING;
import javax.swing.*;
import java.awt.*;

class MyFrame9 extends JFrame{
    JToolBar tb;
    JButton b1, b2, b3, b4, b5, b6, b7;
    JTextArea ta;
    MyFrame9(){
        super("ToolBar Demo");

        tb = new JToolBar();
        b1 = new JButton("Open");
        b2 = new JButton("Save");

        setLayout(new FlowLayout());

        tb.add(b1);
        tb.add(b2);
        add(tb);
    }
}
public class JToolBarAndJMenuBar {
    public static void main(String []args){
        MyFrame9 f = new MyFrame9();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
