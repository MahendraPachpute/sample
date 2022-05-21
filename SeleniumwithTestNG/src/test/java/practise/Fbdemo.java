package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilslayer.ExcelReader;

public class Fbdemo {
	
	public WebDriver driver;

	@Test(dataProvider="login")
	public void Register(String Fname,String Mname,String Lname) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIKANT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys(Fname);
		driver.findElement(By.name("lastname")).sendKeys(Mname);
		driver.findElement(By.name("reg_email__")).sendKeys(Lname);
		
	}
	
	
	@DataProvider(name="login")
	public Object[][]testdata(){
		ExcelReader obj=new ExcelReader("C:\\Users\\SHRIKANT\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		int row=obj.getRowCount(0);
		int col=obj.getColumnCount(0);
		
		Object [][]abc= new Object[row][col];
		for(int i=0;i<row;i++)
		{
			abc[i][0]=obj.getData(0, i, 0);
			abc[i][1]=obj.getData(0, i, 1);
			abc[i][2]=obj.getData(0, i, 2);
		}
		return abc;
		
				
}
	
}
