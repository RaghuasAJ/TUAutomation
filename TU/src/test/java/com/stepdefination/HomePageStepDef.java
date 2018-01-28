package com.stepdefination;

import java.util.Map;
import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef {
	public static WebDriver driver;

	@Given("^I am in Home page$")
	public void i_am_in_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tuclothing.sainsburys.co.uk");
	}

	@When("^I Select on Login Link$")
	public void i_Select_on_login_link() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findElement (By.cssSelector("a[href='/login']")).click();
		driver.findElement(By.linkText("Tu Log In / Register")).click();
	}

	@Then("^i should see the welcome page$")
	public void i_should_see_the_welcome_page() throws Throwable {
		Thread.sleep(2000);
		Assert.assertEquals("Hello Chandan Rauniyar",
				driver.findElement(By.cssSelector("li[class='logged_in']")).getText());
	}

	@And("^I should see the login page$")
	public void i_should_see_the_login_page() throws Throwable {
		Assert.assertEquals("Returning Tu customers", driver.findElements(By.cssSelector("h2")).get(2).getText());
	}

	@And("^I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_email_something_and_password_something(String emaidId, String password) throws Throwable {
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys(emaidId);
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys(password);
	}

	@And("^I enter the valid email address and valid password$")
	public void i_enter_the_valid_email_address_and_valid_password() throws Throwable {
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("chandanrauniyar2002@gmail.com");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("Rauniyar007");
	}

	@When("^I click login buuton$")
	public void i_click_login_buuton() throws Throwable {
		driver.findElement(By.className("loginButtonMain")).click();
	}

	@When("^I enter valid email address and invalid password$")
	public void i_enter_valid_email_address_and_invalid_password() throws Throwable {
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("anjli_007@yahoo.com");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("Rauniyar00");
	}

	@Then("^I should see error message$")
	public void i_should_see_error_message() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals("Please check the fields below and try again",
				driver.findElements(By.cssSelector("span[class='icon']")).get(4).getText());
		// span[class='icon']
	}

	

	@When("^I enter valid details$")
	public void i_enter_valid_details(DataTable regDataTable) throws Throwable {
	    Map<String,String> regData=regDataTable.asMap(String.class, String.class);
	    String email=regData.get("EmailId");
	    String title=regData.get("Title");
	    String firstName=regData.get("FirstName");
	    
	    driver.findElement(By.cssSelector("#register_email")).clear();
		driver.findElement(By.cssSelector("#register_email")).sendKeys(email);
		driver.findElement(By.cssSelector("#register_title")).click();
		Select titleDropdown = new Select(driver.findElement(By.id("register_title")));
		titleDropdown.selectByValue(title);
		driver.findElement(By.cssSelector("#register_firstName")).clear();
		driver.findElement(By.cssSelector("#register_firstName")).sendKeys(firstName);
		driver.findElement(By.cssSelector("#register_lastName")).clear();
		driver.findElement(By.cssSelector("#register_lastName")).sendKeys("Rauniyar");
		driver.findElement(By.cssSelector("#password")).clear();
		driver.findElement(By.cssSelector("#password")).sendKeys("Rauniyar007");
		driver.findElements(By.cssSelector(".hide-show-button")).get(1).click();
		driver.findElement(By.cssSelector("#register_checkPwd")).clear();
		driver.findElement(By.cssSelector("#register_checkPwd")).sendKeys("Rauniyar007");
		driver.findElement(By.name("contactPreferencesAny")).click();
		driver.findElement(By.name("termsAndConditions")).click();
	    
	    
	}
	
}
