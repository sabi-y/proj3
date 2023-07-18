@Directory
Feature: Look up

  Background: Login to Orange HRM using Admin credentials
    Given I go to OrangeHRM website "https://opensource-demo.orangehrmlive.com/"
    And I login using "Admin" and "admin123"
    And I should see OrangeHRM dashboard home page

  Scenario Outline: 
    Given I click Directory on the left side and verify directory page
    And I search employee by location
    And I select an emploeyee and verify their location
    And I close the browser
