package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

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
		
		WebElement ab=driver.findElement(By.id("personal_cmbNation"));
		Select selnationality=new Select(ab);
		selnationality.selectByValue("82");
		WebElement b= selnationality.getFirstSelectedOption();
		String c=b.getText();
		System.out.println(c);
	
		WebElement cd=driver.findElement(By.id("personal_cmbMarital"));
		Select single=new Select(cd);
		single.selectByVisibleText("Single");
		WebElement d=single.getFirstSelectedOption();
		System.out.println(d.getText());
		driver.findElement(By.id("personal_chkSmokeFlag")).click();
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("btnEditCustom")).click();
		
		WebElement abc=driver.findElement(By.name("custom1"));
		Select blood= new Select(abc);
		blood.selectByValue("A+");
		WebElement xyz=blood.getFirstSelectedOption();
		System.out.println(xyz.getText());
		Thread.sleep(5000);
		
		driver.findElement(By.name("btnEditCustom")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("mahendra pachpute");
		
		WebElement status=driver.findElement(By.id("empsearch_employee_status"));
		Select full=new Select (status);
		full.selectByIndex(3);
		WebElement lmn=full.getFirstSelectedOption();
		System.out.println(lmn.getText());
		
		WebElement efg=driver.findElement(By.id("empsearch_termination"));
		Select employee=new Select(efg);
		employee.selectByValue("2");
		WebElement uv=employee.getFirstSelectedOption();
		System.out.println(uv.getText());
		
		WebElement cde=driver.findElement(By.id("empsearch_job_title"));
		Select job=new Select(cde);
		job.selectByVisibleText("Automation Tester");
		WebElement ghi=job.getFirstSelectedOption();
		System.out.println(ghi.getText());
		
		WebElement mno=driver.findElement(By.id("empsearch_sub_unit"));
		Select unit=new Select(mno);
		unit.selectByIndex(2);
		WebElement rst=unit.getFirstSelectedOption();
		System.out.println(rst.getText());
		Thread.sleep(5000);
		driver.findElement(By.id("searchBtn")).click();
		
		
	}

	
		
	}


