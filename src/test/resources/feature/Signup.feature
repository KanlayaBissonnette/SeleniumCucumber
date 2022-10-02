Feature: Sign up Functionality

Background: 
  Given User is on Home Page

  @tag1
  Scenario Outline: SignUp _TC001_SignUpRequirementBox
    When User click SignUp button 
    And User click Register button
    Then User should see text under requirement box
    And User put Email "<Email>" in the email box
    And User put Password "<Password>" in the password box
    Then verify Email and Password with message "<EmailMessage>" and "<PasswordMessage>"
    And User fill all the requirement
    Then verify that no error message has been displayed
    
    Examples:
      |Email|Password|EmailMessage|PasswordMessage|
      |g@m.|!!11QQww|invalidEmail|strongPwd|
      |g@m.com|!!11QQ|goodEmail|MediumPwd|
      |g@m.com|!!QQ|goodEmail|WeakPwd|
      |g@m.com|!!|goodEmail|VeryWeakPwd|
      |g@m.com||goodEmail|requiredPwd|
			|g@m.com|!!11QQww|goodEmail|strongPwd|
      
#@tag1
  #Scenario Outline: SignUp _TC002_SignUpRequirementBox
    #When User click SignUp button 
    #And User click Register button
    #Then User should see text under requirement box
    #And User put goodEmail "<Email>" in the email box
    #And User put badPassword "<Password>" in the password box
    #Then verify weak password "<WeakMessage>"
    #
    #Examples:
      #|Email|Password|WeakMessage|
      #|nick@gmail.com|!!11QQ|Medium|
      #|nick@gmail.com|!!QQ|Weak|
      #|nick@gmail.com|!!|Very Weak|
      #|nick@gmail.com|Required|
    #
    
    
    
   

  
