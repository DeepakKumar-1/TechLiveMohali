import java.awt.*;
import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.event.*;
import java.text.NumberFormat;

class MyFrame extends JFrame implements ActionListener{
        JLabel l1, l2, l3;
        JFormattedTextField tf1, tf2, tf3;
        JButton b;
    public MyFrame(){

            l1 = new JLabel("Enter First Number: ");
            l2 = new JLabel("Enter Second Number: ");
            l3 = new JLabel("Result: ");
            b = new JButton("Submit");

            NumberFormat nf = NumberFormat.getInstance();
            NumberFormatter nft = new NumberFormatter(nf);
            tf1 = new JFormattedTextField(nft);
            tf2 = new JFormattedTextField(nft);
            tf3 = new JFormattedTextField(nft);
            // Setting Size of textFields
        tf1.setColumns(20);
        tf2.setColumns(20);
        tf3.setColumns(20);

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(b);
        b.addActionListener(this);

        setLayout(new FlowLayout());
    }

    public void actionPerformed(ActionEvent e){
        double num1 = Double.parseDouble(tf1.getText());
        double num2 = Double.parseDouble(tf2.getText());
        double ans = (num1 + num2);

        tf3.setText(ans+"");
    }

}

class Sum{
    public static void main(String []args){
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}