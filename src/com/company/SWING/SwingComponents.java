package com.company.SWING;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame2 extends JFrame {
    JLabel l;
    JButton b;
    int count = 0;
    MyFrame2(){
        super("On Click Demo");

        l = new JLabel(count + "");
        b = new JButton("Click");
        setLayout(new FlowLayout());

        add(l);
        add(b);

        b.addActionListener(new MyActionListener());
        l.setToolTipText("Counter");

    }

    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            count++;
            l.setText(count + "");
        }
    }
}

public class SwingComponents {
    public static void main(String []args){
        MyFrame2 f = new MyFrame2();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
