package Lab;

import java.net.*;

public class LocalhostInterface_Jenisha {

		    public static void main(String[] args) {
		        try {
		            // Get the InetAddress object for localhost
		            InetAddress localHost = InetAddress.getLocalHost();

		            // Get the network interface for localhost
		            NetworkInterface ni = NetworkInterface.getByInetAddress(localHost);

		            if (ni != null) {
		                System.out.println("Interface Name: " + ni.getName());
		                System.out.println("Display Name: " + ni.getDisplayName());
		                
		                // Print MAC address
		                byte[] mac = ni.getHardwareAddress();
		                if (mac != null) {
		                    System.out.print("MAC Address: ");
		                    for (int i = 0; i < mac.length; i++) {
		                        System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
		                    }
		                    System.out.println();
		                }

		                // Print IP address
		                System.out.println("IP Address: " + localHost.getHostAddress());
		            } else {
		                System.out.println("No network interface found for localhost.");
		            }

		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		}


