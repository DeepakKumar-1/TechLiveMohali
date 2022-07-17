package com.company;
import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.lang.*;

class MyFrame extends JFrame {
    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24;
    JFormattedTextField tf;
    Double num1 = 0d, num2 = 0d, ans = 0d;
    String op; // Operator
//    JTextField num;
//    int ans = 0;

    MyFrame() {
        t = new JTextField(30);
        t.setEditable(false);
        add(t);

//        num = new JTextField(10);
//        add(num);

        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        tf = new JFormattedTextField(nft);
        tf.setColumns(10);
        tf.setFont(new Font(null, Font.BOLD, 50));
        tf.setEditable(false);
        tf.setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.add(t);
//        p1.add(num);
        p1.add(tf);
        add(p1, BorderLayout.NORTH);

        b1 = new JButton("%");

        b2 = new JButton("CE");
        b3 = new JButton("C");
        b4 = new JButton("<-");
        b5 = new JButton("1/x");
        b6 = new JButton("x²");
        b7 = new JButton("√x");
        b8 = new JButton("÷");
        b9 = new JButton("7");
        b10 = new JButton("8");
        b11 = new JButton("9");
        b12 = new JButton("x");
        b13 = new JButton("4");
        b14 = new JButton("5");
        b15 = new JButton("6");
        b16 = new JButton("-");
        b17 = new JButton("1");
        b18 = new JButton("2");
        b19 = new JButton("3");
        b20 = new JButton("+");
        b21 = new JButton("+/-");
        b22 = new JButton("0");
        b23 = new JButton(".");
        b24 = new JButton("=");

        // Setting Font Size
        b1.setFont(new Font(null, Font.BOLD, 20));
        b2.setFont(new Font(null, Font.BOLD, 20));
        b3.setFont(new Font(null, Font.BOLD, 20));
        b4.setFont(new Font(null, Font.BOLD, 20));
        b5.setFont(new Font(null, Font.BOLD, 20));
        b6.setFont(new Font(null, Font.BOLD, 20));
        b7.setFont(new Font(null, Font.BOLD, 20));
        b8.setFont(new Font(null, Font.BOLD, 20));
        b9.setFont(new Font(null, Font.BOLD, 20));
        b10.setFont(new Font(null, Font.BOLD, 20));
        b11.setFont(new Font(null, Font.BOLD, 20));
        b12.setFont(new Font(null, Font.BOLD, 20));
        b13.setFont(new Font(null, Font.BOLD, 20));
        b14.setFont(new Font(null, Font.BOLD, 20));
        b15.setFont(new Font(null, Font.BOLD, 20));
        b16.setFont(new Font(null, Font.BOLD, 20));
        b17.setFont(new Font(null, Font.BOLD, 20));
        b18.setFont(new Font(null, Font.BOLD, 20));
        b19.setFont(new Font(null, Font.BOLD, 20));
        b20.setFont(new Font(null, Font.BOLD, 20));
        b21.setFont(new Font(null, Font.BOLD, 20));
        b22.setFont(new Font(null, Font.BOLD, 20));
        b23.setFont(new Font(null, Font.BOLD, 20));
        b24.setFont(new Font(null, Font.BOLD, 20));


        // Setting Colors to Buttons
        b9.setBackground(Color.WHITE);
        b9.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e)  {
                b9.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b9.setBackground(Color.WHITE);
            }
        });
        b10.setBackground(Color.WHITE);
        b10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b10.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b10.setBackground(Color.WHITE);
            }
        });

        b11.setBackground(Color.WHITE);
        b11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b11.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b11.setBackground(Color.WHITE);
            }
        });
        b13.setBackground(Color.WHITE);
        b13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b13.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b13.setBackground(Color.WHITE);
            }
        });
        b14.setBackground(Color.WHITE);
        b14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b14.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b14.setBackground(Color.WHITE);
            }
        });
        b15.setBackground(Color.WHITE);
        b15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b15.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b15.setBackground(Color.WHITE);
            }
        });
        b17.setBackground(Color.WHITE);
        b17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b17.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b17.setBackground(Color.WHITE);
            }
        });
        b18.setBackground(Color.WHITE);
        b18.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b18.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b18.setBackground(Color.WHITE);
            }
        });
        b19.setBackground(Color.WHITE);
        b19.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b19.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b19.setBackground(Color.WHITE);
            }
        });
        b21.setBackground(Color.WHITE);
        b21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b21.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b21.setBackground(Color.WHITE);
            }
        });
        b22.setBackground(Color.WHITE);
        b22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b22.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b22.setBackground(Color.WHITE);
            }
        });
        b23.setBackground(Color.WHITE);
        b23.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b23.setBackground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b23.setBackground(Color.WHITE);
            }
        });

        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);
        p.add(b18);
        p.add(b19);
        p.add(b20);
        p.add(b21);
        p.add(b22);
        p.add(b23);
        p.add(b24);
        p.setLayout( new GridLayout(6, 4));

        add(p, BorderLayout.CENTER);

