package ioStream;
import java.io.*;
public class GetFileInfo {
	public static void getPath(File f)throws IOException {
		System.out.println("Name :"+f.getName());
		System.out.println("Path :"+f.getPath());
		System.out.println("Parent :"+f.getParent());
	}
	
	public static void getInfo(File f)throws IOException {
		if(f.exists()) {
			System.out.println("File exists");
			System.out.println(f.canRead() ? " file is readable":"");
			System.out.println(f.canExecute()?"file is executable":"");
			System.out.println(f.canWrite()?"file is writable":"");
			System.out.println("File is last modified:"+f.lastModified());
			System.out.println("file is "+f.length());
			
		}
		else {
			System.err.println("File does not exist");
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fileToCheck=new File("E:\\java\\JavaLearning2\\src\\ioStream\\new.txt");
		getInfo(fileToCheck);
		getPath(fileToCheck);
	}

}
