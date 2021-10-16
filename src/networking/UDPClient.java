package networking;
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        try{
            Scanner in=new Scanner(System.in);
            DatagramSocket ds=new DatagramSocket();
            InetAddress ip=InetAddress.getLocalHost();
            byte buf[]=null;

            while(true){
                String inp=in.nextLine();
                buf=inp.getBytes();
                DatagramPacket dp=new DatagramPacket(buf, buf.length,ip,1234);
                ds.send(dp);

                if(inp.equals("bye")){
                    System.out.println("You said bye .FOff");
                    ds.close();
                    in.close();
                    break;
                
                }
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }    
}
