package com.cucumber.pages;

import java.time.Duration;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;

public class VacancyAddDelete extends PageObject {

	// @Managed(driver = "chrome", options = "headless")
	@Managed(driver = "chrome")
	WebDriver driver;


	@Step("I enter {string}\" as a VacancyName")
	public void i_enter_as_a_vacancy_name(String VacancyName2) {
		WebElement VacancyName = getDriver().findElement(By.cssSelector("div.oxd-grid-3:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"));
		withAction().click(VacancyName).sendKeys(VacancyName2);

	}

	@Step("I delete the Vacancy")
	public void i_delete_the_vacancy() throws Exception {

		Thread.sleep(1000);
		WebElement Delete = getDriver().findElement

				(By.cssSelector( ".bi-trash"));
		withAction().moveToElement(Delete).click().build().perform();
		Thread.sleep(1000);
		WebElement Confirm = getDriver().findElement(By.cssSelector("button.orangehrm-button-margin:nth-child(2)"));
		Confirm.click();
		Thread.sleep(2000);
	}

	@Step("I enter another {string} as a VacancyName")
	public void i_enter_another_as_a_vacancy_name(String string) {
		WebElement vacancyNameElement = getDriver().findElement(By.cssSelector("div.oxd-grid-3:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"));
		withAction().pause(3000).click(vacancyNameElement).build().perform();;
		withAction().pause(1000);
		vacancyNameElement.sendKeys(string);}

	@Step("I enter different {string}  in the Number of positions")
	public void i_enter_different_in_the_number_of_positions(String string) {
		withAction().pause(1000);
		WebElement NumberPos = getDriver().findElement(By.cssSelector(".oxd-grid-2 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)"));
		withAction().click(NumberPos).sendKeys(string).pause(1000).build().perform();
	}

	@Step("I search by Status")
	public void i_search_by_status() throws Exception {

		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")));
		Thread.sleep(3000);
		WebElement sortByDropdown = getDriver().findElement(By.cssSelector("div.oxd-table-header-cell:nth-child(5) > div:nth-child(1)"));
		sortByDropdown.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".--active")));
		Thread.sleep(3000);
		WebElement sortByAscendingOption = getDriver().findElement(By.cssSelector(".--active > ul:nth-child(1) > li:nth-child(1) > span:nth-child(2)"));
		sortByAscendingOption.click();
		Thread.sleep(3000);

	}

	@Step("I search by JobTitle")
	public void i_search_by_job_title() throws Exception {

		getDriver().findElement(By.cssSelector("div.oxd-grid-item:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
		Thread.sleep(1000);
		withAction().sendKeys("q").pause(1000).sendKeys(Keys.ENTER).build().perform();
		withAction().pause(1000);
		Thread.sleep(1000);
		getDriver().findElement(By.cssSelector("button.oxd-button:nth-child(2)")).click();
		Thread.sleep(1000);


		WebElement QAVacancy =  getDriver().findElement(By.cssSelector("div.oxd-table-card:nth-child(1) > div:nth-child(1) > div:nth-child(3)"));
		String actualText = QAVacancy .getText();
		Assertions.assertThat(actualText).isEqualTo("QA Engineer");

		System.out.println(actualText +" =  "  + "QA Engineer");
		Thread.sleep(1000);
	}

}


