package Lab;

import java.net.*;

public class CheckIPType_Jenisha {
	    public static void main(String[] args) {
	        try {
	            // One IPv4 and one IPv6
	            String ip1 = "192.168.1.10";                       // IPv4
	            String ip2 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334"; // IPv6

	            // Check IP1
	            InetAddress address1 = InetAddress.getByName(ip1);
	            if (address1 instanceof java.net.Inet4Address) {
	                System.out.println(ip1 + " is an IPv4 address.");
	            } else {
	                System.out.println(ip1 + " is an IPv6 address.");
	            }

	            // Check IP2
	            InetAddress address2 = InetAddress.getByName(ip2);
	            if (address2 instanceof java.net.Inet4Address) {
	                System.out.println(ip2 + " is an IPv4 address.");
	            } else {
	                System.out.println(ip2 + " is an IPv6 address.");
	            }

	        } catch (Exception e) {
	            System.out.println("Invalid IP Address!");
	        }
	    }
	}