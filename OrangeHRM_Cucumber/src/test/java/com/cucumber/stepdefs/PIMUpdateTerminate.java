package com.cucumber.stepdefs;

import java.time.Duration;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;

public class PIMUpdateTerminate extends PageObject {
	
	// @Managed(driver = "chrome", options = "headless")
	@Managed(driver = "chrome")
	WebDriver driver;



	@Step("I click PIM on the left side")
	public void i_click_pim_on_the_left_side() throws Exception {

		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.linkText("PIM")).click();

		Thread.sleep(2000);

		WebElement actualElement =  getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		String actualText = actualElement.getText();
		Assertions.assertThat(actualText).isEqualTo("PIM");

	}

	@Step("I click Employee List")
	public void i_click_employee_list() throws Exception {

		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]"))
		.click();

		Thread.sleep(2000);
	}

	@Step("I type an Employee Name and click search")
	public void i_type_an_employee_name_and_click_search() throws Exception {

		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"))
		.type("Roger");
		Thread.sleep(2000);
		
		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"))
		.click();
		Thread.sleep(2000);
	}

	@Step("click Action Edit")
	public void click_action_edit() throws Exception {
		
		
		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[2]/i"))
		.click();
		Thread.sleep(2000);
		
		
	}

	@Step("I click {string} and enter Emploee ID")
	public void i_click_and_enter_emploee_id(String employeeID)throws Exception  {
		
		Thread.sleep(2000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input"))
		.type(employeeID);
		Thread.sleep(2000);
	}

	@Step("press Save Personal Details")
	public void press_save_personal_details()throws Exception  {
		
		Thread.sleep(2000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button"))
		.click();
		Thread.sleep(2000);
	}

	@Step("I add Emergency COntact")
	public void i_add_emergency_c_ontact() throws Exception {
		
		Thread.sleep(2000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a"))
		.click();
		Thread.sleep(2000);
		
		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button"))
		.click();
		
	}

	@Step("I enter {string} for name field")
	public void i_enter_for_name_field(String name)throws Exception  {
		
		Thread.sleep(2000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"))
		.type(name);
		
		Thread.sleep(2000);
		
	}

	@Step("I enter {string} for relationship")
	public void i_enter_for_relationship(String string)throws Exception  {
		Thread.sleep(2000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"))
		.type(string);
		
	}

	@Step("I enter {string} for mobile")
	public void i_enter_for_mobile(String mobile) throws Exception {
		Thread.sleep(2000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input"))
		.type(mobile);
		Thread.sleep(2000);
	}

	@Step("I click Save Emergency Contact button")
	public void i_click_save_emergency_contact_button()throws Exception  {
		Thread.sleep(2000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]"))
		.click();
		
		}
	
	@Step("I click Job button")
	public void i_click_job_button() throws Exception{
	   
		//JOB button
				Thread.sleep(2000);
				withTimeoutOf(Duration.ofSeconds(10))
				.find
				(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[6]/a"))
				.click();
				Thread.sleep(2000);
	
	}

	@Step("I upload an attachment")
	public void i_upload_an_attachment() throws Exception {
		
		String filePath = "/Users/sabina/Downloads/OrangeHRM_Cucumber 2/src/test/resources/Attachment.txt";
		
		Thread.sleep(2000);
		
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button"))
		.click();
		
		
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[2]"))
		.sendKeys(filePath);
		Thread.sleep(3000);
		
		
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/button[2]"))
		.click();
		Thread.sleep(3000);
		
		
		
//		Actor actor = Actor.named("John");
//		actor.can(BrowseTheWeb.with(driver));
//
//		Target fileInput = Target.the("File input field")
//		        .located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/i"));
//		
//		Path filePath = Paths.get("/Users/sabina/Downloads/OrangeHRM_Cucumber 2/src/test/resources/Attachment.txt");
//
//		// Perform the upload action
//		actor.attemptsTo(
//				Upload.theFile(filePath)
//			    .to(fileInput.resolveFor(actor)));
//		                
	

//		
		
//		upload("/Users/sabina/Downloads/OrangeHRM_Cucumber 2/src/test/resources/Attachment.txt").to((WebElement) 
//				By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/i"));
		
//		String filePath = "/Users/sabina/Downloads/OrangeHRM_Cucumber 2/src/test/resources/Attachment.txt";
		//fileInput = find(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/i"));
//
//		//		fileInput.click();
//		
//		FileToUpload fileToUpload = new FileToUpload(getDriver(), filePath);
//		fileToUpload.fromLocalMachine().to(fileInput);
////		
//		Actor actor = theActorCalled("Someone");
//        actor.can(BrowseTheWeb.with(getDriver()));
//
//        Target fileInput = Target.the("File input field").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/i"));
//
//        actor.attemptsTo(
//                Upload.theFile(filePath)
//                        .to(fileInput)
//                        .fromLocalMachine()  );
      
    
		Thread.sleep(2000);
	}

	@Step("click Terminate Employement")
	public void click_terminate_employement() throws Exception {
		Thread.sleep(2000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/button"))
	
		.click();
		Thread.sleep(2000);
	
	}
	
	@Step("click {string} as a Terminate Employement")
	public void click_as_a_terminate_employement(String date) throws Exception{
		
		Thread.sleep(2000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/div/div/form/div[1]/div/div[2]/div/div/i"))
		.click();
		withAction().sendKeys(date).sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		
	
	
	}

	@Step("I select reason")
	public void i_select_reason()throws Exception  {
		Thread.sleep(2000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/div/div/form/div[2]/div/div[2]/div/div"))
		.click();
		
		withAction().sendKeys("d").sendKeys(Keys.ENTER).build().perform();
		
		
		}

	@Step("I press save Terminate Employement")
	public void i_press_save_terminate_employement() throws Exception {
		Thread.sleep(2000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/div/div/form/div[4]/button[2]"))
		.click();
		
		Thread.sleep(5000);
		}


		}
