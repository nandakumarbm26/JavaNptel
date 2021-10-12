package ioStream;
import java.io.*;
public class CopyPasteByteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream ins=null;
		FileOutputStream outs=null;
		
		try {
			ins=new FileInputStream("E:\\java\\JavaLearning2\\src\\ioStream\\new.txt");
			outs=new FileOutputStream("E:\\java\\JavaLearning2\\src\\ioStream\\new2.txt");
			
			byte ch=(byte) ins.read();
			while(ch!=-1) {
				outs.write(ch);
				ch=(byte) ins.read();
			}
		}catch(IOException e) {
			System.out.println(e);
			System.exit(-1);
		}finally {
			try {
				ins.close();
				outs.close();
				System.out.println("Success");
			}catch(IOException e) {}
		}
	}

}
