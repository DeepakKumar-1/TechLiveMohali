package com.company.AWT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;


class MyFrame4 extends Frame implements TextListener, ActionListener {
    Label l1, l2;
    TextField tf;

    MyFrame4(){
        super("TextField Demo");
        l1 = new Label("No Text Entered. TextField is Blank");
        tf = new TextField(20);
        l2 = new Label("Enter Key is Not Yet Hit");
        setLayout(new FlowLayout());
        tf.setEchoChar('*');

        tf.addTextListener(this);
        tf.addActionListener(this);

        add(l1);
        add(tf);
        add(l2);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        l1.setText(tf.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
    }
}

public class TextFieldAndTextEvent {
    public static void main(String []args){
        MyFrame4 f = new MyFrame4();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
