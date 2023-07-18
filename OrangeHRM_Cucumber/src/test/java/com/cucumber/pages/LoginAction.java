package com.cucumber.pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.junit.Assert;

import org.assertj.core.api.Assertions;
import org.fluentlenium.core.wait.FluentWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Step;

public class LoginAction extends PageObject {

	WebElement userNameElem;
	WebElement userPasswordElem;
	WebElement loginButtonElem;
	WebElement dashboardElem;
	

	public LoginAction () {
		
		
	}
	
	@Step("I go to OrangeHRM website {string}")
	public void goto_website(String string) {
		openUrl("https://opensource-demo.orangehrmlive.com/");
		String pageTitle = getDriver().getTitle();
		System.out.println("Page_Title: " + pageTitle);
	}

	@Step("I login using {string} and {string}")
	public void login(String userName, String userPass) throws Exception {

		userNameElem = getDriver().findElement(By.name("username"));
		userNameElem.clear();
		userNameElem.sendKeys(userName);
		Thread.sleep(1 * 1000);
		userPasswordElem = getDriver().findElement(By.name("password"));
		userPasswordElem.clear();
		userPasswordElem.sendKeys(userPass);
		Thread.sleep(1 * 1000);
		loginButtonElem = getDriver().findElement(By.cssSelector("div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button"));
		loginButtonElem.click();
		Thread.sleep(1 * 1000);
	}

	@Step("I should see OrangeHRM dashboard home page")
	public void verify_dashboad_homePage() throws Exception {
		Thread.sleep(1 * 2000);
//		dashboardElem = getDriver().findElement(By.cssSelector(".oxd-topbar-header-breadcrumb"));
//		String dashboardTxt = dashboardElem.getText();
//		System.out.println("Dashboard landing page displayed sucessfully.");
//		
		Thread.sleep(1 * 1000);
		
		WebElementFacade wf = find(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		String message = wf.getText();
		String expectedText = "Dashboard";
		Assert.assertEquals(expectedText, message);
		Thread.sleep(1 * 1000);
		
//		Assertions.assertThat("Dashboard").isEqualTo(dashboardTxt);
//		assertEquals("Dashboard", dashboardTxt);
		
		
	}

}
