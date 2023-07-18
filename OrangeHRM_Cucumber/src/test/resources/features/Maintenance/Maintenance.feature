@Maintenance
Feature: Purge

  Background: Login to Orange HRM using Admin credentials
    Given I go to OrangeHRM website "https://opensource-demo.orangehrmlive.com/"
    And I login using "Admin" and "admin123"
    And I should see OrangeHRM dashboard home page

  Scenario Outline: 
    Given I click Mainenance on the left side
    And I am redirected to the newLogIn
    Then I enter password
    And I press confirm
    And I enter past employee name and click search
    And I verify the name and click purge
    And I log out from OrangeHRM application
    And I close the browser
