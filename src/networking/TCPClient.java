package networking;

import java.net.*;
import java.io.*;
public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout =new DataOutputStream(s.getOutputStream());
            DataInputStream din=new DataInputStream(s.getInputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";
            while(!str.equals("stop")){
                str=br.readLine();
                dout.writeUTF(str);
                str2=din.readUTF();
                System.out.println("Server says "+str2);
            }

            
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
