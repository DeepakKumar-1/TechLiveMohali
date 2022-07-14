package com.company.AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

class MyFrame19 extends Frame {
    Menu file, sub;
    MenuItem open, save, close, closeAll;
    CheckboxMenuItem auto;
    TextField tf;
    MenuBar mb;

    MyFrame19(){
        super("Menu Demo");
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeAll = new MenuItem("Close All");

        auto = new CheckboxMenuItem("Auto Save");

        file = new Menu("File");
        sub = new Menu("Close");

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeAll);

        mb = new MenuBar();
        mb.add(file);

        setMenuBar(mb);
        tf = new TextField(20);
        add(tf);

        setLayout(new FlowLayout());

        open.addActionListener((ActionEvent ae) -> tf.setText("Open"));
        save.addActionListener((ActionEvent ae) -> tf.setText("Save"));
        close.addActionListener((ActionEvent ae) -> tf.setText("Close"));
        closeAll.addActionListener((ActionEvent ae) -> tf.setText("Close All"));
        auto.addItemListener((ItemEvent ie) -> { if(auto.getState()){
            tf.setText("Auto Save On");
        } else{
            tf.setText("Auto Save Off");
        }
        });
    }
}
public class Menus {
    public static void main(String []args){
        MyFrame19 f = new MyFrame19();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
