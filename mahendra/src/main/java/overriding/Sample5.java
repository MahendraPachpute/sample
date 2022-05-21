package overriding;

public class Sample5 extends Demo5 {

	public static void main(String[] args) {
		Sample5 obj=new Sample5();
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		obj.setId(2);
		obj.setName("cucumber");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}

}
