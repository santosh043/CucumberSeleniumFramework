package stepDefinitions;

import org.junit.Assert;

import dataProviders.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.CartPage;
import pageClasses.HomePage;
import pageClasses.IndexPage;
import pageClasses.LoginPage;
import pageClasses.ProductPage;
import pageClasses.ProductsListPage;

public class StepDefinitions  {

	IndexPage indexPage = new IndexPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ProductsListPage productsListPage = new ProductsListPage();
	ProductPage productPage = new ProductPage();
	CartPage cartPage = new CartPage();
	ConfigFileReader configFileReader= new ConfigFileReader();
    
	@Given("^user open browser$")
    public void user_open_browser() throws Throwable {
                
        indexPage.getDriver();
       
    }
	
	@Given("^enter amazon url$")
    public void enter_amazon_url() throws Throwable {
	
		indexPage.enterUrl();
    }
	
	@Given("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
                
        indexPage.clickLogin();
    }
    
    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
    	loginPage.enterEmail(configFileReader.getUsername());
    	loginPage.enterPassword(configFileReader.getPassword());
    }
    
    @When("^user click on SignIn$")
    public void user_click_on_SignIn() throws Throwable {
                
    	loginPage.clickSignIn();
    }
    
    @Then("^user should be in HomePage$")
    public void user_should_be_navigate_to_HomePage()  {
                
    	indexPage.verifyHomePage();
    }
    
    @When("^user enter \"(.*)\" in search field$")
    public void user_enter_in_search_field(String searchItem)  {
                
    	homePage.enterSearchItem(searchItem);
    }
    
    @When("^user click on Search$")
    public void user_click_on_Search()  {
                
    	homePage.clickSearch();
    }
    
    @When("^Select 1st item in the list$")
    public void Select_1st_item_in_the_list() {
                
    	productsListPage.selectProductOne();
    }
    
    @When("^Select 2nd item in the list$")
    public void Select_2nd_item_in_the_list()  {
                
    	productsListPage.selectProductTwo();
    }
    
    @When("^Add the item to cart by clicking AddtoCart$")
    public void Add_the_item_to_cart_by_clicking_AddtoCart()  {
                
    	productPage.clickAddToCart();
    }
    
    @When("^Open Cart from the top left$")
    public void Open_Cart_from_the_top_left()  {
                
    	cartPage.clickCartIcon();
    }
    
    @Then("^Verify that the price is identical to the product page$")
    public void Verify_that_the_price_is_identical_to_the_product_page()  {
                
    String cartPrice =	cartPage.getPrice();
    String productPrice =	productPage.getProductPrice();
    
    if(cartPrice.equals(productPrice))
    {
    	System.out.println("Both prices are equal");
    	Assert.assertTrue(true);
    }
    else
    {
    	System.out.println("Both prices are not equal");
    	Assert.assertTrue(false);
    }
    
    }
    
    @Then("^Verify that the subtotal is identical to the product page$")
    public void Verify_that_the_subtotal_is_identical_to_the_product_page()  {
                
    String cartSubTotalPrice =	cartPage.getSubTotalPrice();
    String productPrice =	productPage.getProductPrice();
    
    if(cartSubTotalPrice.equals(productPrice))
    {
    	System.out.println("Both prices are equal");
    	Assert.assertTrue(true);
    }
    else
    {
    	System.out.println("Both prices are not equal");
    	Assert.assertTrue(false);
    }
    
    }
    
    @Then("^Verify each item total price is correct$")
    public void Verify_each_item_total_price_is_correct()  {
                
    String cartProduct1Price =	cartPage.getPrice();
    String product1Price =	productPage.getProductPrice();
    String cartProduct2Price =	cartPage.getPrice();
    String product2Price =	productPage.getProductPrice();
    
    if(cartProduct1Price.equals(product1Price) && cartProduct2Price.equals(product2Price) )
    {
    	System.out.println("Both prices are equal");
    	Assert.assertTrue(true);
    }
    else
    {
    	System.out.println("Both prices are not equal");
    	Assert.assertTrue(false);
    }
    
    }
    
    @Then("^Verify that the subtotal is calculated correctly$")
    public void Verify_that_the_subtotal_is_calculated_correctly()  {
                
    String cartSubTotalPrice =	cartPage.getSubTotalPrice();
    String product1Price =	productPage.getProductPrice();
    String product2Price =	productPage.getProductPrice();
    String bothProductPrice = String.valueOf(Float.parseFloat(product1Price)+Float.parseFloat(product2Price));
    
    if(cartSubTotalPrice.equals(bothProductPrice))
    {
    	System.out.println("Both prices are equal");
    	Assert.assertTrue(true);
    }
    else
    {
    	System.out.println("Both prices are not equal");
    	Assert.assertTrue(false);
    }
    
    }
    
     
	
	
}
