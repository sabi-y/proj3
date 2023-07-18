package com.cucumber.stepdefs;

import org.openqa.selenium.WebDriver;

import com.cucumber.pages.AddEditVacancy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class VacancyAddEditDefs {
	
	//@Managed(driver = "chrome", options = "headless")
	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Steps
	AddEditVacancy addeditV;
	
	@Given("click Recrutiment on the side")
	public void click_recrutiment_on_the_side() throws Exception {
		
		addeditV.click_recrutiment_on_the_side();
	}
	
	
	@Given("click Vacancies on the top")
	public void click_vacancies_on_the_top() throws Exception {
		addeditV = new AddEditVacancy();
		addeditV.i_click_vacancies_on_the_top();
		
	}

	@Given("I click Add Vacancy button")
	public void i_click_add_vacancy_button() throws Exception{
		addeditV.i_click_add_vacancy_button();
	}

	@Given("I enter {string} as a VacancyName")
	public void i_enter_as_a_vacancy_name(String vacancyName)throws Exception {
		addeditV.i_enter_as_a_vacancy_name(vacancyName);
	}

	@Given("I select {string} in JobTitles")
	public void i_select_in_job_titles(String Q) throws Exception {
		addeditV.i_select_in_job_titles(Q);
	}

	@Given("I enter {string} in Description")
	public void i_enter_in_description(String descrip) throws Exception{
		addeditV.i_enter_in_description(descrip);
	}

	@Given("I select {string} from Hiring Managers")
	public void i_select_from_hiring_managers(String Man) throws Exception{
		addeditV.i_select_from_hiring_managers(Man);
	}

	@Given("I enter  {string}  in the Number of positions")
	public void i_enter_in_the_number_of_positions(String number) throws Exception{
		addeditV.i_enter_in_the_number_of_positions(number);
	}

	@When("I click Vacancy Save button")
	public void i_click_vacancy_save_button() throws Exception {
		addeditV.i_click_vacancy_save_button();
	}

	@When("I click Vacancies on the top")
	public void i_click_vacancies_on_the_top() throws Exception {
		
		addeditV.i_click_vacancies_on_the_top();
	}

	@When("I edit the {string} in the Description")
	public void i_edit_the_in_the_description(String descrip2) throws Exception {
		addeditV.i_edit_the_in_the_description(descrip2);
	}

	@When("I search and select Vacancy")
	public void i_search_and_select_vacancy() throws Exception {
		addeditV.i_search_and_select_vacancy();
	}
	
	@When("I close the browser")
	public void i_close_the_browser() {
		addeditV.i_close_the_browser();
	}


}
