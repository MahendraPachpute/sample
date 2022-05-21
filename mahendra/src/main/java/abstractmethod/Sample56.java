package abstractmethod;

public class Sample56 implements Demo5,Demo6 {
	public void s1() {
		System.out.println("s1 method in Demo6");
	}

	public void s2(int a) {
		System.out.println("s2 method in Demo6 "+a);
		
	}

	public void s3(String b) {
		System.out.println("s3 method in Demo6 "+b);
		
	}

	public void m1() {
		System.out.println("m1 method in Demo5");
		
	}

	public void m2(int a) {
		System.out.println("m2 method in Demo5 "+a);
		
	}

	public void m3(String b) {
		System.out.println("m2 method in Demo5 "+b);
		
	}
	

	public static void main(String[] args) {
		Sample56 obj=new Sample56();
		obj.m1();
		obj.m2(a);
		obj.m3(b);
		obj.s1();
		obj.s2(a);
		obj.s3(b);
		

	}

	
	
	
	
	
	
	
	
}
