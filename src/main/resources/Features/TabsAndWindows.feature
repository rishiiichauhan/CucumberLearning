Feature: Verify the functionality of new Tabs and Windows
  
  As a user 
  I want to verify the functionality of new Tabs and Windows
  So that I can automate it in future

@Demo
  Scenario: Verify the functionality of new Tab and Windows
    Given User is on the registration page "https://demoqa.com/browser-windows"
    When User click on the New Tab button
    And Click on the New Window button
    And Click on the New Window Image button
    Then User should be able to open the New Tab
    And User should be able to open New Window
    And User should be able to open New Window Message
