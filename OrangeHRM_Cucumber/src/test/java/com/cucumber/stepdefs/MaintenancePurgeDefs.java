package com.cucumber.stepdefs;

import com.cucumber.pages.MaintenancePurge;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class MaintenancePurgeDefs {

	@Steps 
	MaintenancePurge mp;



	@Given("I click Mainenance on the left side")
	public void i_click_mainenance_on_the_left_side() throws Exception{
		mp.i_click_mainenance_on_the_left_side();
	}

	@Given("I am redirected to the newLogIn")
	public void i_am_redirected_to_the_new_log_in()throws Exception {
		mp.i_am_redirected_to_the_new_log_in();
	}

	@Then("I enter password")
	public void i_enter_password() throws Exception{

		mp.i_enter_password();
	}

	@Then("I press confirm")
	public void i_press_confirm()throws Exception {
		mp.i_press_confirm();
	}

	@Then("I enter past employee name and click search")
	public void i_enter_past_employee_name_and_click_search() throws Exception{
		mp.i_enter_past_employee_name_and_click_search();
	}

	@Then("I verify the name and click purge")
	public void i_click_purge()throws Exception {
		mp.i_click_purge();
	}
	
	@Then("I log out from OrangeHRM applicaion")
	public void i_log_out_from_orange_hrm_applicaion() {
		mp.i_log_out_from_orange_hrm_applicaion();
	
	}
	}
