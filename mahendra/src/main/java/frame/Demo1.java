package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame(2);
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//th[@class='colFirst']/following::a[text()='org.openqa.selenium.chrome']")).click();
		driver.findElement(By.linkText("org.openqa.selenium.devtools")).click();
	}
	

}
