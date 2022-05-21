package TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Baselayer.BaseClass;
import utilslayer.ExcelReader;

public class CreateMultipleUser extends BaseClass {

	String employeeId;

	@BeforeClass
	public void setUp() {
		BaseClass.initialization();
	}

	@Test
	public void loginPage() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin@123");
		driver.findElement(By.id("btnLogin")).click();
//	driver.findElement(By.name("email")).sendKeys("mahendra5pute55@gmail.com");
//	driver.findElement(By.name("pass")).sendKeys("");
//	driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d_')]")).click();

	}

	@Test(priority = 2)
	public void ValidateHomePage() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Test(dataProvider = "createEmp", priority = 3)
	public void PimPageCraeteEmployee(String fname, String mname, String lname) {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "viewEmployeeList");

		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("middleName")).sendKeys(mname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		driver.findElement(By.id("empsearch_id")).sendKeys(employeeId);
		driver.findElement(By.id("searchBtn")).click();

		driver.findElement(By.xpath("//table[@id='resultTable']//td[1]")).click();
		driver.findElement(By.id("btnDelete")).click();
		Assert.assertEquals("Delete records?", true);
		driver.findElement(By.id("dialogDeleteBtn")).click();

	}

	@DataProvider(name = "createEmp")
	public Object[][] getdata() {

		ExcelReader obj = new ExcelReader("C:\\Users\\SHRIKANT\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		int row = obj.getRowCount(0);
		int col = obj.getColumnCount(0);

		Object[][] data = new Object[row][col];
		for (int i = 0; i < row; i++) {
			data[i][0] = obj.getData(0, i, 0);
			data[i][1] = obj.getData(0, i, 1);
			data[i][2] = obj.getData(0, i, 2);
		}
		return data;

	}

}
