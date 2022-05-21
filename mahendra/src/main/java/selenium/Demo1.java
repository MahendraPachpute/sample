package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver mahendra= new ChromeDriver();
		mahendra.get("https://gmail.com");
		String a=mahendra.getTitle();
		System.out.println(a);
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		mahendra.findElement(By.id("identifierId")).sendKeys("mahendra5pute55@gmail.com");
		
		
	}

}
