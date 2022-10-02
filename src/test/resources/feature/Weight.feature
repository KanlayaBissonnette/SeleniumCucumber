Feature: Weight Functionality

  Background: 
    Given User naviagte to browser

  @Test1
  Scenario: TC001_Weight_Verify Categories in weight products
    When User click Weight tab
    Then User verify Weight Header Text is displayed
    And User click home button
    Then User verify if navigte back to homepage
    And User click Weight tab
    And User click back button
    Then User verify back button
    And User click  Weight tab
    Then User verify three categories under weight tab is clickable

  @Test2
  Scenario: TC002_Weight_Verify Dumbbells header text
    When User hover to weight tab
    Then User verify categories under weight tab
    And User click on Dumbbells tab
    Then User verify Dumbells text appeared

  @Test3
  Scenario: TC003_Weight_Verify Product description and Reviews
    When User hover to weight tab
    And User click on dumbbells tab
    And User click on sort by box click price(Asc)
    Then User verify product  prices
    And User click on any item
    And User click description button
    Then User verify product description
    And User click review button
    Then User verify product review

  @Test4
  Scenario: TC004_Weight_Verify User can add product to shopping cart
    When User hover to weight tab
    And User click dumbbells tab
    And User click on sort by box click price(Asc)
    And User click lowest price item
    And User click add to cart
    Then User verify can clickable to shopping cart
    Then User verify shopping cart
