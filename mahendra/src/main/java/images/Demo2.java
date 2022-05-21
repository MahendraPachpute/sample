package images;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement wb=driver.findElement(By.xpath("//a[@aria-label='Helmets']"));
		System.out.println(wb.isDisplayed());
		System.out.println(wb.isEnabled());
		String a=wb.getAttribute("aria-label");
		System.out.println(a);
		Thread.sleep(3000);
		wb.click();
		if (a.contains("Helmets"))
		{
			System.out.println("test case pass");
		}
		else
			System.out.println("Test case fails");
		Thread.sleep(3000);
		driver.close();
	}

}
