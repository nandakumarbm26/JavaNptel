package awtProgramming;
import java.awt.*;
public class MyPanel {

	public static void main(String[] args) {
		Frame f=new Frame("Hello,World!");

		f.setBackground(Color.cyan);
		f.resize(400,400);
		
		TextField t1,t2;
		t1=new TextField("Welcome");
		t1.setBounds(20,100,100,20);
		t2=new TextField("Hello,world");
		t2.setBounds(20, 150, 100, 20);
		
		Scrollbar h=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,100);
		Scrollbar v=new Scrollbar(Scrollbar.VERTICAL,0,20,0,100);
		h.setBounds(0,380,400,20);
		v.setBounds(380,0,20,400);
		
		TextArea ta=new TextArea("This is Text area");
		ta.setBounds(30,200,200,150);
		
		List l1=new List();
		l1.add("Hi");
		l1.add("Hello");
		l1.add("namaskara");
		l1.setBounds(200,110,100,30);
		
		Choice c=new Choice();
		c.add("bengaluru");
		c.add("mangaluru");
		c.add("mysuru");
		c.setBounds(200,150,100,30);
		
		f.add(v);
		f.add(h);
		f.add(c);
		f.add(l1);
		f.add(ta);
		f.add( t1);
		f.add(t2);
		
		f.setVisible(true);
		f.show();
	}

}
