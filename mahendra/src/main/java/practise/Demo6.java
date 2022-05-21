package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg");
		WebElement wb=driver.findElement(By.id("year"));
		Select sel= new Select(wb);
		List<WebElement>ls=sel.getOptions();
		int a=ls.size();
		System.out.println(a);
		for(WebElement abc:ls)
			System.out.println(abc.getText());
	
		
		}
	
		
		
			
	}


