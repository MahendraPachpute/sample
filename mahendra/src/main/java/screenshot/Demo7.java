package screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws IOException {
		//access the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//upcasting concept we can access parent class
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/?trk=guest_homepage-basic_nav-header-logo");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat d= new SimpleDateFormat("ddMMyyyy_HHmmss");
		String date=d.format(new Date());
		//String dist="C:\\Users\\SHRIKANT\\Desktop\\"+date+".png";
		FileUtils.copyFile(f, new File("C:\\Users\\SHRIKANT\\Desktop\\"+date+".png"));
	}

}
