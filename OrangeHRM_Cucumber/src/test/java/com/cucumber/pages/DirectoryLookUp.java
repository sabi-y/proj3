package com.cucumber.pages;

import java.time.Duration;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;

public class DirectoryLookUp extends PageObject {
	
	// @Managed(driver = "chrome", options = "headless")
	@Managed(driver = "chrome")
	WebDriver driver;

	
	
	@Step("I click Directory on the left side and verify directory page")
	public void i_click_directory_on_the_left_side_and_verify_directory_page() throws Exception{
	
		
		Thread.sleep(1000);
		
		withTimeoutOf(Duration.ofSeconds(10))
	    .find
	    (By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a"))
	    .click();
		Thread.sleep(1000);
		WebElement actualElement = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a"));
        String actualText = actualElement.getText();
        Assertions.assertThat(actualText).isEqualTo("Directory");
	}

	@Step("I search employee by location")
	public void i_search_employee_by_location() throws Exception{
		Thread.sleep(1000);
	WebElement Location = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
	withAction().click(Location).sendKeys("h").pause(1000).sendKeys(Keys.ENTER).build().perform();
	withTimeoutOf(Duration.ofSeconds(10))
    .find
    (By.
	xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"))
    .click();
	
	}

	@Step("I select an emploeyee and verify their location")
	public void i_select_an_emploeyee_and_verify_their_location() throws Exception{
		Thread.sleep(1000); 
	}

}
