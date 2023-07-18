package com.cucumber.stepdefs;

import org.openqa.selenium.WebDriver;

import com.cucumber.pages.CandidateAdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class CandidateAddDefs {
	//@Managed(driver = "chrome", options = "headless")
	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Steps
	CandidateAdd candidate;
	

	@Given("I click Add Candidate button")
	public void i_click_add_candidate_button() throws Exception {
		candidate.i_click_add_candidate_button();
	}

	@Given("I enter {string} as a First Name")
	public void i_enter_as_a_first_name(String fName) throws Exception {
		candidate.i_enter_as_a_first_name(fName);}

	@Given("I enter {string} as a Middle Name")
	public void i_enter_as_a_middle_name(String mName)throws Exception  {
		candidate.i_enter_as_a_middle_name(mName);}

	@Given("I enter {string} as a Last name")
	public void i_enter_as_a_last_name(String string) throws Exception {
		candidate.i_enter_as_a_last_name(string);}

	@Given("I select {string} in Vacancy")
	public void i_select_in_vacancy(String lName) throws Exception {
		candidate.i_select_in_vacancy(lName);	
		}

	@Given("I enter {string} in Email")
	public void i_enter_in_email(String emailmail) throws Exception {
		candidate.i_enter_in_email(emailmail);
	}

	@Given("I enter  {string}  in the Contact Number")
	public void i_enter_in_the_contact_number(String numba)throws Exception  {
		candidate.i_enter_in_the_contact_number(numba);
		}
	

	@Then("I click Candidate Save button")
	public void i_click_candidate_save_button()throws Exception  {
		candidate.i_click_candidate_save_button();
		}

	@Then("I click Shortlist and Save")
	public void i_click_shortlist_and_save() throws Exception {
		candidate.i_click_shortlist_and_save();
	}

	@Then("I click Schedule Interview")
	public void i_click_schedule_interview() throws Exception {
		candidate.i_click_schedule_interview();
	}

	@Then("I enter Interview Title and choose Interviewer")
	public void i_enter_interview_title_and_choose_interviewer()  throws Exception {
		candidate.i_enter_interview_title_and_choose_interviewer();
	}


	@Then("I enter Date")
	public void i_enter_date() throws Exception  {
		candidate.i_enter_date();
	}

	@Then("I click Interview Save")
	public void i_click_interview_save() throws Exception  {
		candidate.i_click_interview_save();
	}

	@Then("I click Interview Passed and Notes and Save")
	public void i_click_interview_passed_and_notes_and_save()throws Exception  {
		candidate.i_click_interview_passed_and_notes_and_save();
	}

	@Then("I click offer Job and Save")
	public void i_click_offer_job_and_save() throws Exception {
		candidate.i_click_offer_job_and_save();
	}

	@Then("I click Hire and Save")
	public void i_click_hire_and_save() throws Exception {
		candidate.i_click_hire_and_save();
	}

}
