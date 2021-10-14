package networking;
import java.io.*;
import java.net.*;
public class UrlCon {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://www.jssateb.ac.in");
            URLConnection urlcon=url.openConnection();
            InputStream io=urlcon.getInputStream();
            int i;
            while((i=io.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
