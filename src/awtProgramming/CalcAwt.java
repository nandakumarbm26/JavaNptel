package awtProgramming;
import java.awt.event.*;



import java.awt.*;
public class CalcAwt extends Frame implements ActionListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    TextField t1,t2,t3;
    Button b1,b2,b3;
    Label l1,l2,l3;

    CalcAwt(){
        t1=new TextField();
        t1.setBounds(50,50,100,20);
        t2=new TextField();
        t2.setBounds(50,100,100,20);
        t3=new TextField();
        t3.setBounds(50,150,100,20);
        t3.setEditable(false);

        l1=new Label();
        l1.setText("input 1 :");
        l2=new Label();
        l2.setText("input 2 :");
        l3=new Label();
        l3.setText("Result :");

        b1=new Button("+");
        b2=new Button("-");
        b1.setBounds(50,200,50,50);
        b2.setBounds(150,200,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);

        setSize(300,300);
        setLayout(new GridLayout(4,2));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String s1=t1.getText();
        String s2=t2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }   
        else if(e.getSource()==b2){
            c=a-b;
        }
        String result=String.valueOf(c);
        t3.setText(result);
    }
    

    public static void main(String[] args) {
        new CalcAwt();
    }
}
