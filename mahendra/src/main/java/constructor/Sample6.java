package constructor;

public class Sample6 extends Demo6{
	int a=200;
	Sample6()
	{
		System.out.println("0 args in sample");
	}
	Sample6 (int a)
	{
		super("Selenium");
		
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println("1 int args in sample");
	}
	Sample6(String a){
		this(10);
		
		System.out.println("1 String args in sample");
	}

	public static void main(String[] args) {
		Sample6 obj= new Sample6("java");

	}

}
