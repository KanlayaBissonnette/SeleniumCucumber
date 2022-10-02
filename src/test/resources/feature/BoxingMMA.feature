Feature: BoxingMMA Functionality

Background:
 Given User navigate to Home Page

@tag1
Scenario: Verified Description of First Stand & Bags Product
 When User clicks on Boxing & MMA
 And User scroll down and clicks on MMA Stands & Bags
 And User clicks Short by Description
 And User clicks on first item 
 Then User verify if header of the item match the description of the item

@tag2
Scenario: Verified estimate price of shipping
 When User Clicks on Boxing & MMA
 And User Clicks in MMA Accessories
 And User Clicks all ten items shown below are clickable
 And User Clicks add to cart AmStaff Fitness 12oz Boxing Gloves
 And User Clicks Add to cart 108 int Hand Wraps Blue   
 Then Verified if the prices of AmStaff Fitness 12oz Boxing Gloves in left shopping cart are equal than on the product side
 Then Verified if the prices of 108 int Hand Wraps Blue in left shopping cart are equal than on the product side
 And User Clicks Checkout
 And User can see checkout page and fill an estimate of Shipping details
 And User Clicks get estimate
 
@tag3	
Scenario Outline: Verified Description of First Stand & Bags Product
 When Clicks in login Button
 And User enters valid "<email>"
 And User puts valid "<password>"
 And User clicks in Login
 And User clicks on Boxing & MMA  
 And User clicks in AmStaff TBX002 Boxing Stand
 And User clicks on product information
 Then Verified if you can see product information
 And User click on write a review in Ratings & Reviews
 Then Verify Ratings & Reviews header text

Examples:
	|email		  								|password				|
	|sundaynicenight@gmail.com	| Xmasisthebest!| 
      
@tag4
Scenario:  Verified most expensive product in or out of stock and email communication
 When User Clicks on Boxing & MMA tab
 And User clicks in Display and select 96
 And User clicks on Sort By and select by price
 And User choose the most expensive product
 Then Verified if the product is available or out of stock
 And User clicks in the + icon 
 And User clicks on facebook icon
 Then Verified header text if user can see facebook login page 
 
 