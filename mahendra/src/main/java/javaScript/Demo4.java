package javaScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SHRIKANT\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		WebElement wb=driver.findElement(By.id("twotabsearchtextbox"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid Red';",wb);
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File f=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(f, new File("C:\\Users\\SHRIKANT\\Pictures\\Screenshots\\java.png"));
//		System.out.println("Screenshot Captured");
		}
	

}