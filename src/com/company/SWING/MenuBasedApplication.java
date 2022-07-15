package com.company.SWING;
import javax.swing.*;
import java.awt.*;


class MyFrame1 extends JFrame{
    JMenu m;
    JMenuItem file, open, close;
    JMenuBar mb;
    MyFrame1(){
        super("Menu Bar");

        file = new JMenuItem("File");
        open = new JMenuItem("Open");
        close = new JMenuItem("Close");

        m = new JMenu();

        m.add(file);
        m.add(open);
        m.add(close);

        mb = new JMenuBar();
        mb.add(m);
        setLayout(new FlowLayout());
        setJMenuBar(mb);
    }
}

public class MenuBasedApplication {
    public static void main(String []args){
        MyFrame1 f = new MyFrame1();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
