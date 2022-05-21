package abstractmethod;

public class Sample3 implements Demo3{

	public void m1() {
		System.out.println("m1 method in Demo3");
	}

	public void m2() {
		System.out.println("m2 method in Demo3");
		
	}

	public void m3() {
		System.out.println("m3 method in Demo3");

	}
	public void m4() {
		System.out.println("m4 method is sample3");
	}

	
		public static void main(String[] args) {
			Sample3 obj = new Sample3();
			obj.m1();
			obj.m2();
			obj.m3();
			obj.m4();
		}
	
	
	

}