//        setLayout(new FlowLayout());

        // Adding Action Listeners

        b5.addActionListener((ActionEvent ae) -> {
            double temp = 1 / Double.parseDouble(tf.getText());
            String txt = temp + "";
            tf.setText(txt);
            t.setText(txt);
            num1 = temp;
        });
        b6.addActionListener((ActionEvent ae) -> {
            double temp = Math.pow(Double.parseDouble(tf.getText()), 2);
            String txt = temp + "";
            tf.setText(txt);
            t.setText(txt);
            num1 = temp;
        });

        b7.addActionListener((ActionEvent ae) -> {
            double temp = Math.sqrt(Double.parseDouble(tf.getText()));
            String txt = temp + "";
            tf.setText(txt);
            t.setText(txt);
            num1 = temp;
        });

        b8.addActionListener((ActionEvent ae) -> {
            num1 = Double.parseDouble(tf.getText());
//            num.setText(tf.getText());
            tf.setText("0");
            t.setText(t.getText() + b8.getText());
        });

        b12.addActionListener((ActionEvent ae) -> {
            num1 = Double.parseDouble(tf.getText());
//           num.setText(tf.getText());
            tf.setText("0");
            t.setText(t.getText() + b12.getText());

        });

        b16.addActionListener((ActionEvent ae) -> {
            num1 = Double.parseDouble(tf.getText());
//           num.setText(tf.getText());
            tf.setText("0");
            t.setText(t.getText() + b16.getText());
//            ans = num1 - num2;
        });

        b20.addActionListener((ActionEvent ar) -> {
            num1 = Double.parseDouble(tf.getText());
//           num.setText(tf.getText());
            tf.setText("0");
            t.setText(t.getText() + b20.getText());
//            ans = num1 + num2;
        });

        b21.addActionListener((ActionEvent ae) ->{
            Double n = -Double.parseDouble(tf.getText());
            tf.setText(n+"");
            t.setText(n+"");
        } );

        b3.addActionListener((ActionEvent ae) -> {
            t.setText("0");
            tf.setText("0");
        });

        b9.addActionListener((ActionEvent ae) -> {
            tf.setText(tf.getText() + b9.getText());
            t.setText(t.getText() + b9.getText());
        });

        b10.addActionListener((ActionEvent ae) -> {
            tf.setText(tf.getText() + b10.getText());
            t.setText(t.getText() + b10.getText());
        });

        b11.addActionListener((ActionEvent ae) -> {
            tf.setText(tf.getText() + b11.getText());
            t.setText(t.getText() + b11.getText());
        });

        b13.addActionListener((ActionEvent ae) -> {
            tf.setText(tf.getText() + b13.getText());
            t.setText(t.getText() + b13.getText());
        });

        b14.addActionListener((ActionEvent ae) -> {
            tf.setText(tf.getText() + b14.getText());
            t.setText(t.getText() + b14.getText());
        });

        b15.addActionListener((ActionEvent ae) -> {
            tf.setText(tf.getText() + b15.getText());
            t.setText(t.getText() + b15.getText());
        });

        b17.addActionListener((ActionEvent ae) -> {
            tf.setText(tf.getText() + b17.getText());
            t.setText(t.getText() + b17.getText());
        });

        b18.addActionListener((ActionEvent ae) -> {
            tf.setText(tf.getText() + b18.getText());
            t.setText(t.getText() + b18.getText());
        });

        b19.addActionListener((ActionEvent ae) -> {
            tf.setText(tf.getText() + b19.getText());
            t.setText(t.getText() + b19.getText());
        });

        b22.addActionListener((ActionEvent ae) -> {
            tf.setText(tf.getText() + b22.getText());
            t.setText(t.getText() + b22.getText());
        });

        b23.addActionListener((ActionEvent ae) -> {
            tf.setText(tf.getText() + b23.getText());
            t.setText(t.getText() + b23.getText());
        });

        b24.addActionListener((ActionEvent) -> {
            if (t.getText().contains("+")) {
//                String s = num.getText();
//                ans = (Double.parseDouble(s) + Double.parseDouble(tf.getText()));
                num2 =  Double.parseDouble(tf.getText());
                ans = (double)Math.addExact(num1.longValue(), num2.longValue());
                System.out.println(ans);
            }

            if (t.getText().contains("-")) {
//                String s = num.getText();
//                ans = (Double.parseDouble(s) - Double.parseDouble(tf.getText()));
                num2 =  Double.parseDouble(tf.getText());
                ans = (double)Math.subtractExact(num1.longValue(), num2.longValue());
                System.out.println(ans);
            }

            if (t.getText().contains("x")) {
//                String s = num.getText();
//                ans = (Double.parseDouble(s) * Double.parseDouble(tf.getText()));
                num2 =  Double.parseDouble(tf.getText());
                ans = (double)Math.multiplyExact(num1.longValue(), num2.longValue());
                System.out.println(ans);
            }

            if (t.getText().contains("÷")) {
//                String s = num.getText();
//                ans = (Double.parseDouble(s) / Double.parseDouble(tf.getText()));
                num2 = Double.parseDouble(tf.getText());
                ans = (double)Math.floorDiv(num1.longValue(), num2.longValue());
                System.out.println(ans);
            }


            t.setText(t.getText() + b24.getText());
            tf.setText(ans + "");
            t.setText(ans + "");
//            num.setText(ans+"");
        });

        b4.addActionListener((ActionEvent ae) -> {
            String txt = tf.getText();
            if (txt.length() == 1) {
                tf.setText("0");
                t.setText("0");
            } else {
                String newTxt = txt.substring(0, txt.length() - 1);
                tf.setText(newTxt);
                t.setText(newTxt);
            }
        });
    }
}
public class Calculator {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}