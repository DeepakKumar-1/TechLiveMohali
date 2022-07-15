package com.company.SWING;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

class MyFrame6 extends JFrame{
    Label l;
    TextField tf;
    Button b;
    JPanel p;
    MyFrame6(){
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("OK");
        p = new JPanel();

        setLayout(new FlowLayout());

        p.add(l);
        p.add(tf);
        p.add(b);

        Border bd = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.CENTER, TitledBorder.TOP);
        p.setBorder(bd);

        add(p);
    }
}
public class BordersInSwing {
    public static void main(String []args){
        MyFrame6 f = new MyFrame6();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
