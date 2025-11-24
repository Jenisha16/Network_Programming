package Lab;

import java.net.*;

public class AddressType_Jenisha {

		    public static void main(String[] args) {
		        try {
		            InetAddress ip = InetAddress.getByName("255.234.180.23");

		            System.out.println("IP Address: " + ip.getHostAddress());

		            if (ip.isLoopbackAddress()) {
		                System.out.println("Address Type: Loopback Address");
		            } else if (ip.isMulticastAddress()) {
		                System.out.println("Address Type: Multicast Address");
		            } else if (ip.isSiteLocalAddress()) {
		                System.out.println("Address Type: Private (Site Local) Address");
		            } else {
		                System.out.println("Address Type: Public Address");
		            }

		        } catch (Exception e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
		}
