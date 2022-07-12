package com.company.AWT;
import java.awt.*;

class MyFrame extends Frame{
    Label l;
    TextField tf;
    Button b;

    MyFrame(){
        // super is used to call Parent Class Constructor
        super("My App");
        setLayout(new FlowLayout());

        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("Click");

        add(l);
        add(tf);
        add(b);
    }
}

public class SecondApp {
    public static void main(String []args){
    MyFrame f = new MyFrame();
    f.setSize(200, 200);
    f.setVisible(true);
    }
}
