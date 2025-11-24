package Lab;

import java.net.URL;

public class URLParts_Jenisha {
public static void main(String[] args) {
try {
URL url = new URL("https://example.com/en/4.2/querysets/#queryset-api");

System.out.println("Scheme : " + url.getProtocol());
System.out.println("Authority : " + url.getAuthority());
System.out.println("Path : " + url.getPath());
System.out.println("Query : " + url.getQuery());
System.out.println("Fragment : " + url.getRef()); // section part

} catch (Exception e) {
System.out.println(e);
}
}
}