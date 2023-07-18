@CandidateHire
Feature: Candidate. Application process.

  Background: Login to Orange HRM using Admin credentials
  
    Given I go to OrangeHRM website "https://opensource-demo.orangehrmlive.com/"
    And I login using "Admin" and "admin123"
    And I should see OrangeHRM dashboard home page
   

  Scenario Outline:  
  
  	Given click Recrutiment on the side
    And I click Add Candidate button
    And I enter "<First Name>" as a First Name
    And I enter "<Middle Name>" as a Middle Name
    And I enter "<Last name>" as a Last name
    And I select "<Vacancy>" in Vacancy
    And I enter "<Email>" in Email
    And I enter  "<ContactNumber>"  in the Contact Number
    Then I click Candidate Save button
    And I click Shortlist and Save
    And I click Schedule Interview
    And I enter Interview Title and choose Interviewer
    And I enter Date
    And I click Interview Save
    And I click Interview Passed and Notes and Save
    And I click offer Job and Save
    Then I click Hire and Save
    And I close the browser

    Examples: 
      | First Name | Middle Name | Last name | Vacancy | Email             | ContactNumber |
      | Roger      | R           | Corne     | Q       | admin@example.com | 8001234567    |


