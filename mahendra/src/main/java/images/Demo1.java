package images;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		WebElement wb=driver.findElement(By.xpath("/html/body/div/main/div[4]/div[1]/a"));
		System.out.println(wb.isDisplayed());
		System.out.println(wb.isEnabled());
		System.out.println(wb.getAttribute("href"));
		wb.click();
		String a=driver.getTitle();
		if (a.contains("selenium"))
		{
			System.out.println("Test case passes");
		}
		else System.out.println("Test case fails");
		
		
		
	}

}
