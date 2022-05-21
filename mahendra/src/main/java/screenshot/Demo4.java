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

public class Demo4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		TakesScreenshot a=(TakesScreenshot)driver;
		File f=a.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat d= new SimpleDateFormat("ddMMyyyy_HHmmss");
		String date=d.format(new Date());
		//FileUtils.copyFile(f, new File("C:\\Users\\SHRIKANT\\Desktop\\amazon.jpeg"));
		String dist="C:\\Users\\SHRIKANT\\Desktop\\"+date+".jpeg";
				FileUtils.copyFile(f, new File(dist));		
	}

}
