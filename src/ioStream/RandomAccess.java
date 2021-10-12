package ioStream;
import java.io.*;

public class RandomAccess {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		RandomAccessFile file=new RandomAccessFile("r.dat","rw");
		file.writeChar('H');
		file.writeInt(100);
		file.writeFloat(1.112f);
		file.seek(0);
		
		System.out.println(file.readChar());
		System.out.println(file.readInt());
		System.out.println(file.readFloat());
		
		file.seek(2);
		System.out.println(file.readInt());
		
		file.seek(file.length());
		file.writeBoolean(false);
		file.seek(4);
		System.out.println(file.readBoolean());
		file.close();
	}

}
