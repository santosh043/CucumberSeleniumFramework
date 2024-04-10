package pageClasses;

import org.openqa.selenium.By;

import common.BasePage;

public class HomePage extends BasePage {
	
	public By SearchBox = By.xpath("//input[@id=\"twotabsearchtextbox\"]");
	public By SearchButton = By.xpath("//input[@id=\"nav-search-submit-button\"]");
	
	public void enterSearchItem(String searchItem)
	{
		driver.findElement(SearchBox).sendKeys(searchItem);
	}
	
	public void clickSearch()
	{
		driver.findElement(SearchButton).click();
	}
	
	
	

}
