package com.company.SWING;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;


class MyFrame1 extends JFrame{
    JMenu file;
    JMenuItem open, save, close;
    JMenuBar mb;
    JTextField tf;
    MyFrame1(){
        super("Menu Bar");

        save = new JMenuItem("Save");
        open = new JMenuItem("Open");
        close = new JMenuItem("Close");

        file = new JMenu("File");
        file.add(open);
        file.add(save);
        file.add(close);

        mb = new JMenuBar();
        mb.add(file);
        setLayout(new FlowLayout());
        tf = new JTextField("", 20);
        add(tf);
        setJMenuBar(mb);
    }
}

public class MenuBasedApplication {
    public static void main(String []args){
        MyFrame1 f = new MyFrame1();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
