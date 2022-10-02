Feature: Footer Functionality

Background: 
  Given User is on Home Page

	@tag1
	Scenario Outline: FooterHeader_002_storeLocator
		When User clicks on Store Locator at the bottom of the page
		Then User can see all store locations
		
		
	@tag2	
	Scenario Outline: FooterHeader_003_TrackYourOrder
		When click on Track Your Order
		Then User can view Order Number box, Shipping Postal Code box, Shipping Email box and Check Status button
	
	@tag3	
	Scenario Outline: FooterHeader_004_Instagram
		When click on instagram icon
		Then should navigate to Fitness Avenue Instagram page