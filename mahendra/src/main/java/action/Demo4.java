package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHRIKANT\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement src=driver.findElement(By.id("box3"));
		WebElement tar=driver.findElement(By.id("box103"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, tar).build().perform();
		
		WebElement src1=driver.findElement(By.id("box6"));
		WebElement tar1=driver.findElement(By.id("box106"));
		Actions act1=new Actions(driver);
		act1.dragAndDrop(src1,tar1).build().perform();
		
		WebElement src2=driver.findElement(By.id("box7"));
		WebElement tar2=driver.findElement(By.id("box107"));
		Actions act2=new Actions(driver);
		act2.dragAndDrop(src2,tar2).build().perform();
		
		WebElement src3=driver.findElement(By.id("box1"));
		WebElement tar3=driver.findElement(By.id("box101"));
		Actions act3=new Actions(driver);
		act3.dragAndDrop(src3,tar3).build().perform();
		
		WebElement src4=driver.findElement(By.id("box4"));
		WebElement tar4=driver.findElement(By.id("box104"));
		Actions act4=new Actions(driver);
		act4.dragAndDrop(src4, tar4).build().perform();
		
		WebElement src5=driver.findElement(By.id("box5"));
		WebElement tar5=driver.findElement(By.id("box105"));
		Actions act5=new Actions(driver);
		act5.dragAndDrop(src5,tar5).build().perform();
		
		WebElement src6=driver.findElement(By.id("box2"));
		WebElement tar6=driver.findElement(By.id("box102"));
		Actions act6=new Actions(driver);
		act6.dragAndDrop(src6, tar6).build().perform();
		
		driver.close();
	}

}
