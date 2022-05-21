package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("mahendra5pute55@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		driver.findElement(By.name("password")).sendKeys("9975758791");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();

		
		
	}

}
