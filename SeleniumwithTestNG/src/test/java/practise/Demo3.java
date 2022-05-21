package practise;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {
	


	@BeforeMethod
	public void setup (){
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("After method");
		System.out.println("......................");
	}
	
	@Test(groups="smoke")
	public void abc()
	{
		System.out.println("abc method");
	}
	
	
	@Test(groups="sanity")
	public void xyz()
	{
		System.out.println("xyz method");
	}

	@Test(groups="sanity")
	public void lmn()
	{
		System.out.println("lmn method");
	}


}
