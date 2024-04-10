package pageClasses;

import org.openqa.selenium.By;

import common.BasePage;

public class LoginPage extends BasePage {
	
	public By EmailTexbox = By.xpath("//input[@id=\"ap_email\"]");
	public By ContinueButton = By.xpath("//input[@id=\"continue\"]");
	public By PasswordTexbox = By.xpath("//input[@id=\"ap_password\"]");
	public By SignInButton = By.xpath("//input[@id=\"signInSubmit\"]");
	
	public void enterEmail(String username)
	{
		driver.findElement(EmailTexbox).sendKeys(username);;
	}	
	
	public void clickContinue()
	{
		driver.findElement(ContinueButton).click();
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(PasswordTexbox).sendKeys(password);;
	}
	
	public void clickSignIn()
	{
		driver.findElement(SignInButton).click();
	}
	

}
