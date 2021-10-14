package swingsDemo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class SwingJframe extends JFrame {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JPanel p=new JPanel();
    JComboBox jc;
    SwingJframe(){
        super("SwingDemo2");
        setSize(500,1000);
        
        JMenu menu,submenu;
        JMenuBar jm=new JMenuBar();
        menu=new JMenu("Menu");
        submenu=new JMenu("Submenu");

        JMenuItem i1,i2,i3,i4;
        i1=new JMenuItem("Item1");
        i2=new JMenuItem("Item2");
        i3=new JMenuItem("Item3");
        i4=new JMenuItem("Item4");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);

        menu.add(submenu);
        jm.add(menu);
        add(jm);
        // p.setBounds(30,30,370,370);
        // p.setBackground(Color.DARK_GRAY);
        // add(p);
        // p.setLayout(new GridLayout(5,1 ));
        String country[]={"India","Australia","USA","England","Newzealand"};
        jc=new JComboBox(country);
        jc.setSize(100,30);
        add(jc);
        String data[][]={{"1","nanda","500000"},
                        {"2","kumar","555555"},
                    {"3","nk","988888"}};
        String column[]={"ID","Name","Salary"};
        JTable jt=new JTable(data,column);
        JScrollPane sp=new JScrollPane(jt);
        
        JFileChooser jf=new JFileChooser();
        add(jf);
        add(jt);
        add(sp);
        JPopupMenu jp=new JPopupMenu("Edit");
        jp.add(i1);
        jp.add(i2);
        jp.add(i3);
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                jp.show(jt, e.getX(), e.getY());
            }
        });
        progress jpro=new progress();
        jpro.jpro.setSize(300,50);
        add(jpro.jpro);
        jpro.jpro.setVisible(true);
        jpro.iterate();
        JOptionPane.showMessageDialog(this,"Hello,world");
        setVisible(true);
        setLayout(new GridLayout(10,1));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    public static void main(String[] args) {
        new SwingJframe();
    }
}

class progress{
    JProgressBar jpro;
    progress(){
        
        jpro=new JProgressBar(0,2000);
    }
    public void iterate(){
        int i=0;
        while( i<=2000){
            jpro.setValue(i);
            i=i+20;
            try{
                Thread.sleep(150);
            }catch(Exception e){}
        }
    }
}