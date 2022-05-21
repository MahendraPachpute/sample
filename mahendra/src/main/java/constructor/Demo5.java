package constructor;

public class Demo5 {

	Demo5(String a)
	{ 
		this(10);
		System.out.println("1 String args "+a);
	}
	Demo5(int a)
	{
		this("Selenium",10);
		System.out.println("i int arg "+a);
	}
	Demo5(String a,int b)
	{
		
		System.out.println("1 string 1 int arg "+(a+b));
	}
	
	public static void main(String[] args) {
		Demo5 obj= new Demo5("test");
		

	}

}
