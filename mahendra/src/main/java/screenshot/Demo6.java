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

public class Demo6 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat d= new SimpleDateFormat("ddMMyyyy_HHmmSS");
		String date=d.format(new Date());
		String dist="C:\\Users\\SHRIKANT\\Pictures\\Screenshots"+date+".jpeg";
		FileUtils.copyFile(f, new File(dist));
	}

}
