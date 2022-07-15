package com.company.SWING;
import javax.swing.*;
import java.awt.*;

class MyFrame8 extends JFrame{
    JSlider sl;
    JProgressBar pb;
    MyFrame8(){
        sl = new JSlider(0, 100, 50);
        pb = new JProgressBar();

//        sl.setMajorTicksSpacing(10);
//        sl.setMinorTicksSpacing(1);

        setLayout(new FlowLayout());

        add(sl);
        add(pb);
    }
}
public class JSliderAndJProgressBar {
    public static void main(String []args){
        MyFrame8 f = new MyFrame8();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
