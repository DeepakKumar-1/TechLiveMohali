package com.company.AWT;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame20 extends Frame{
    int x, y;
    
    MyFrame20(){
        super("Painting");

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Times New Roman", Font.BOLD, 50));
        g.drawString("Hello", x, y);
//        g.drawOval(x, y, 50, 50);
    }
}

public class PaintingColorAndFont {
    public static void main(String []args){
        MyFrame20 f = new MyFrame20();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
