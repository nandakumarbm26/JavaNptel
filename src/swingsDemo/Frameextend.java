package swingsDemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Frameextend extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    Frameextend(){
        super("Hello,world");
        JButton b=new JButton(new ImageIcon("E:\\note7\\Pics\\img.jpg"));
        JLabel l=new JLabel("Aram enri elru!");
        l.setHorizontalTextPosition(JLabel.CENTER);
        b.setText("Hegidira!");
        b.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                l.setText("Button othbitteno");
                JOptionPane.showMessageDialog(null, "Eno nindu golu!", "eno madu guru", JOptionPane.ERROR_MESSAGE);
            }
        });
        super.add(b);
        
        
        super.add(l);

        super.setSize(300,300);
        super.setLayout(new GridLayout(2,1));
        super.setVisible(true);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Frameextend();
    }
}
