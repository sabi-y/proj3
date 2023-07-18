package com.cucumber.pages;

import java.time.Duration;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;

public class MaintenancePurge extends PageObject {
		
		// @Managed(driver = "chrome", options = "headless")
		@Managed(driver = "chrome")
		WebDriver driver;
		
	
		@Step("I click Mainenance on the left side")
	public void i_click_mainenance_on_the_left_side() throws Exception {
	   
			withTimeoutOf(Duration.ofSeconds(10))
			.find(By.linkText("Maintenance"))
			.click();
			Thread.sleep(2000);

			
	}

		@Step("I am redirected to the newLogIn")
	public void i_am_redirected_to_the_new_log_in() throws Exception {
			
			
		    WebElement actualElement =  getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/h6"));
	        String actualText = actualElement.getText();
	        Assertions.assertThat(actualText).isEqualTo("Administrator Access");
	}

		@Step("I enter password")
		public void i_enter_password() throws Exception  { 
			
			withTimeoutOf(Duration.ofSeconds(10))
			.find(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[3]/div/div[2]/input"))
			.type("admin123");
			Thread.sleep(2000);
	}

		@Step("I press confirm")
	public void i_press_confirm() throws Exception {
			withTimeoutOf(Duration.ofSeconds(10))
			.find(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[4]/button[2]"))
			.click();
			
	}

		@Step("I enter past employee name and click search")
	public void i_enter_past_employee_name_and_click_search()throws Exception  {
			
			Thread.sleep(2000);
			WebElement actualElement =  getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]"));
	        String actualText = actualElement.getText();
	        Assertions.assertThat(actualText).isEqualTo("Maintenance");
			
	        Thread.sleep(2000);
	        withTimeoutOf(Duration.ofSeconds(10))
			.find(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/div/div/input")
			).type("roger r");
	        
	        withAction().pause(2000).sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.ENTER)
	        .build().perform();
	        Thread.sleep(2000);
			
			
	        withTimeoutOf(Duration.ofSeconds(10))
			.find(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button"))
			.click();
	        Thread.sleep(2000);
	        
	}

		@Step("I log out from OrangeHRM applicaion")
		public void i_log_out_from_orange_hrm_applicaion() {
		    WebElement userProfileDropDownElem = getDriver().findElement(By.cssSelector("div.oxd-topbar-header-userarea > ul > li > span > p"));
		    userProfileDropDownElem.click();
		    
		    WebElement logoutElem = getDriver().findElement(By.linkText("Logout"));
		    logoutElem.click();
		}
	

		@Step("I click purge")
	public void i_click_purge()throws Exception  {
			
		     Thread.sleep(2000);
			
	        Thread.sleep(2000);
	        withTimeoutOf(Duration.ofSeconds(10))
			.find(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/form/div[2]/button"))
			.click();
	        
	        

	        Thread.sleep(2000);
	        withTimeoutOf(Duration.ofSeconds(10))
			.find(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"))
			.click();
	}
	}



