package Lab;

import java.net.*;

public class URLCreationMethod_Jenisha {

		    public static void main(String[] args) {
		        try {
		            URL url = new URL("https://example.com/en/4.2/querysets/#queryset-api");

		            System.out.println("Scheme: " + url.getProtocol());
		            System.out.println("Authority: " + url.getAuthority());
		            System.out.println("Path: " + url.getPath());
		            System.out.println("Query String: " + url.getQuery());    // null → because this URL has no query
		            System.out.println("Fragment (Section): " + url.getRef());

		        } catch (Exception e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
		}
