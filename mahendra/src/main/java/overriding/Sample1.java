package overriding;

public class Sample1 extends Demo1{
	public void abc() {
		System.out.println("Sample 1");
	}
	
	

	public static void main(String[] args) {
		Sample1 obj= new Sample1();
		obj.abc();
	}

}
