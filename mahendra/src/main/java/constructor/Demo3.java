package constructor;

public class Demo3 {
	
	Demo3(){
		System.out.println("o args");
	}
	public Demo3(int a) {
		
		System.out.println(a);
		
	}
	public Demo3(int a,int b) {
		System.out.println("2 int args");
		
	}

		
	

	public static void main(String[] args) {
		
		Demo3 obj=new Demo3(10,10);		
	}

}
