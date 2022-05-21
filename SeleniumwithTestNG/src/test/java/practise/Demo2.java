package practise;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	@BeforeClass
	@BeforeMethod
	public void sa() {
		System.out.println("before mtd");
		
	}
	@Test(priority=1)
	public void xyz()
	{
		Assert.assertEquals(11, 11);
	}
	
	@Test(dependsOnMethods= {"lmn"},priority=2)
	public void abc()
	{
		Assert.assertEquals(11, 11);
	}
	
	@Test(priority=-1)
	public void lmn()
	{
		Assert.assertEquals(11, 11);
	}
	
	@AfterMethod
	public void pq()
	{
		System.out.println("after mtd");
		System.out.println(".................");
	}
	
	
	
	

}
