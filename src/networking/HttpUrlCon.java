package networking;
import java.net.*;
public class HttpUrlCon {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://www.jssateb.ac.in");
            HttpURLConnection huc=(HttpURLConnection)url.openConnection();

            for(int i=1;i<=0;i++){
                System.out.println(huc.getHeaderFieldKey(i)+"="+huc.getHeaderField(i));
            }
            huc.disconnect();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
