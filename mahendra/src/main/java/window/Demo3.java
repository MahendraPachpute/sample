package window;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SHRIKANT/Downloads/multiple%20Windows.html");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//a[text()='Facebook register']")).click();
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("name")).sendKeys("selenium");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String b=driver.findElement(By.id("demo")).getText();
		System.out.println(b);
		
		Set<String> s=driver.getWindowHandles();
		System.out.println(s.size());
		for(String abc:s)
		{
			if(!(abc.equals(parent)))
			{
				driver.switchTo().window(abc);
				driver.findElement(By.name("firstname")).sendKeys("mahendra");
				driver.findElement(By.name("lastname")).sendKeys("pachpute");
				WebElement wb=driver.findElement(By.name("birthday_day"));
				Select sel= new Select(wb);
				sel.selectByVisibleText("28");
				System.out.println(sel.getFirstSelectedOption().getText());
				WebElement month=driver.findElement(By.name("birthday_month"));
				Select sel1=new Select(month);
				sel1.selectByVisibleText("Sep");
				System.out.println(sel1.getFirstSelectedOption().getText());
				WebElement year=driver.findElement(By.name("birthday_year"));
				Select sel2=new Select(year);
				sel2.selectByVisibleText("2000");
				System.out.println(sel2.getFirstSelectedOption().getText());
				driver.findElement(By.xpath("//input[@class='_8esa'][@value=\"2\"]")).click();
			}
		}
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\SHRIKANT\\Pictures\\Screenshots\\windows.jpeg"));
		
		System.out.println("Screen Captured");
		driver.switchTo().window(parent);
		driver.findElement(By.id("pass")).sendKeys("cucumber");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String c=driver.findElement(By.id("demo1")).getText();
		System.out.println(c);
		
		
		
		
		
	}

}
