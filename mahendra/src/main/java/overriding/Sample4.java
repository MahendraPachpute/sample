package overriding;

public class Sample4 extends Demo4{

	public static void main(String[] args) {
		Sample4 obj = new Sample4();
		String c=obj.getName();
		System.out.println("old name is"+c);
		obj.setName("testing");
		System.out.println("new name is"+obj.getName());
	}

}
