Feature: Check the login functionality in MultiCart
   Scenario: Sucessfully login in Multicart
    Given Open my chrome browser land multicart home page
   When I Enter Valid "Jin" and "2134"
   Then veriy user sucessfully login on "true"

 
  Scenario: User Enter Valid user and Invalid password
    Given Open my chrome browser land multicart home page
    When I Enter Valid "Jonijinn" and "2135554"
   Then veriy user sucessfully login on "false"

   