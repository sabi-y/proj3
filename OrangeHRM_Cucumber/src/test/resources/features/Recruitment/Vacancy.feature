@addVacancy
Feature: Vacancy. Add and Edit

  Background: Login to Orange HRM using Admin credentials
    Given I go to OrangeHRM website "https://opensource-demo.orangehrmlive.com/"
    And I login using "Admin" and "admin123"
    And I should see OrangeHRM dashboard home page

  Scenario Outline: 
    Given click Recrutiment on the side
    And I click Vacancies on the top
    And I click Add Vacancy button
    And I enter "<Vacancy Name>" as a VacancyName
    And I select "<Job Title>" in JobTitles
    And I enter "<Description>" in Description
    And I select "<Hiring Manager>" from Hiring Managers
    And I enter  "<Number of Positions>"  in the Number of positions
    And I edit the "<Description>" in the Description
    When I click Vacancy Save button
    And I click Vacancies on the top
    And I search by Status
    And I search by JobTitle
    And I close the browser

    Examples: 
      | Vacancy Name            		 | Job Titile  | Description | Hiring Manager | Number of Positions |
      | QA Tester Cucumber Serenity  | QA Engineer | QA          | Odis Adalwin   |                   2 |
