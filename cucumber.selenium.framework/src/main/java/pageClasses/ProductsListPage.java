package pageClasses;

import org.openqa.selenium.By;

import common.BasePage;

public class ProductsListPage extends BasePage {
	
public By ProductOne = By.xpath("//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-2\"]//following-sibling::h2/a");
public By ProductTwo = By.xpath("//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-3\"]//following-sibling::h2/a");
	
	public void selectProductOne()
	{
		driver.findElement(ProductOne).click();
	}
	
	public void selectProductTwo()
	{
		driver.findElement(ProductTwo).click();
	}

}
