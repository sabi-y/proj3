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

public class AddEditVacancy extends PageObject {

	// @Managed(driver = "chrome", options = "headless")
	@Managed(driver = "chrome")
	WebDriver driver;


	@Step("click Recrutiment on the side")
	public void click_recrutiment_on_the_side() throws Exception {
		Thread.sleep(1000);
		WebElement Recruitment = getDriver().findElement(By.linkText("Recruitment"));
		Recruitment.click();
		Thread.sleep(1000);


		WebElement actualElement =  getDriver().findElement(By.linkText("Recruitment"));
		String actualText = actualElement.getText();
		Assertions.assertThat(actualText).isEqualTo("Recruitment");


	}


	@Step("click Vacancies on the top")
	public void click_vacancies_on_the_top() throws Exception {



		Thread.sleep(1000);

		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.linkText("Vacancies"))
		.click();


		Thread.sleep(1000);
	}

	@Step("I click Add Vacancy button")
	public void i_click_add_vacancy_button() throws Exception {

		Thread.sleep(1000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"))
		.click();

		Thread.sleep(1000);
	}

	@Step("I enter {string} as a VacancyName")
	public void i_enter_as_a_vacancy_name(String vacancyName) throws Exception{

		Thread.sleep(1000);

		WebElement vacancyNameElement = getDriver().findElement(By.cssSelector("div.oxd-grid-3:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"));
		withAction().pause(1000).click(vacancyNameElement).build().perform();;
		vacancyNameElement.sendKeys(vacancyName);
	}



	@Step("I select {string} in JobTitles")
	public void i_select_in_job_titles(String Q) throws Exception {

		Thread.sleep(2000);

		WebElement JobTitle = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div"));
		withAction().moveToElement(JobTitle).
		click(JobTitle).pause(1000).sendKeys("q").pause(1000).sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(1000);
	}


	@Step("I enter {string} in Description")
	public void i_enter_in_description(String descrip) throws Exception{


		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.cssSelector(".oxd-textarea")).
		type(descrip);

		Thread.sleep(1000);
	}

	@Step("I select {string} from Hiring Managers")

	public void i_select_from_hiring_managers(String Man)throws Exception {

		Thread.sleep(1000);

		WebElement hiringMan= getDriver().findElement(By.cssSelector(".oxd-autocomplete-text-input"));
		withAction().moveToElement(hiringMan).click().
		sendKeys("odis").sendKeys(Keys.SPACE).pause(2000).sendKeys("\uE015").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
	}

	@Step("I enter  {string}  in the Number of positions")

	public void i_enter_in_the_number_of_positions(String number) throws Exception{

		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input"))
		.type(number).sendKeys(Keys.ENTER);

		Thread.sleep(1000);

	}

	@Step("I click Vacancy Save button")
	public void i_click_vacancy_save_button() throws Exception {

		Thread.sleep(1000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[7]/button[2]"))
		.click();
		Thread.sleep(2000);
	}

	@Step("I click Vacancies on the top")
	public void i_click_vacancies_on_the_top() throws Exception {

		Thread.sleep(1000);

		Thread.sleep(1000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(5) > a > span"))
		.click();


		Thread.sleep(1000);

		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.linkText("Vacancies"))
		.click();

	}

	@Step("I edit the {string} in the Description")
	public void i_edit_the_in_the_description(String descrip2) throws Exception {

		Thread.sleep(1000);

		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.cssSelector(".oxd-textarea"))
		.clear();
		Thread.sleep(1000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.cssSelector(".oxd-textarea"))
		.sendKeys(descrip2);
		Thread.sleep(1000);
		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/form/div[7]/button[2]"))
		.click();


	}


	@Step("I search and select Vacancy")

	public void i_search_and_select_vacancy() throws Exception {

		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5"))
		.waitUntilVisible();

		Thread.sleep(1000);

		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.cssSelector("div.oxd-table-header-cell:nth-child(5) > div:nth-child(1)"))
		.click();
		Thread.sleep(1000);

		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.cssSelector(".--active"))
		.waitUntilVisible();

		Thread.sleep(1000);

		withTimeoutOf(Duration.ofSeconds(10))
		.find
		(By.cssSelector(".--active > ul:nth-child(1) > li:nth-child(1) > span:nth-child(2)"))
		.click();
		Thread.sleep(1000);


		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.cssSelector("div.oxd-grid-item:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"))
		.click();

		Thread.sleep(1000);
		withAction().sendKeys("q").pause(1000).sendKeys(Keys.ENTER).build().perform();

		withTimeoutOf(Duration.ofSeconds(10))
		.find(By.cssSelector("button.oxd-button:nth-child(2)"))
		.click();

		WebElement QAVacancy =  getDriver().findElement(By.cssSelector("div.oxd-table-card:nth-child(1) > div:nth-child(1) > div:nth-child(3)"));
		String actualText = QAVacancy .getText();
		Assertions.assertThat(actualText).isEqualTo("QA Engineer");

		Thread.sleep(4000);
	}

	@Step("I close the browser")
	public void i_close_the_browser() {

		try {
			Thread.sleep(1 * 1000);
			if (!(getDriver() == null)) {
				getDriver().close();
				getDriver().quit(); 
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

