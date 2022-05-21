package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SHRIKANT/Downloads/table%20data.html");
		List<WebElement>wb=driver.findElements(By.tagName("tr"));
		System.out.println(wb.size());
		for(WebElement a:wb)
		{
			System.out.println(a.getText());
		}
		
		
	}

}
