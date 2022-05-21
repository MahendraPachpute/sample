package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args ) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		
//		driver.get("https://www.facebook.com/reg");
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File f=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(f, new File("C:\\Users\\SHRIKANT\\Desktop\\scrrenshot\\google.jpg"));
//	}
	}
}

