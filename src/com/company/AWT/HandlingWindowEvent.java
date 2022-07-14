package com.company.AWT;
import java.awt.*;
import java.awt.event.*;

class MyFrame16 extends Frame {
    Label l;
    MyFrame16(){
        super("Window Event");
        setLayout(new FlowLayout());
        l = new Label("");
        add(l);
    }
}

public class HandlingWindowEvent {
    public static void main(String []args){
        MyFrame16 f = new MyFrame16();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
