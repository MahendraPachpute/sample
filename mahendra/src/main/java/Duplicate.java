
public class Duplicate {

	public static void main(String[] args) {

		String a="selenium";
		
	StringBuilder ob= new StringBuilder();
a.chars().distinct().forEach(c->ob.append((char)c));
System.out.println(ob);
		
		
	}

}
