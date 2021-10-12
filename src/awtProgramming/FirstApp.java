package awtProgramming;
import java.io.*;



import java.awt.*;

class StudentFile extends Frame{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	TextField number, name ,marks;
	Button enter,done;
	Label numLabel,nameLabel,markLabel;
	DataOutputStream dos;
	Panel p;
	
	public StudentFile() {
		super("Create Student File");
	}
	
	public void setup() {
		resize(400,200);
		setLayout(new GridLayout(4,2));
		p=new Panel();
		p.setBounds(20,20,360,160);
		number=new TextField(25);
		numLabel=new Label("Roll Number");
		name=new TextField(25);
		nameLabel=new Label("Student Name");
		marks=new TextField(25);
		markLabel=new Label("Marks");
		done=new Button("Done");
		enter =new Button("Enter");
		
		
		super.add(numLabel);
		super.add(number);
		super.add(nameLabel);
		super.add(name);
		super.add(markLabel);
		super.add(marks);

		
		super.setVisible(true);
		super.add(done);
		super.add(enter);
	}
}

public class FirstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentFile st=new StudentFile();
		st.setup();
	}

}
