package com.company.SWING;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame4 extends JFrame implements ItemListener{
    JCheckBox c1, c2;
    JTextField tf;
    MyFrame4(){
        c1 = new JCheckBox("Chocolate");
        c2 = new JCheckBox("Ice-cream");
        tf = new JTextField(20);

        setLayout(new FlowLayout());

        add(c1);
        add(c2);
        add(tf);

        c1.addItemListener(this);
        c2.addItemListener(this);
    }


        @Override
        public void itemStateChanged(ItemEvent e) {
            String txt ="";
            if(c1.isSelected()){
                txt += c1.getText();
            }
            if(c2.isSelected()) {
                txt += " " + c2.getText();
            }
            if(txt.isEmpty()){
                tf.setText("Nothing is Selected");
            }else {
                tf.setText(txt + "\n");
            }
    }
}
public class JCheckBoxInSwing {
    public static void main(String []args){
        MyFrame4 f = new MyFrame4();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
