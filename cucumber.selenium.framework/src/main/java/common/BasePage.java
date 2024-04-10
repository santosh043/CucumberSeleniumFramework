package common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class BasePage  {


	
	   public  WebDriver driver;
	    public final static int TIMEOUT = 5;
	
	    public void getDriver() 
		{		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sahana\\eclipse-workspace\\cucumber.selenium.framework\\src\\main\\resources\\drivers\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));		
		}
	    
	    public void enterUrl() 
		{		
	   		 driver.get("https://www.amazon.com/");	
		}
	    
	    public void closeBrowser() 
		{		
	   		 driver.close();	
		}	    
	  	
}
