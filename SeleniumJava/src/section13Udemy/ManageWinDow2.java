package section13Udemy;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ManageWinDow2 {

	public static void main(String[] args) throws Exception
	{
		// HOw to take screenshot using Sel-JAVA
		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (2)/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().window().maximize();  //Maximizes window.

		driver.manage().deleteAllCookies();   //Deleting all the cookies in browser.

		//driver.manage().deleteCookieNamed("sessionkey"); //To delete one single cookie which you know.

		driver.get("https://www.google.com/");

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //showing error here

		FileUtils.copyFile(src, new File("/home/vyrazu-66/Videos//screenshot.png"));   //Showing error here
	}

}
