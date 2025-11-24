package Lab;
import java.net.*;

public class TestReachability_Jenisha {

public static void main(String[] args) {
String link = "https://www.google.com"; // URL to test
try {
URL url = new URL(link);
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setConnectTimeout(2000); // 2 seconds
connection.setReadTimeout(2000); // 2 seconds
connection.setRequestMethod("GET");
int responseCode = connection.getResponseCode();
if (responseCode == 200) {
System.out.println(link + " is reachable.");
} else {
System.out.println(link + " is NOT reachable. Response code: " + responseCode);
}

} catch (Exception e) {
System.out.println(link + " is NOT reachable. Error: " + e.getMessage());
}
}
}