@DeleteVacancy
Feature: Vacancy. Add and Delete

  Background: Login to Orange HRM using Admin credentials
    Given I go to OrangeHRM website "https://opensource-demo.orangehrmlive.com/"
    And I login using "Admin" and "admin123"
    And I should see OrangeHRM dashboard home page

  Scenario Outline: 
    Given click Recrutiment on the side
    And I click Vacancies on the top
    And I click Add Vacancy button
    And I enter another "<Vacancy Name>" as a VacancyName
    And I select "<Job Title>" in JobTitles
    And I enter "<Description>" in Description
    And I select "<Hiring Manager>" from Hiring Managers
    And I enter different "<Number of Positions>"  in the Number of positions
    When I click Vacancy Save button
    And I click Vacancies on the top
    And I search by Status
    And I search by JobTitle
    And I delete the Vacancy
    And I close the browser

    Examples: 
      | Vacancy Name                | Job Titile  | Description | Hiring Manager | Number of Positions |
      | QA Tester Cucumber&Selenium | QA Engineer | QA          | Odis Adalwin   |                   1 |
