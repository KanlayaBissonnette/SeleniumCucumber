Feature: Strength Equipment Functionality

Background: 
  Given User is on Home Page

  @tag1
  Scenario Outline: StrengthEquipment_TC001
  When Hover on Strength Equipment tab
  And Click on ‘Squat / Power Racks’
  And Click on ‘Smith Machines’ from sub category
  And Click add cart on Altas AL3058 All-in-One Trainer
	And Click ‘checkout’
	Then Verify product detail such as product number / product name / Qty / price / total
	Then Verify update button / clear button / checkout button are display and enable
	And Click ‘checkout’ button
	Then User can see payment method 
	And Fill random info in ‘billing info’ all requirement box
	And Select free shipping on radio button
	And Select PayPal radio button
	And Click ‘I have read and agree to the Terms and Conditions’ box
	And Click place order
	Then Verify that user is navigated to Paypal website
	
	@tag2
	Scenario Outline: StrengthEquipment_TC002
	When Hover on Strength Equipment tab
  And Click on ‘Squat / Power Racks’
  And Click on ‘Smith Machines’ from sub category
	And Input "<numbers>" to QTY box of item3058 and SD360 and click add to cart
	And Shopping cart should be displayed qty only "<allowedNumber>"
	And click add to cart of SD360
	Then Warning icon should pops-up
	And Hover warning pops-up
	Then User should see warning message
	
	Examples:
	|numbers|allowedNumber|
	|20000000|10000000|
	
