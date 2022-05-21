package com.BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	 public static WebDriver driver;

	public static void Intialization(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHRIKANT\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		

	}

}
