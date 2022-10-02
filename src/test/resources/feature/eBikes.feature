Feature: eBikes Functionality

  Background: 
    Given User navigate to Homepage
    When User Click on <eBike> menu bar

  @test1
  Scenario: TC001 Verify eBikesURL and Purchaseable
    Then User should navigate to eBike Page
    And User should see all available product to purchase

  @test2
  Scenario: TC002_Verify All Purchaseable eBikes are Clickable
    Then Get all eBikes that are available to purchase
    And VERIFY that they are Clickable

  @test3
  Scenario Outline: TC03_Verify Purchasable items can be added to cart
    Then Click on any <product>
    And Click on Add To Cart button
    Then Click checkout button
    And Verify item in cart is the same item that was selected

    Examples: 
      | product        |
      | <Cosmopolitan> |

  @test4
  Scenario Outline: TC04_Check if item in cart is REMOVABLE
    Then Click on any <product>
    And Click on Add To Cart button
    Then Click checkout button
    And Verify item in cart is the same item that was selected
    Then Click Clear button
    Then Click Ok on popUp alert
    And Verify that there are no items in cart

    Examples: 
      | product        |
      | <Cosmopolitan> |
