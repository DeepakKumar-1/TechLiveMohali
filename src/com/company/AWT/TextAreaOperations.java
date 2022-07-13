package com.company.AWT;
import java.awt.*;
import java.awt.event.*;

class MyFrame5 extends Frame implements ActionListener{
    TextArea ta;
    Label l;
    TextField tf;
    Button b;
    MyFrame5(){
        super("Text Area Operations");
        ta = new TextArea(10, 30);
        l = new Label();
        tf = new TextField(20);
        b = new Button("Click");
        add(ta);
        add(l);
        add(tf);
        add(b);
        setLayout(new FlowLayout());

        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        l.setText(ta.getSelectedText());
//        ta.append(tf.getText());
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
}

public class TextAreaOperations {
    public static void main(String []args){
        MyFrame5 f = new MyFrame5();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
