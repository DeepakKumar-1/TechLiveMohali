package com.company.AWT;
import java.awt.*;
import java.awt.event.*;

// Method 1 : Frame Class as Listener
//class MyFrame18 extends Frame implements ActionListener{
//    TextField tf;
//    Button b;
//    int count = 0;
//    MyFrame18(){
//        super("Event Demo");
//        tf = new TextField(count+"",20);
//        b  = new Button("Click");
//
//        setLayout(new FlowLayout());
//
//        add(tf);
//        add(b);
//        b.addActionListener(this);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        count++;
//        tf.setText(""+count);
//    }
//}


// Method 2 : Inner Class
//class MyFrame18 extends Frame{
//    TextField tf;
//    Button b;
//    int count = 0;
//    MyFrame18(){
//        super("Event Demo");
//        tf = new TextField(count+"",20);
//        b  = new Button("Click");
//
//        setLayout(new FlowLayout());
//
//        add(tf);
//        add(b);
//        b.addActionListener(new MyActionListener());
//    }
//
//     class MyActionListener implements ActionListener {
//         public void actionPerformed(ActionEvent e) {
//             count++;
//             tf.setText("" + count);
//         }
//     }
//}


//// Method 3 : Anonymous Class
//class MyFrame18 extends Frame{
//    TextField tf;
//    Button b;
//    int count = 0;
//    MyFrame18(){
//        super("Event Demo");
//        tf = new TextField(count+"",20);
//        b  = new Button("Click");
//
//        setLayout(new FlowLayout());
//
//        add(tf);
//        add(b);
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                count++;
//                tf.setText("" + count);
//            }
//        });
//    }
//}

// Method 4 : Lambda Expression

class MyFrame18 extends Frame{
    TextField tf;
    Button b;
    int count = 0;
    MyFrame18(){
        super("Event Demo");
        tf = new TextField(count+"",20);
        b  = new Button("Click");

        setLayout(new FlowLayout());

        add(tf);
        add(b);
        b.addActionListener((ActionEvent ae) ->  {
            count++;
            tf.setText("" + count);
        });
    }


}

public class DifferentWaysOfHandlingEvents {
    public static void main(String []args){
        MyFrame18 f = new MyFrame18();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
