package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHRIKANT\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebElement wb=driver.findElement(By.id("nav-link-accountList"));
		Actions act= new Actions(driver);
		act.moveToElement(wb).build().perform();
		System.out.println(wb.getText());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		WebElement wb1=driver.findElement(By.id("ap_email"));
		Actions act1=new Actions(driver);
		act1.sendKeys(wb1,"mahendra5pute55@gmail.com").build().perform();
		System.out.println(driver.getTitle());
		
	}

}
