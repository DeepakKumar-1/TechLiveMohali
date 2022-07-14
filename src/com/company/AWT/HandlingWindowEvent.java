package com.company.AWT;
import java.awt.*;
import java.awt.event.*;

class MyFrame16 extends Frame implements  WindowListener{
    Label l;
    MyFrame16(){
        super("Window Event");
        setLayout(new FlowLayout());
        l = new Label("");
        add(l);
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }
}

public class HandlingWindowEvent {
    public static void main(String []args){
        MyFrame16 f = new MyFrame16();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
