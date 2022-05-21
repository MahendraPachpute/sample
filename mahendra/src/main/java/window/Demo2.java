package window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SHRIKANT/Downloads/multiple%20Windows.html");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//a[text()='Facebook register']")).click();
		
		Set<String> s=driver.getWindowHandles();
		System.out.println(s.size());
		for(String abc:s)
		{
			if(!(abc.equals(parent)))
			{
				driver.switchTo().window(abc);
				driver.findElement(By.name("firstname")).sendKeys("Selenium");
				driver.findElement(By.name("lastname")).sendKeys("Testing");

			}
		}
	}

}
