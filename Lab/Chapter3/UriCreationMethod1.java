package Chapter3;

import java.net.*;

public class UriCreationMethod1
{
 public static void main(String[] args) throws Exception 
 {
     String uribase = "https://www.example.org/";
     String urirelative = "languages/../java";
     String str = "https://www.google.com/?gws_rd=ssl#1498";
     URI uriBase = new URI(uribase);
     URI uri = URI.create(str);
     System.out.println(uri);
     System.out.println("Base URI = " + uriBase.toString());
     URI uriRelative = new URI(urirelative);
     System.out.println("Relative URI = " + uriRelative.toString());
     URI uriResolved = uriBase.resolve(uriRelative);
     System.out.println("Resolved URI = " + uriResolved.toString());
}
}