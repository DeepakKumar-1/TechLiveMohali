package com.company.SWING;
import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
    JButton b;
    MyFrame(){
        super("First App");

        b = new JButton("Click");

        setLayout(new FlowLayout());

        add(b);
    }
}

public class FirstApp {
    public static void main(String []args){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
