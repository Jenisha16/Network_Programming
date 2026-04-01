package Chapter3;

import java.net.URLEncoder;
import java.net.URLDecoder;

public class UrlEncoderDecoder {
   public static void main(String[] args) {
      try {
         String url = "https://www.example.com/search?q=query string";
         String encodedUrl = URLEncoder.encode(url, "UTF-8");
         System.out.println(encodedUrl); 
         String decodedUrl = URLDecoder.decode(encodedUrl, "UTF-8");
         System.out.println(decodedUrl); 
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}