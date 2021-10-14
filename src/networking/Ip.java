package networking;

import java.net.*;
public class Ip {
    public static void main(String[] args) {
        try{
            
            InetAddress ip=InetAddress.getByName("www.jssateb.ac.in");
            System.out.println("Host Name "+ip.getHostName());
            System.out.println("IP address "+ip.getHostAddress());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
