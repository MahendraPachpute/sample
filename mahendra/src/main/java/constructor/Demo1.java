package constructor;

public class Demo1 {
	
		public Demo1(){
		System.out.println("o args method");
		}
		
		public Demo1(int a)
		{
			System.out.println("1 args method "+a);
		}
		public static void m1()
		{
			System.out.println("m1 method");
		}
	
	public static void main(String[] args) {
		
		Demo1 obj =new Demo1(20);
		obj.m1();
		
		
		
	}

}
