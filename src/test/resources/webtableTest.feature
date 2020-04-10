Feature: Webtable Automation
  As a Eng I need to automate a Web table in different 

  Scenario: Successfull Add Opreation on Web table
    Given I land on webtable page 
 		And I start add operation
 		When I complete the add user form
 		Then I expect to see the user in webtable