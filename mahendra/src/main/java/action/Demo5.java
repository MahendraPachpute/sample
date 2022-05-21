package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHRIKANT\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement src=driver.findElement(By.id("box3"));
		WebElement tar=driver.findElement(By.id("box103"));
		Actions act=new Actions(driver);
		act.clickAndHold(src).release(tar).build().perform();
		
		WebElement src1=driver.findElement(By.id("box6"));
		WebElement tar1=driver.findElement(By.id("box106"));
		Actions act1=new Actions(driver);
		act1.clickAndHold(src1).release(tar1).build().perform();
		
		WebElement src2=driver.findElement(By.id("box7"));
		WebElement tar2=driver.findElement(By.id("box107"));
		Actions act2=new Actions(driver);
		act2.clickAndHold(src2).release(tar2).build().perform();
		
		WebElement src3=driver.findElement(By.id("box1"));
		WebElement tar3=driver.findElement(By.id("box101"));
		Actions act3=new Actions(driver);
		act3.clickAndHold(src3).release(tar3).build().perform();
		
		WebElement src4=driver.findElement(By.id("box4"));
		WebElement tar4=driver.findElement(By.id("box104"));
		Actions act4=new Actions(driver);
		act4.clickAndHold(src4).release(tar4).build().perform();
		
		WebElement src5=driver.findElement(By.id("box5"));
		WebElement tar5=driver.findElement(By.id("box105"));
		Actions act5=new Actions(driver);
		act5.clickAndHold(src5).release(tar5).build().perform();
		
		WebElement src6=driver.findElement(By.id("box2"));
		WebElement tar6=driver.findElement(By.id("box102"));
		Actions act6=new Actions(driver);
		act6.clickAndHold(src6).release(tar6).build().perform();
		
		driver.close();
	}

}
