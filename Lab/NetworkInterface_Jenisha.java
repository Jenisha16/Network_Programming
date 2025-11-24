package Lab;

import java.net.*;
import java.util.*;

public class NetworkInterface_Jenisha {


		    public static void main(String[] args) {
		        try {
		            // Get all network interfaces
		            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
		            
		            while (interfaces.hasMoreElements()) {
		                NetworkInterface ni = interfaces.nextElement();
		                System.out.println("Interface Name: " + ni.getName());
		                System.out.println("Display Name: " + ni.getDisplayName());

		                // Get all IP addresses associated with the interface
		                Enumeration<InetAddress> addresses = ni.getInetAddresses();
		                while (addresses.hasMoreElements()) {
		                    InetAddress addr = addresses.nextElement();
		                    System.out.println("IP Address: " + addr);
		                }
		                
		                System.out.println("-------------------------------------");
		            }
		        } catch (SocketException e) {
		            e.printStackTrace();
		        }
		    }
		}

