package ioStream;
import java.io.*;
public class BufferInput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("E:\\java\\JavaLearning2\\src\\ioStream\\new2.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1) {
			System.out.print((char)i);
		}
		bin.close();
		fin.close();
	}

}
