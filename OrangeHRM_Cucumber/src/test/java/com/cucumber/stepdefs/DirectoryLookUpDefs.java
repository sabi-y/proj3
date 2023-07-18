package com.cucumber.stepdefs;

import org.openqa.selenium.WebDriver;

import com.cucumber.pages.DirectoryLookUp;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class DirectoryLookUpDefs {
	
	//@Managed(driver = "chrome", options = "headless")
		@Managed(driver = "chrome")
		WebDriver driver;
		
		@Steps
		DirectoryLookUp dlp;
		
	
	@Given("I click Directory on the left side and verify directory page")
	public void i_click_directory_on_the_left_side_and_verify_directory_page() throws Exception {
	    dlp.i_click_directory_on_the_left_side_and_verify_directory_page();
	}

	@Given("I search employee by location")
	public void i_search_employee_by_location() throws Exception{
	   dlp.i_search_employee_by_location();
	}

	@Given("I select an emploeyee and verify their location")
	public void i_select_an_emploeyee_and_verify_their_location() throws Exception{
	   dlp.i_select_an_emploeyee_and_verify_their_location();
	}
	}

	
