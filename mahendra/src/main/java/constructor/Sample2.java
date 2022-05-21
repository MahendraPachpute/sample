package constructor;

public class Sample2 extends Demo2 {
	
	int a=10;
	public Sample2() {
	int a=200;
	System.out.println();
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
		
	}

	public static void main(String[] args) {
		Sample2 obj= new Sample2();

	}

}
