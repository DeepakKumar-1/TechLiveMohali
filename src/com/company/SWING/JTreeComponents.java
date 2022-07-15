package com.company.SWING;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;

class MyFrame7 extends JFrame{
    JTree tree;
    JLabel label;
    MyFrame7(){
        super("Tree Demo");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:\\CWH Python");
        File f = new File("C:\\CWH Python");
        for(File x : f.listFiles()){
            root.add(new DefaultMutableTreeNode(x.getName()));
        }

        tree = new JTree();
        label = new JLabel("No Files Selected");

        add(tree, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
    }
}

public class JTreeComponents {
    public static void main(String []args){
        MyFrame7 f = new MyFrame7();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
