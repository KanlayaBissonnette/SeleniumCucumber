Feature: Fitness Accessories Functionality

Background:
When User is in Homepage
	And User click in Fitness Accesories Page

@Test1
Scenario: Verify Fitness Accessories Page
Then User clicks on products and verified headers of selected products


@Test2
Scenario: Verify product and shipping estimate
When User add to cart the first available item on Aerobic Training
Then User Verified the product with a shipping estimate  

@Test3
Scenario: Verify Fitness Accessories Product Sort By Price Functionality
When User Add to Click the First item in sort by price
Then User verified the product name and details

@Test4
Scenario: Verify Fitness Accessories Check out Functionality
When User Sort by price products on Recovery & Wellness 
And User Check out the most expensive item on second page of products
Then User fills billing and verify information on his order
