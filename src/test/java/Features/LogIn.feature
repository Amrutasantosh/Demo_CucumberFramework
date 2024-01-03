Feature: Check logIn page 

  Scenario: Verify logIn with valid Username and Valid Password 
  Given User on logIn Page
    When User Enters with valid Username and Valid Password 
    And User Click on LogIn button  
    Then User Navigate on Home Page 
