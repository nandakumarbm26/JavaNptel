package swingsDemo;
import java.awt.Color;
import  java.awt.FlowLayout;
import javax.swing.*;
public class SwingDemo {
    public static void main(String[] args) {
        JFrame f=new JFrame("Hello,world!");
        JPanel p=new JPanel();
        p.setBackground(Color.GREEN);
        p.setBounds(50,50,100,100);
        
        p.setLayout(new FlowLayout());
        JLabel l=new JLabel("JFrame by swings");
        JButton b=new JButton();
        b.setText("Button");
        JButton b2=new JButton();
        b.setBackground(Color.yellow);
        b2.setText("Button2");
     
        p.add(l);
        p.add(b);
        p.add(b2);
        f.add(p);
        f.setSize(200,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
