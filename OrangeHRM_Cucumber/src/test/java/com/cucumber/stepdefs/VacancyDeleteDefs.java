package com.cucumber.stepdefs;

import org.openqa.selenium.WebDriver;

import com.cucumber.pages.VacancyAddDelete;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class VacancyDeleteDefs extends PageObject {
	
	
	
	//@Managed(driver = "chrome", options = "headless")
	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Steps
	VacancyAddDelete Vad;
	
	
	@Given("I enter {string}\" as a VacancyName")
	public void i_enter_as_a_vacancy_name(String VacancyName2) {
		Vad.i_enter_as_a_vacancy_name(VacancyName2);

	}

	@When("I delete the Vacancy")
	public void i_delete_the_vacancy() throws Exception {
		Vad.i_delete_the_vacancy();
	}

	@Given("I enter another {string} as a VacancyName")
	public void i_enter_another_as_a_vacancy_name(String string) {
	 Vad.i_enter_another_as_a_vacancy_name(string);
	 }

	@Given("I enter different {string}  in the Number of positions")
	public void i_enter_different_in_the_number_of_positions(String string) {
	  Vad.i_enter_different_in_the_number_of_positions(string);  
	}

	@When("I search by Status")
	public void i_search_by_status() throws Exception {
		Vad.i_search_by_status();
	}

	@When("I search by JobTitle")
	public void i_search_by_job_title() throws Exception {
		Vad.i_search_by_job_title();

	}

	
	}


