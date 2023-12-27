Feature: Check logIn

  #Scenario: Verify login with valid credentials
    #Given user on login page
    #When user enter "mngr544011" and "AhYmAny"
    #And user Click on logIn Button
    #Then User NAvigate on HomePage


 Scenario Outline: Verify login with valid credentials
    Given user on login page
    When user enter "<username>" and "<password>"
    And user Click on logIn Button
    Then User NAvigate on HomePage

    Examples:
        |username|password|
        |mngr544011|AhYmAny|
         |mngr544011|Anythinngs|