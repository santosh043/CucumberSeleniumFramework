#Author: santosh m
#Date : 09-04-2024

Feature: cart functionalities
This feature is to implement cart related scenarios
 
 Background: User is Logged In
	Given user open browser
	And enter amazon url
	And user navigates to Login Page
	When user enters username and Password
	And user click on SignIn
	Then user should be in HomePage 
 
 Scenario: Adding a “Monitor” Item in Cart and verifying sub total
 
 When user enter "Monitor" in search field
 And user click on Search
 And Select 1st item in the list
 And Add the item to cart by clicking AddtoCart
 And Open Cart from the top left
 Then Verify that the price is identical to the product page
 And Verify that the subtotal is identical to the product page
