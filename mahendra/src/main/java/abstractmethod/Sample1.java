package abstractmethod;

public class Sample1 extends Demo1 {

	@Override
	public void m3()
	{
		System.out.println("m3 in sample1 ");
	}
	 
	public void m4()
	{
		System.out.println("m4 in sample1");
	}
		
	
	
	public static void main (String[]args)
	{
		Sample1 obj = new Sample1();
				obj.m1();
				obj.m2();
				obj.m3();
				obj.m4();
				
				
	}
}

