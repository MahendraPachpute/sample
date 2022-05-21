package practise;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	
	@BeforeClass
	public void opl() {
		System.out.println("before class");
		System.out.println(".............................");
	}

	@BeforeMethod

	public void abc() {
		System.out.println("before Method");
		
	}
	@Test(groups="sanity")
	public void xyza() {
		System.out.println("xyza method");
	}
	@Test(priority=1)
	public void lmn() {
		Assert.assertEquals(10,10);
}
	@Test(priority=3)
	public void pqr() {
		Assert.assertEquals(10,10);
	}
	
	@AfterMethod

	public void cde() {
		System.out.println("after Method");
		System.out.println(".................................................");
	}
	
	@AfterClass
	public void op() {
		System.out.println("after class");
	}
	

}
