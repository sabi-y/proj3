@PIM
Feature: Update and Delete an Employee

  Background: Login to Orange HRM using Admin credentials
    Given I go to OrangeHRM website "https://opensource-demo.orangehrmlive.com/"
    And I login using "Admin" and "admin123"
    And I should see OrangeHRM dashboard home page

  Scenario Outline: 
    Given I click PIM on the left side
    And I click Employee List
    And I type an Employee Name and click search
    And click Action Edit
    And I click "<Employee Id>" and enter Emploee ID
    And press Save Personal Details
    And I add Emergency COntact
    And I enter "<Name>" for name field
    And I enter "<Relationship>" for relationship
    And I enter "<Mobile>" for mobile
    When I click Save Emergency Contact button
    And I click Job button
    
    And click Terminate Employement
    Then click "<Termination Date>" as a Terminate Employement
    And I select reason
    And I press save Terminate Employement
    Then I close the browser

    Examples: 
      | Employee Id | Name       | Relationship | Mobile     | Termination Date |
      |        	0123| Root 			 | sister       | 8009876543 | 2023-09-01       |
