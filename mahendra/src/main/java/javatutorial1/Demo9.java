package javatutorial1;

public class Demo9 {
	 static int a=100;
	public void m1()
	{
		m2();
		int a=120;
		int b=200;
				System.out.println(a);
		System.out.println(b);
	}
	public static void m2()
	{
		int c=150;
		String d="selenium";
		System.out.println(c);
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		Demo9 obj= new Demo9();
		obj.m1();
		
		System.out.println(a);
		
		
				
	}

}
