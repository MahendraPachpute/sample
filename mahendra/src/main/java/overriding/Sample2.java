package overriding;

public class Sample2 extends Demo2 {
	public void abc()
	{
		System.out.println("Sample2 with o args");
	}
	public void abc(int a )
	{
		System.out.println("Sample2 with 1 int args");
	}
	public void abc(String a,int b)
	{
		System.out.println("Sample2 with 1 String and 1 int args");
	}

	public static void main(String[] args) {
		Sample2 obj =new Sample2();
		obj.abc();
		obj.abc(100);
		obj.abc("selenium",10);
		
	}

}
