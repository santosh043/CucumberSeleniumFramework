package common;


	import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	import io.cucumber.java.After;
	import io.cucumber.java.Before;
import pageClasses.IndexPage;
	public class Hooks extends BasePage
	{
		
		IndexPage indexPage = new IndexPage();
		
		@Before(order=0) 	 		
		public  void setupDriver() throws InterruptedException 
		{		
			
			getDriver();
			enterUrl();
		}
		
	   @After(order=0) 		 
		   public  void Logout() throws Exception 
		   {		
			   indexPage.clickLogout();
		   }
		   
		   @After(order=1) 			 
		   public  void closeDriver() throws Exception 
		   {		
			   closeBrowser();
		   }
		   
		   
		
	}

