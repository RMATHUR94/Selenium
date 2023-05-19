import java.net.URI;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Predicate;

//working
public class BasicAuth {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		        
		ChromeDriver driver = new ChromeDriver();
		// predicate , consumer with lamba exp
		   
		Predicate<URI> uriPredicate = uri -> uri.getHost().contains("httpbin.org");
		
		((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo","bar"));
		driver.get("https://httpbin.org/basic-auth/foo/bar");
	}

}
