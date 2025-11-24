package Lab;

import java.net.*;

public class IPandMACaddress_Jenisha {
	    public static void main(String[] args) {
	        try {
	          // You can change this to any host (example: "www.google.com")
	            String host = "localhost";

	            InetAddress address = InetAddress.getByName(host);
	            System.out.println("Host: " + host);
	            System.out.println("IP Address: " + address.getHostAddress());

	            NetworkInterface ni = NetworkInterface.getByInetAddress(address);

	            if (ni != null) {
	                byte[] mac = ni.getHardwareAddress();

	                if (mac != null) {
	                    StringBuilder sb = new StringBuilder();
	                    for (byte b : mac) {
	                        sb.append(String.format("%02X-", b));
	                    }
	                    System.out.println("MAC Address: " + sb.substring(0, sb.length() - 1));
	                } else {
	                    System.out.println("MAC Address: Not available");
	                }
	            } else {
	                System.out.println("Network Interface not found.");
	            }

	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}