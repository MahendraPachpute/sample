package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookreg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		//firstname
		WebElement wb=driver.findElement(By.name("firstname"));
			System.out.println(wb.isDisplayed());	
			System.out.println(wb.isEnabled());	
		wb.sendKeys("indra");

			String a=wb.getAttribute("value");
		System.out.println(a);
		//lastname
		driver.findElement(By.name("lastname")).sendKeys("pachpute");
		//email
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("indrapachpute5555@gmail.com");
		//RE-ENTER EMAIL
		driver.findElement(By.xpath("//input[@NAME='reg_email_confirmation__']")).sendKeys("indrapachpute5555@gmail.com");

		//password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("indra555");
		//birthdate
		WebElement wb1=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day=new Select(wb1);
		day.selectByIndex(27);
		WebElement d=day.getFirstSelectedOption();
		System.out.println(d.getText());
		//birth month
		WebElement wb3=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month=new Select(wb3);
		month.selectByValue("10");
		WebElement e=month.getFirstSelectedOption();
		System.out.println(e.getText());
		//birth year
		WebElement wb4=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year=new Select(wb4);
		year.selectByVisibleText("1991");
		WebElement f=year.getFirstSelectedOption();
		System.out.println(f.getText());
		//gender selection
		WebElement wb5=driver.findElement(By.xpath("//input[@value='2']"));
		wb5.isDisplayed();
		wb5.isEnabled();
		wb5.isSelected();
		wb5.click();
		wb5.isSelected();
		//terms link
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		//signup button
		//driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	
		
	}

}
