package com.company.AWT;
import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame implements ItemListener{
    Label l;
    Checkbox c1, c2, c3;
    public MyFrame2(){
        super("Item Listener");
        l = new Label("Nothing is Selected");
        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("C#");
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        add(l);
        add(c1);
        add(c2);
        add(c3);
        setLayout(new FlowLayout());
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String labelData = "";
        if(c1.getState()){
            labelData += "  " + c1.getLabel() + "\n";
//            l.setText(labelData);
        }
        if(c2.getState()){
            labelData +=  "  " + c2.getLabel();
//            l.setText(labelData);
        }
        if(c3.getState()){
            labelData += "  " + c3.getLabel();
//            l.setText(labelData);
        }
        if(labelData.isEmpty()){
            l.setText("Nothing is Selected");
        }else {
            l.setText(labelData + "\n");
        }
    }
}
public class CheckBoxAndItemListener {
    public static void main(String []args){
        MyFrame2 f = new MyFrame2();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
