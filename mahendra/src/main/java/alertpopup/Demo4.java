package alertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("Selenium");
		Thread.sleep(4000);
		alt.accept();
		String a=driver.findElement(By.id("result")).getText();
		if(a.contains("Selenium"))
		{
			System.out.println("Test passes");
		}
		else
			System.out.println("Test failed");
			
	}

}
