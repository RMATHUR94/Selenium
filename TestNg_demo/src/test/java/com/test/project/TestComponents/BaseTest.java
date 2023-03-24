package com.test.project.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    WebDriver driver;
    
	public void initializeDriver() throws IOException
	{
		    //properties
		     
		     Properties prop = new Properties();   
		     FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/home/vyrazu-66/git/Selenium/TestNg_demo/src/main/java/GlobalData.properties");
		     prop.load(fis); 
		    String browserName = prop.getProperty("browser");
		    
		     if(browserName.equalsIgnoreCase("chrome"))
		    		 {
		               WebDriverManager.chromiumdriver().setup();
		               ChromeOptions chromeOptions = new ChromeOptions();
			           chromeOptions.addArguments("--remote-allow-origins=*");
			            WebDriver driver = new ChromeDriver(chromeOptions);
		    		 }
		     else if(browserName.equalsIgnoreCase("firefox"))
		     {
		    	 //edge
		     }
		     else if(browserName.equalsIgnoreCase("edge"))
		     {
		    	 //edge
		     }
			 

			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			   driver.get("https://rahulshettyacademy.com/client/");
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
}
