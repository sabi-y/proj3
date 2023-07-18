package com.cucumber.pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;



public class CandidateAdd extends PageObject {
	
	// @Managed(driver = "chrome", options = "headless")
	@Managed(driver = "chrome")
	WebDriver driver;

	
	
	@Step("I click Candidates on the top")
	public void i_click_candidates_on_the_top() throws Exception {
		
		
		Thread.sleep(1000);
		
		withTimeoutOf(Duration.ofSeconds(10))
	    .find
	    (By.linkText("Candidates"))
	    .click();
		
		WebElement actualElement = getDriver().findElement(By.linkText("Candidates"));
        String actualText = actualElement.getText();
        Assertions.assertThat(actualText).isEqualTo("Candidates");

//		WebElement Candidates = getDriver().findElement(By.linkText("Candidates"));
//		withAction().click(Candidates).pause(1000).build().perform();
		Thread.sleep(1000);
	}

	@Step("I click Add Candidate button")
	public void i_click_add_candidate_button() throws Exception {
		
		Thread.sleep(1000);
		withTimeoutOf(Duration.ofSeconds(10))
	    .find(By.cssSelector("button.oxd-button--secondary:nth-child(1)"))
	    .click();
//	    
//		WebElement Add = getDriver().findElement
//		(By.cssSelector("button.oxd-button--secondary:nth-child(1)"))
//		;
//		withAction().click(Add).perform();
		Thread.sleep(1000);
		}

	@Step("I enter {string} as a First Name")
	public void i_enter_as_a_first_name(String fName) throws Exception {
		
		WebElement FirstName = getDriver().findElement(By.cssSelector(".orangehrm-firstname"));
		withAction().click(FirstName).sendKeys(fName).pause(1000).perform();
		Thread.sleep(1000);
	}

	@Step("I enter {string} as a Middle Name")
	public void i_enter_as_a_middle_name(String mName) throws Exception {
		Thread.sleep(1000);
		withAction().sendKeys(Keys.TAB).sendKeys(mName).build().perform();
		Thread.sleep(1000);
	}

	@Step("I enter {string} as a Last name")
	public void i_enter_as_a_last_name(String lName) {
		withAction().sendKeys(Keys.TAB).pause(1000).sendKeys(lName).pause(1000).build().perform();
	}

	@Step("I select {string} in Vacancy")
	public void i_select_in_vacancy(String string) {
		WebElement vacancy = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[2]"));
		withAction().click(vacancy).pause(1000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).
		
		build().perform();
		
	}

	@Step("I enter {string} in Email")
	public void i_enter_in_email(String emailmail) throws Exception {
		Thread.sleep(1000);
		withAction().sendKeys(Keys.TAB).pause(1000).sendKeys(emailmail).build().perform();
		Thread.sleep(1 * 1000);
	}

	@Step("I enter  {string}  in the Contact Number")
	
	public void i_enter_in_the_contact_number(String numba) throws Exception {
		
		Thread.sleep(1 * 2000);
		withAction().sendKeys(Keys.TAB).sendKeys(numba).pause(1000).build().perform();;
		Thread.sleep(1 * 1000);
	}

	@Step("I click Candidate Save button")
	public void i_click_candidate_save_button() throws Exception {
		
		
		Thread.sleep(1 * 2000);
		withTimeoutOf(Duration.ofSeconds(10))
	    .find(By.cssSelector("button.oxd-button:nth-child(3)"))
	    .click();
		
		Thread.sleep(1 * 1000);
		
	}

