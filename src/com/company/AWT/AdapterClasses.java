package com.company.AWT;
import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class MyFrame17 extends Frame {
    MyFrame17() {
        super("Adapter Class Demo");
        addWindowListener(new MyWindowAdapter());
    }
}
public class AdapterClasses {
    public static void main(String []args){
        MyFrame17 f = new MyFrame17();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
