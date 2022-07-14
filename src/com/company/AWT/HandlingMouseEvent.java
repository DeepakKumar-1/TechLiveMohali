package com.company.AWT;
import java.awt.*;
import java.awt.event.*;

class MyFrame15 extends Frame implements MouseListener, MouseMotionListener{
    Label l, l2;
    MyFrame15(){
        super("Mouse Events");

        l2 = new Label("");
        l = new Label("");
        l.setBounds(20, 50, 100, 20);
        l2.setBounds(20, 80, 100, 20);
        add(l);
        add(l2);


        setLayout(null);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged ");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Move ");
        l2.setText("( " + e.getX() + ", " + e.getY() + " )");
    }
}
public class HandlingMouseEvent {
    public static void main(String []args){
        MyFrame15 f = new MyFrame15();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
