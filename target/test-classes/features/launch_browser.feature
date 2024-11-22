Feature: Launch Browser

  Scenario Outline: Open the browser and verify title
    Given the browser is launched
    When I open the URL "https://www.google.com/"
    And search Automation
    Then the page title should be "Google"
    
     | username  | password   | message         |
    
   
