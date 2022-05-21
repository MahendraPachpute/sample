package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		String abc="Aug"+"2023";
		while(true)
		{
		String a=driver.findElement(By.className("monthTitle")).getText();
		System.out.println(a);
		if(a.equals(abc))
		{
			break;
			
		}
		else {
			driver.findElement(By.className("next")).click();
		}
		
		}
		driver.findElement(By.xpath("//td[text()='15']")).click();
		
		String b=driver.findElement(By.id("onward_cal")).getAttribute("data-caleng");
		System.out.println(b);
	}

}
