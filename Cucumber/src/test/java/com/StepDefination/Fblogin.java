package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Fblogin {
	WebDriver driver;

	@Given("user is on facebook")
	public void user_is_on_facebook() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHRIKANT\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

	}

	@Then("login valid credentials")
	public void login_valid_credentials() {
		driver.findElement(By.id("email")).sendKeys("mahendra5pute55@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9975758791");
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() {
		boolean a=driver.getTitle().contains("Facebook");
		Assert.assertEquals(a, true);

	}

}
