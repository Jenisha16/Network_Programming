
package Chapter2;

import java.net.InetAddress;

public class TestReachability {
public static void main(String[] args) {
	try {
		boolean isGoogleReachable= InetAddress.getByName("www.google.com").isReachable(5000);
		System.out.println("Is Google reachable? " + isGoogleReachable);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
