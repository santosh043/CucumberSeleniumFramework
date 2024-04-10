package pageClasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import common.BasePage;

public class IndexPage extends BasePage 
{
	
	public By AccountsListMenu = By.xpath("//a[@id=\"nav-link-accountList\"]");
//	public By LoginButton = By.xpath("//a/span[@class=\"nav-action-inner\"]");
	public By LogoutMenuLink = By.xpath("//a[@id=\"nav-item-signout\"]");	
	
	
	public void clickLogin()
	{
		driver.findElement(AccountsListMenu).click();
	}
	
	public void clickLogout()
	{
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(AccountsListMenu)).moveToElement(driver.findElement(LogoutMenuLink)).click();
	}	
	
	public void verifyHomePage()
	{
		if(driver.findElements(LogoutMenuLink).size() != 0)
		{
	     System.out.println("You are in user loggein HomePage");
		Assert.assertTrue(true);
		}
		else
		{
		System.out.println("You are not in user loggein HomePage");
		Assert.assertTrue(false);
		}
	}	

}
