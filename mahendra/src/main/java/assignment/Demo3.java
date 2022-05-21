package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file://C:/Users//SHRIKANT//Desktop//text%20box.html");
		String a=driver.getTitle();
	WebElement wb=driver.findElement(By.id("Selenium"));
	boolean b=wb.isDisplayed();
	System.out.println(b);
	boolean c= wb.isEnabled();
	System.out.println(c);
	boolean d= wb.isSelected();
	System.out.println(d);
	wb.click();
	boolean e=wb.isSelected();
	System.out.println(e);
	Thread.sleep(5000);
	System.out.println("............................");
	
	WebElement wb1=driver.findElement(By.id("TestNG"));
	boolean f=wb1.isDisplayed();
	boolean g=wb1.isEnabled();
	System.out.println(f);
	System.out.println(g);
	boolean h=wb1.isSelected();
	wb1.click();
	Thread.sleep(5000);
	System.out.println("............................");


	WebElement wb2=driver.findElement(By.id("Cucumber"));
	boolean ab=wb2.isDisplayed();
	boolean ac=wb2.isEnabled();
	System.out.println(ab);
	System.out.println(ac);
	boolean ad=wb2.isSelected();
	wb2.click();
	Thread.sleep(5000);
	System.out.println("............................");

	
	WebElement wb3=driver.findElement(By.id("POM"));
	boolean abc=wb3.isDisplayed();
	boolean acd=wb3.isEnabled();
	System.out.println(abc);
	System.out.println(acd);
	boolean ade=wb2.isSelected();
	wb3.click();
	Thread.sleep(5000);
	System.out.println("............................");

		driver.close();
	
	
	
	

	
	}

}
