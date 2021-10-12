package ioStream;
import java.io.*;
public class SeqInput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream ins1=new FileInputStream("E:\\java\\JavaLearning2\\src\\ioStream\\new.txt");
		FileInputStream ins2=new FileInputStream("E:\\java\\JavaLearning2\\src\\ioStream\\new2.txt");
		SequenceInputStream inst=new SequenceInputStream(ins1,ins2);
		int i;
		while((i=inst.read())!=-1) {
			System.out.print((char)i);
		}
		inst.close();
		ins1.close();
		ins2.close();
	}

}
