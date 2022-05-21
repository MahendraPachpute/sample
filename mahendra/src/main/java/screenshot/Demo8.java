package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//upcasting concept we can access parent class
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=alka+share+price&oq=&aqs=chrome.1.35i39i362l3j46i39i199i291i362j35i39i362l2j69i59i450.2270419j0j7&sourceid=chrome&ie=UTF-8");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		String dist="C:\\Users\\SHRIKANT\\Pictures\\Screenshots\\"+System.currentTimeMillis()+".png";
		FileUtils.copyFile(f, new File (dist));
		
	}

}
