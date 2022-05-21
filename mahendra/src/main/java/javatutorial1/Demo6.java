package javatutorial1;

public class Demo6 {

	public static void main(String[] args) {
		String a="selenium";
		char[] abc=(a.toCharArray());
		System.out.println(abc.length);
		System.out.println(abc[3]);
		for(int i=0;i<abc.length;i++)
		{
			System.out.print(abc[i]);
		}
		{
		System.out.print("..............");
		}
		for(int i=abc.length-1;i>=0;i--)
		{
			System.out.print(abc[i]);
		}
	}

}
