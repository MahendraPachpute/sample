package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String a= driver.getCurrentUrl();
		System.out.println(a);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.name("firstName")).sendKeys("mahendra");
		driver.findElement(By.name("lastName")).sendKeys("pachpute");
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_optGender_1")).click();
		driver.findElement(By.id("personal_cmbNation")).click();
		
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(5000);


		


		

		
		
		
	}

}
