package ioStream;
import java.io.*;
public class BufferedOutput {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("E:\\java\\JavaLearning2\\src\\ioStream\\new.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Hello en arama!";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success");
	}

}
