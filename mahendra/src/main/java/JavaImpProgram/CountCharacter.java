package JavaImpProgram;

public class CountCharacter {

	public static void main(String[] args) {

		String str="mahendra pachpute";
		int a=str.length();
		int b=str.replace("e","").length();
		System.out.println(a-b);
	}
}
