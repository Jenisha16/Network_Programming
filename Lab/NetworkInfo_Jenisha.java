package Lab;

import java.net.*;

public class NetworkInfo_Jenisha {
		    public static void main(String[] args) {
		        try {
		            // URL of the host
		        	 URL url = new URL("https://www.google.com");

		             // Getting protocol, host, and port
		             String protocol = url.getProtocol();
		             String host = url.getHost();
		             int port = url.getPort(); // returns -1 if no explicit port

		             // Getting host address from InetAddress
		             InetAddress inet = InetAddress.getByName(host);
		             String hostName = inet.getHostName();
		             String hostAddress = inet.getHostAddress();

		             System.out.println("Host Name: " + hostName);
		             System.out.println("Protocol: " + protocol);
		             System.out.println("Host Address (IP): " + hostAddress);

		             // If port is -1, use the URL default port
		             if (port == -1) {
		                 port = url.getDefaultPort();
		             }
		             System.out.println("Port: " + port);

		         } catch (Exception e) {
		             System.out.println("Error: " + e.getMessage());
		         }
		    }
		}

