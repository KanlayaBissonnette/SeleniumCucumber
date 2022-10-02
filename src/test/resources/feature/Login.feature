Feature: Login Functionality


Background: 
  Given User is on Home Page

  @tag1
  Scenario Outline: Login_TC001_LoginWithValidEmailAndPassword
    When User click Login tab 
    And User put "<Email>" in the email box
    And User put "<Password>" in the password box
    And User click Login button
    Then User should see Logout button on the page
    
    Examples:
      |Email|Password|
      |sundaynicenight@gmail.com|Xmasisthebest!|
        
      
  @tag2    
  Scenario Outline: Login_TC002_LoginWithEmptyEmailAndPassword 
  	When User click Login tab 
    And User put empty "<Email>" in the email box
    And User put empty "<Password>" in the password box
    And User click Login button
    Then User should see error message if put empty email and empty password
    
    Examples:
      |Email|Password|
      |     |        |
      
    
  @tag3    
  Scenario Outline: Login_TC003_LoginWithErrorEmailAndPassword 
  	When User click Login tab 
    And User put error "<Email>" in the email box
    And User put error "<Password>" in the password box
    And User click Login button
    Then User should see error message if put error email and password
    
    Examples:
      |Email|Password|      
      |bdd  |behaviorDriven|
  