	@Step("I click Shortlist and Save")
	public void i_click_shortlist_and_save() throws Exception {
		Thread.sleep(1 * 4000);
		
		WebElement actualElement =  getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[1]/p"));
		String actualText = actualElement.getText();
        Assertions.assertThat(actualText).isEqualTo("Status: Application Initiated");

		
		Thread.sleep(1000);
		withTimeoutOf(Duration.ofSeconds(10))
         .find(By.cssSelector
        		 ("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div.orangehrm-card-container > form > div.orangehrm-recruitment > div.orangehrm-recruitment-actions > button.oxd-button.oxd-button--medium.oxd-button--success"))
         .click();
          
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.cssSelector
				//("button.oxd-button:nth-child(2)"))
		("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"))
      	.click();
		Thread.sleep(1000);
		}

	@Step("I click Schedule Interview")
	public void i_click_schedule_interview() throws Exception {
		
		Thread.sleep(4000);
		WebElement actualElement =  getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[1]/p"));
		String actualText = actualElement.getText();
        Assertions.assertThat(actualText).isEqualTo("Status: Shortlisted");
		
		
		Thread.sleep(1000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"))
      	.click();
		Thread.sleep(1000);

	}

	@Step("I enter Interview Title and choose Interviewer")
	public void i_enter_interview_title_and_choose_interviewer()  throws Exception {
	
		Thread.sleep(4000);
		
		WebElement iTitle = getDriver().findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(2) > div > div:nth-child(1) > div > div:nth-child(2) > input"));
		withAction().moveToElement(iTitle).click(iTitle).sendKeys("QA").
		sendKeys(Keys.TAB).pause(1000).sendKeys("odis").sendKeys(Keys.SPACE).pause(5000).sendKeys("\uE015").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//		
//		
//		sendKeys(Keys.TAB).pause(1000).sendKeys("Odis").pause(1000).
//		sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.ENTER).sendKeys(Keys.TAB).
//		build().perform();;
		Thread.sleep(3000);
	
	
	}
//
//	@Step("I select {string} Interviewer")
//	public void i_select_interviewer(String string) throws Exception {
//		
//		Thread.sleep(1000);
//		
//		withTimeoutOf(Duration.ofSeconds(10))
//	    .find(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(2) > div > div:nth-child(2) > div > div > div:nth-child(2) > div > div > input"))
//	    .click();
//		
////		withAction().sendKeys("odis").pause(2000).sendKeys(Keys.TAB).pause(2000).sendKeys(Keys.ENTER).build().perform();
////		Thread.sleep(3000);
//	
//		withAction().sendKeys("Odis").pause(3000).sendKeys(Keys.ARROW_DOWN).pause(3000).sendKeys(Keys.ENTER).build().perform();;
//		Thread.sleep(3000);
////		withTimeoutOf(Duration.ofSeconds(10))
////	    .find(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input"))
////	    .type(string);
////		withAction().pause(2000).sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.ENTER).build().perform();
////		
//	//withAction().pause(1000).sendKeys("o").pause(getImplicitWaitTimeout())
//	}

	@Step("I enter Date")
	public void i_enter_date() throws Exception {
	Thread.sleep(1000);
	
	WebElement dateTime =	getDriver().findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(2) > div > div:nth-child(3) > div > div:nth-child(2) > div > div > input"));
	dateTime.click();
	dateTime.sendKeys("2023-08-01");
	
	Thread.sleep(1000);
//	
//
//	WebElement buttonSave =	getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
//	buttonSave.click();
	
	//	withTimeoutOf(Duration.ofSeconds(10))
//    .find	(By.cssSelector("oxd-input oxd-input--active"))
//    .type("2023-08-01");
//	withAction().sendKeys(Keys.ENTER).perform();;
////	
//	WebElement TimeDate = getDriver().findElement
//			
//			(By.cssSelector("oxd-input oxd-input--active"));
//	withAction().moveToElement(TimeDate).sendKeys("2023-08-01").pause(2000).sendKeys(Keys.ENTER).build().perform();
//	
	Thread.sleep(1000);
	
	}


	@Step("I click Interview Save")
	public void i_click_interview_save() throws Exception {

		WebElement buttonSave =	getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
		buttonSave.click();
		Thread.sleep(1000);	
		
	}

	@Step("I click Interview Passed and Notes and Save")
	public void i_click_interview_passed_and_notes_and_save()throws Exception {
		
		
		Thread.sleep(4000);
		WebElement actualElement =  getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[1]/p"));
	    String actualText = actualElement.getText();
	    Assertions.assertThat(actualText).isEqualTo("Status: Interview Scheduled");
		
		
		Thread.sleep(1000);	
		WebElement mark = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));
		withAction().moveToElement(mark).pause(2000).click().build().perform();
		
		Thread.sleep(000);
		
		
		WebElement notesInterview  = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/textarea"));
		notesInterview.click();
		notesInterview.sendKeys("Great candidate, Green light");
		
		withTimeoutOf(Duration.ofSeconds(10))
	      .find(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"))
	      .click();
		Thread.sleep(3000);
	}

	@Step("I click offer Job and Save")
	public void i_click_offer_job_and_save() throws Exception {
		Thread.sleep(4000);
		
		WebElement actualElement =  getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[1]/p"));
	    String actualText = actualElement.getText();
	    Assertions.assertThat(actualText).isEqualTo("Status: Interview Passed");
	    
		withTimeoutOf(Duration.ofSeconds(10))
	      .find    
			 (By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"))
			 .click();
		Thread.sleep(3000);
		
		
	withTimeoutOf(Duration.ofSeconds(10))
    .find    
    (By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"))
	 .click();
	Thread.sleep(3000);
	
	}
	

	
	@Step("I click Hire and Save")
	public void i_click_hire_and_save() throws Exception {
		Thread.sleep(3000);
		WebElement actualElement =  getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[1]/p"));
	    String actualText = actualElement.getText();
	    Assertions.assertThat(actualText).isEqualTo("Status: Job Offered");
		
		
		withTimeoutOf(Duration.ofSeconds(10))
	    .find    
	    (By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"))
	    .click();
		Thread.sleep(3000);
	withTimeoutOf(Duration.ofSeconds(10))
    .find    
    (By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"))
	.click();
	Thread.sleep(4000);
	
	WebElement status = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[1]/p"));
	String statusnew = status.getText();
	System.out.println(statusnew);
	
	assertEquals(statusnew, "Status: Hired");
	
	}
}
