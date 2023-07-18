package com.cucumber.pages;

import org.openqa.selenium.WebDriver;

import com.cucumber.stepdefs.PIMUpdateTerminate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class PIMUpdateTerminateDefs {

	//@Managed(driver = "chrome", options = "headless")
	@Managed(driver = "chrome")
	WebDriver driver;

	@Steps
	PIMUpdateTerminate PIMUT;


	@Given("I click PIM on the left side")
	public void i_click_pim_on_the_left_side() throws Exception {
		PIMUT.i_click_pim_on_the_left_side();
	}

	@Given("I click Employee List")
	public void i_click_employee_list() throws Exception  {
		PIMUT.i_click_employee_list();
	}

	@Given("I type an Employee Name and click search")
	public void i_type_an_employee_name_and_click_search()throws Exception  {
		PIMUT.i_type_an_employee_name_and_click_search();
	}

	@Given("click Action Edit")
	public void click_action_edit()throws Exception  {
		PIMUT.click_action_edit();
	}

	@Given("I click {string} and enter Emploee ID")
	public void i_click_and_enter_emploee_id(String employeeID)throws Exception  {
		PIMUT.i_click_and_enter_emploee_id(employeeID);
	}

	@Given("press Save Personal Details")
	public void press_save_personal_details()throws Exception  {
		PIMUT.press_save_personal_details();
	}

	@Given("I add Emergency COntact")
	public void i_add_emergency_c_ontact()throws Exception  {
		PIMUT.i_add_emergency_c_ontact();
	}

	@Given("I enter {string} for name field")
	public void i_enter_for_name_field(String name)throws Exception  {
		PIMUT.i_enter_for_name_field(name);
	}

	@Given("I enter {string} for relationship")
	public void i_enter_for_relationship(String string) throws Exception {
		
		PIMUT.i_enter_for_relationship(string);
		
	}

	@Given("I enter {string} for mobile")
	public void i_enter_for_mobile(String mobile)throws Exception  {
		PIMUT.i_enter_for_mobile(mobile);
	}
	@When("I click Job button")
	public void i_click_job_button() throws Exception {
		PIMUT.i_click_job_button();
	}

	@When("I click Save Emergency Contact button")
	public void i_click_save_emergency_contact_button()throws Exception  {
		PIMUT.i_click_save_emergency_contact_button();
	}

	@When("I upload an attachment")
	public void i_upload_an_attachment() throws Exception {
		
		PIMUT.i_upload_an_attachment();
	}

	@Then("click Terminate Employement")
	public void click_terminate_employement() throws Exception {
		PIMUT.click_terminate_employement();
	}

	@Then("I select reason")
	public void i_select_reason() throws Exception {
		PIMUT.i_select_reason();
	}
	@Then("click {string} as a Terminate Employement")
	public void click_as_a_terminate_employement(String date)throws Exception  {
	    PIMUT.click_as_a_terminate_employement(date);
	}

	@Then("I press save Terminate Employement")
	public void i_press_save_terminate_employement() throws Exception {
		PIMUT.i_press_save_terminate_employement();

	}



}
