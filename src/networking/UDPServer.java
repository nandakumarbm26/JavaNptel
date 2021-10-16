package networking;

import java.net.*;
public class UDPServer {
    public static void main(String[] args) {
        try{
            DatagramSocket ds=new DatagramSocket(1234);
            byte[] receive =new byte[65535];
            InetAddress ip=InetAddress.getLocalHost();

            DatagramPacket dp=null;

            while(true){
                dp=new DatagramPacket(receive, receive.length,ip,1234);

                ds.receive(dp);
                System.out.println("Client :-"+data(receive));

                if(data(receive).toString().equals("bye")){
                    System.err.println("Client sent bye....FOff");
                    ds.close();
                    break;
                }
                receive=new byte[65535];
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    private static StringBuilder data(byte[] a) {
        if(a==null)
            return null;
        StringBuilder ret=new StringBuilder();
        int i=0;
        while(a[i]!=0){
            ret.append((char)a[i]);
            i++;
        }
        return ret;
    }
}
