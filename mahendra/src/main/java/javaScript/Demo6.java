package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHRIKANT\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.facebook.com';");
		js.executeScript("document.getElementById('email').value='mahendra5pute55@gmail.com';");
		js.executeScript("document.getElementById('pass').value='9975758791';");
		WebElement wb=driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d_')]"));
		js.executeScript("arguments[0].click();",wb);
	}

}
