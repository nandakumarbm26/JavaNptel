package ioStream;
import java.io.*;
public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream in=new FileInputStream("E:\\java\\JavaLearning2\\src\\ioStream\\new.txt");
			int i=in.read();
			System.out.println((char)i);
			while((i=in.read())!=-1) {
				System.out.print((char)i);
			}
			in.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
