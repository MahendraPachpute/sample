package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("C:\\\\Users\\\\SHRIKANT\\\\Desktop\\\\scrrenshot\\\\fb.jpg"));
		
	}

}
