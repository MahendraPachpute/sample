
public class demo {

	public static void main(String[] args) {

		
		String a="selenium";
		StringBuilder str=new StringBuilder();
		a.chars().distinct().forEach(c->str.append((char)c));
		System.out.println(str);
	}

}
