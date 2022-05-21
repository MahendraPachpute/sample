package abstractmethod;

public class Sample4 implements Demo4{

	public void m1() {
		System.out.println("m1 in Demo4 ");
	}

	public void m2(int a) {
		System.out.println("m2 in Demo4 "+a);
		
	}

	public void m3(String a) {
		System.out.println("m3 in Demo4 "+b);
		
	}
	
	public void m4(int a, String b) {
		System.out.println("m4 in sample4 class"+(a+b));
	}
	
	public static void main(String[] args) {
		Demo4 obj=new Sample4();
		obj.m1();
		obj.m2(a);
		obj.m3(b);
		//obj.m4(a, b);
		
	}
}

		