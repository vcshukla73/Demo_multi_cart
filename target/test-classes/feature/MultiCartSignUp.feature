Feature: User Will land on Demoscript Home Page and 
				 signup for new user
  Scenario: Signup New User For Demoscript Shopecart
    Given Intialize browser with Chrome 
    And land on Demoscript home page
    And I click on sign up button
    When I enter information regarding new user
    Then I validate new user create sucessfully