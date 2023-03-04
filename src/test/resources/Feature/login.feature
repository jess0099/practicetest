Feature: 

  Scenario Outline: Test the login page
    Given Set up the browser
    And enter the URL
    When enter the <username> and <password>
    And click on login button
    Then navigate to  Home page

    Examples: 
      | username | password |
      | Amit     |    12345 |
      | messi    |    12345 |
