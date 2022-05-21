package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SHRIKANT\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);

		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);

	}

}
