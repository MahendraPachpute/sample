package abstractmethod;

public class Sample2 extends Demo2{
	
	@Override
	public void m5() {
		System.out.println("m5 in sample2");
	}

	@Override
	public void m6() {
		System.out.println("m6 in Sample2");
		
	}
	
	public void m7()
	{
		System.out.println("m7 insample2");
	}
	
	public void m8()
	{
		System.out.println("m8 in sample2");
	}
	
	

	public static void main(String[] args) {
//		Demo2 obj=new Sample2();
//		obj.m1();
//		obj.m2();
//		obj.m3();
//		obj.m4();
//		obj.m5();
//		obj.m6();
		
		Sample2 obj= new Sample2();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();
		obj.m6();
		obj.m7();
		obj.m8();
		
//		Demo2 obj= new Demo2();
		
		//Sample2 obj= new Demo2();
		
		
		
		
		

	}

	

}
