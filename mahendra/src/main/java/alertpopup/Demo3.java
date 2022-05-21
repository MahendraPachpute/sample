package alertpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Alert alt=driver.switchTo().alert();
		String a=alt.getText();
		System.out.println(a);
		Thread.sleep(2000);
		//alt.accept();
		alt.dismiss();
		Thread.sleep(2000);

		driver.close();
		
	}

}
