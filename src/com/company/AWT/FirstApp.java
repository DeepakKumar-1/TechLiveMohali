package com.company.AWT;
import java.awt.*;
public class FirstApp {
    public static void main(String []args){
        Frame f = new Frame("My First App");
        f.setLayout(new FlowLayout());

        Button b  = new Button("Click");
        Label l = new Label("Name");
        TextField tf = new TextField(20);
        tf.setText("Enter Your Name");
       

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(500, 500);
        f.setVisible(true);
    }
}
