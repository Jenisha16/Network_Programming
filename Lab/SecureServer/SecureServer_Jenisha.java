package SecureServer;
	import java.io.*;
	import java.net.*;
	import javax.net.ssl.*;
	public class SecureServer_Jenisha {
	public static void main(String[] args) {
	int port = 8443; try {
	SSLServerSocketFactory sslServerFactory =
	(SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
	SSLServerSocket sslServerSocket = 
	(SSLServerSocket) sslServerFactory.createServerSocket(port);
	System.out.println("Secure Server started on port " + port);
	SSLSocket sslSocket = (SSLSocket) sslServerSocket.accept();
	System.out.println("Client connected securely!");
	BufferedReader in = new BufferedReader(
	new InputStreamReader(sslSocket.getInputStream()));
	PrintWriter out = new PrintWriter(
	sslSocket.getOutputStream(), true);
	String received = in.readLine(); 
	System.out.println("Client says: " + received);
	out.println("Secure Server response: received \"" + received + "\"");
	out.close();
	in.close();
	sslSocket.close();
	sslServerSocket.close();
	} catch (IOException ex) {
	System.err.println("Server error: " + ex.getMessage());
	}
	}
	
}
