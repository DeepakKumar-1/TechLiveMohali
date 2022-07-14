package com.company.AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame6 extends Frame implements ActionListener, ItemListener {
    String []days = {"Monday", "Tuesday", "Wednesday" , "Thursday", "Friday", "Saturday", "Sunday"};
    List l;
    TextArea ta;
    Button b;
    MyFrame6(){
        super("List Box");
        l = new List(5, true);
        ta = new TextArea(20, 20);
        b = new Button("Add Items");

        for(int i=0; i<days.length; i++) {
            l.add(days[i]);
        }

        add(l);
        add(b);
        add(ta);

//        l.addActionListener(this);
        b.addActionListener(this);
        l.addItemListener(this);
        setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String []list = l.getSelectedItems();
        String txt = "";
        for(String item : list){
            txt += "\n" + item;
        }
        ta.setText(txt);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
//        for(String item : l.getSelectedItems()) {
//            ta.setText(item);
//        }
//        String []list = l.getSelectedItems();
//        String txt = "";
//        for(String item : list){
//            txt += "\n" + item;
//        }
//        ta.setText(txt);
    }
}
public class ListBox {

    public static void main(String []args){
        MyFrame6 f = new MyFrame6();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
