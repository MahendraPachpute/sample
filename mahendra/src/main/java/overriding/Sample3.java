package overriding;

public class Sample3 extends Demo3 {

	public static void main(String[] args) {
		Sample3 obj =new Sample3();
		String a=obj.getName();
		System.out.println("old name is "+a);
		obj.setName("pom");
		System.out.println("new name is "+obj.getName());
		
	}

}
