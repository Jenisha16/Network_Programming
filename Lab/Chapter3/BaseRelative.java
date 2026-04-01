
package Chapter3;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseRelative {
public static void main (String[] args) {
	try {
		URL baseURL = new URL("https://www.example.com/");
		String relativeURL= "foo/bar.html";
		URL resolvedURL = new URL(baseURL,relativeURL);
		System.out.println("Base URL:" + baseURL);
		System.out.println("Relative URL:" + relativeURL);
		System.out.println("Resolved URL:" + resolvedURL);
	}catch(MalformedURLException e) {
		System.out.println(e.getMessage());
	}
}
}
