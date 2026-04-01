
package Chapter3;

import java.net.URI;
import java.net.URISyntaxException;

public class UriCreationMethod5 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https", "user:password@example.com:8080", "/path", "query=value", "fragment");
System.out.println(uri);
            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Authority: " + uri.getAuthority());
            System.out.println("User info: " + uri.getUserInfo());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Fragment: " + uri.getFragment());
        } catch (URISyntaxException e) {
            System.err.println("Invalid URI: " + e.getMessage());
        }
    }
}
