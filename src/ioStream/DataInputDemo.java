package ioStream;
import java.io.*;
public class DataInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			String name;
			int age;
			DataInputStream in=new DataInputStream(System.in);
			System.out.println("Enter Name:");
			System.out.flush();
			name=in.readLine();
			System.out.println("Enter age :");
			System.out.flush();
			String temp=in.readLine();
			age=Integer.parseInt(temp);
			System.out.println("Name :"+name+" age :"+age);
		}catch(Exception e) {
			System.out.println("Exception : "+e.getMessage());
		}
		
	}

}
