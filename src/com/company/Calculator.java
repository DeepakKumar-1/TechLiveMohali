package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame extends JFrame{
    TextArea ta;
    JButton b1, b2, b3, b4, b5, b6, b7;
    int ans = 0;
    MyFrame(){
        ta = new TextArea(5, 60);
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("+");
        b7 = new JButton("=");
        add(ta);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);

        setLayout(new FlowLayout());

    }

    class MyActionListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String str = ta.getText();
        }
    }

    class MyTextListener implements TextListener{

        @Override
        public void textValueChanged(TextEvent e) {
            ta.getText();
            int sol = 0;
            if()
        }
    }
}
public class Calculator {
    public static void main(String []args){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
