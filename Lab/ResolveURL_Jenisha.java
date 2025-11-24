package Lab;

import java.net.*;

public class ResolveURL_Jenisha {
	    public static void main(String[] args) {
	        try {
	            URI base = new URI("http://example.com");
	            URI path = new URI("colleges/SWASTIK#admission");

	            URI resolved = base.resolve(path);

	            System.out.println("Base URI: " + base);
	            System.out.println("Relative Path: " + path);
	            System.out.println("Resolved URI: " + resolved);

	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}