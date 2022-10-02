Feature: Cardio Functionality

  Background: 
    Given User navigate to Fitnessavenue website

  @Smoke
  Scenario Outline: Cardio_001_Display
    When User click to Cardio button
    And User scroll down to click at display box
    And User click "<number>" of display
    Then User verify all elements name

    Examples: 
      | number |
      |     12 |
      |     24 |
      |     48 |
      |     96 |

  @Test2
  Scenario: Cardio_002_Cardio Drop Down
    When User hover to Cardio button
    And User click each items displayed and verify each display headers
    Then User hover to Cardio button
    And User click bikes display
    And User click Air Bikes
    And User go to SortBy and click Short Description
    And User click first product
    Then User verify ONLY Feature for this product

  @Reg
  Scenario Outline: Cardio_003_Be Able To Add Cart
    When User click to Cardio button
    And User scroll down to click sort by
    And User click on Price(ASC)
    And User click to change currency to USD on top of the right conner
    And User click on first product
    And User add product to cart
    And User click item button
    Then User verify product number, product name and item price
    And User click quantity box
    And User enter number "<quantity>" in quantity box
    And User click Update Button and click cardio button
    Then User Verify shopping cart on the left side of website

    Examples: 
      | quantity |
      |        5 |

  @Test4
  Scenario: Carido_004_Product's Slides
    When User hover to Cardio button
    And User click Rowers button
    And User click first element
    And User click all slides and User verify slides are clickable
    And User scroll down and click product information
    Then User verify product information
