package networking;
import java.io.*;
import java.net.*;
public class UrlInfo {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://nptel.ac.in/course.php");

            System.out.println(url.getHost());
            System.out.println(url.getProtocol());
            System.out.println(url.getPort());
            System.out.println(url.getFile()); 
            System.out.println(url.getContent());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}

