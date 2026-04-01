package Chapter5;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
public class PostData {
	public static void main(String[] args) {
		try {
			//Step 1: Define the server URL (Replace with actual server URL)
			URL url = new URL("https://example.com");
			//step 2: open the connection
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			//Step 3: set request method to POST
			connection.setRequestMethod("POST");
			connection.setDoOutput(true);//Enable output
			//set 4: create the data(query string)
			String data ="name" + URLEncoder.encode("Swastik","UTF-8") + "&Program="+ URLEncoder.encode("BCA","UTF-8");
			//step 5: write data to the server
					try(OutputStream os = connection.getOutputStream()){
						os.write(data.getBytes(StandardCharsets.UTF_8));
						os.flush();
					}
			//Step 6: Read the response from the server
			try(BufferedReader reader = new BufferedReader(
					new InputStreamReader(connection.getInputStream()))){
				String line;
				while ((line = reader.readLine())!=null) {
					System.out.println(line);
				}
			}
			//Step 7: Close connection
			connection.disconnect();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
