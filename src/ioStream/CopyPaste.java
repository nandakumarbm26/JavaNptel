package ioStream;
import java.io.*;
public class CopyPaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile=new File("E:\\java\\JavaLearning2\\src\\ioStream\\new.txt");
		File outFile=new File("E:\\java\\JavaLearning2\\src\\ioStream\\new2.txt");
		FileReader ins=null;
		FileWriter outs=null;
		
		try {
			ins=new FileReader(inFile);
			outs=new FileWriter(outFile);
			
			int ch;
			while((ch=ins.read())!=-1) {
				outs.write(ch);
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
