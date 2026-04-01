package SecureServer;
	import java.io.*;
	import javax.net.ssl.*;
	public class SecureClient_Jenisha {
	public static void main(String[] args) {
	String host = "localhost"; 
	int port = 8443; 
	try {
	SSLSocketFactory sslSocketFactory =
	(SSLSocketFactory) SSLSocketFactory.getDefault();
	SSLSocket sslSocket = 
	(SSLSocket) sslSocketFactory.createSocket(host, port);
	System.out.println("Connected securely to server!");
	PrintWriter out = new PrintWriter(
	sslSocket.getOutputStream(), true);
	BufferedReader in = new BufferedReader(
	new InputStreamReader(sslSocket.getInputStream()));
	out.println("Hello Secure Server!");
	System.out.println("Server says: " + in.readLine());
	in.close();
	out.close();
	sslSocket.close();
	} catch (IOException ex) {
	System.err.println("Client error: " + ex.getMessage());
	}
	}
	}

