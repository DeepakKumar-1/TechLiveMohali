package com.company.AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame7 extends Frame implements ActionListener {
    Choice c;
    Button b;
    TextArea ta;
    String []list = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    MyFrame7(){
        super("List Box");
        c = new Choice();
        b = new Button("Add Item");
        ta = new TextArea(20, 20);
        for(String item : list){
            c.add(item);
        }

        setLayout(new FlowLayout());
        b.addActionListener(this);

        add(c);
        add(ta);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ta.setText(c.getSelectedItem());
    }
}
public class ChoiceBox {
    public static void main(String []args){
        MyFrame7 f = new MyFrame7();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
