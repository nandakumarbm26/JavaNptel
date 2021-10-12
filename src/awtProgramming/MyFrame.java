package awtProgramming;
import java.awt.*;
public class MyFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame=new Frame("Frame in java");
		Panel panel=new Panel();
		frame.resize(500,500);
		frame.setBackground(Color.lightGray);
		
		panel.resize(400,400);
		panel.setBounds(50, 50, 400, 400);
		panel.setBackground(Color.GRAY);
		
		
		Button b=new Button("Click ME");
		b.setBounds(100, 100, 100, 20);
		
		Checkbox cb1=new Checkbox("C++");
		cb1.setBounds(100,200,100,30);
		Checkbox cb2=new Checkbox("Java");
		cb2.setBounds(100, 300, 100, 30);
		
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox cb3=new Checkbox("Nanda",cbg,true);
		Checkbox cb4=new Checkbox("kumar",cbg,false);
		cb3.setBounds(100,400,100,10);
		cb4.setBounds(100,415,100,10);
		cb1.setBounds(100,200,100,30);
		
		Label l=new Label("Hello,World");
		l.setBounds(20, 40, 100, 10);
		Label l1=new Label("Bye, World!");
		l.setBounds(20,560,100,10);
		frame.add( l1);
		frame.add(l);
		frame.add(cb3);
		frame.add(cb4);
		
		
		frame.add(cb1);
		frame.add(cb2);
		
		frame.add(b);
	
		frame.add(panel);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.show();
		
	}

}
