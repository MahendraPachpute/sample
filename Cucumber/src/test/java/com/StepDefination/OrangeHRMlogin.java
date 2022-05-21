package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class OrangeHRMlogin {
	WebDriver driver;

	@Given("user is on OrangeHrm")
	public void user_is_on_orange_hrm() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin@123");
		driver.findElement(By.id("btnLogin")).click();
		
	
	}

	@Then("user in on homepage")
	public void user_in_on_homepage() {
		boolean a=driver.getTitle().contains("HRM");
		Assert.assertEquals(a, true);
		

	}

}
