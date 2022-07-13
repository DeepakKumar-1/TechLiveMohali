package com.company.AWT;
import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame implements ItemListener{
    Label l;
    Checkbox c1, c2, c3;
    CheckboxGroup cbg;
    MyFrame3(){
        cbg = new CheckboxGroup();
        l = new Label("Nothing is Selected");
        c1 = new Checkbox("Java", false, cbg);
        c2 = new Checkbox("Python", false, cbg);
        c3 = new Checkbox("C#", false, cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);

    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        String labelData = "";
        if(c1.getState()){
            labelData += "  " + c1.getLabel();
        }
        if(c2.getState()){
            labelData += "  " + c2.getLabel();
        }
        if(c3.getState()){
            labelData += "  " + c3.getLabel();
        }
        if(labelData.isEmpty()){
            labelData = "Nothing is Selected";
        }
        l.setText(labelData);
    }
}
public class RadioButtonAndItemListener {
    public static void main(String []args){
        MyFrame3 f = new MyFrame3();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
