package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String a=driver.getTitle();
		System.out.println(a);
		driver.navigate().to("https://facebook.com");
		String b=driver.getCurrentUrl();
		{
		System.out.println(b);
		}
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://amazon.com");
		String f=driver.getTitle();
		{
		System.out.println(f);
		}
		Thread.sleep(10000);
		driver.navigate().refresh();
		driver.navigate().to("https://google.com");
		Thread.sleep(10000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("https://www.gmail.com");
		String e=driver.getCurrentUrl();
		{
			System.out.println(e);
		}
		driver.quit();
	}

}
