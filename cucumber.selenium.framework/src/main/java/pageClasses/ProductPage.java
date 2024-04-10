package pageClasses;

import org.openqa.selenium.By;

import common.BasePage;

public class ProductPage extends BasePage {
	
public By AddToCartButton = By.xpath("//input[@id=\"add-to-cart-button\"]");
public By ProductPrice = By.xpath("//div[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span[1]");
	
	public void clickAddToCart()
	{
		driver.findElement(AddToCartButton).click();
	}
	
	public String getProductPrice()
	{
		return driver.findElement(ProductPrice).getText();
	}

}
