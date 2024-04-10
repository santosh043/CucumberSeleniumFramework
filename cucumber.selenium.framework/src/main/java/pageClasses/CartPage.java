package pageClasses;

import org.openqa.selenium.By;

import common.BasePage;

public class CartPage extends BasePage {
	
public By CartButton = By.xpath("//a[@id=\"nav-cart\"]");
public By Price = By.xpath("//div[@class=\"sc-badge-price-to-pay\"]/div/span");
public By SubTotalPrice = By.xpath("//span[@id=\"sc-subtotal-amount-activecart\"]/span");

public void clickCartIcon()
{
		driver.findElement(CartButton).click();
}

public String getPrice()
{
	return driver.findElement(Price).getText();
}

public String getSubTotalPrice()
{
	return driver.findElement(SubTotalPrice).getText();
}




}
