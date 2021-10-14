package networking;
import java.net.*;
public class Reciver {
    public static void main(String[] args) {
        try{
            DatagramSocket ds=new DatagramSocket(3000);
            byte[] buf=new byte[1024];
            DatagramPacket dp=new DatagramPacket(buf, 1024);
            ds.receive(dp);
            String s=new String(dp.getData(),0,dp.getLength());
            System.out.println(s);
            ds.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
