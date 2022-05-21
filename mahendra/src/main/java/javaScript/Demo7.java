package javaScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\SHRIKANT\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.facebook.com';");
		js.executeScript("document.getElementById('email').value='mahendra5pute55@gmail.com';");
		js.executeScript("document.getElementById('pass').value='9975758791';");
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d_')]")).click();
		js.executeScript("alert('welcome to home');");
		Alert alt=driver.switchTo().alert();
		String a=alt.getText();
		if(a.contains("home"))
{
	System.out.println("user is on homepage");
}
		else {
			System.out.println("user is not on homepage");
		}
		alt.accept();
	}

}
