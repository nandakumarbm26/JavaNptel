package ioStream;
import java.io.*;
public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte name[]= {'N','A','N','D','A',' ','K','U','M','A','R'};
		String s="Hello,world";
		byte hello[]=s.getBytes();
		try {
			FileOutputStream fout=new FileOutputStream("E:\\java\\JavaLearning2\\src\\ioStream\\new.txt");
			fout.write(65);
			fout.write(56);
			fout.write(name);
			fout.write(hello);
			fout.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
