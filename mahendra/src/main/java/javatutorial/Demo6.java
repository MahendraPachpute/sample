package javatutorial;

public class Demo6 {

	public static void main(String[] args) {
		String []a=new String[5];
		a[0]="selenium";
		a[1]="cucumber";
		a[2]="testng";
		a[3]="java";
		a[4]="pom";
		int abc=a[0].length()-1;
		for (int i=abc;i>=0;i--)
		{
			System.out.print(a[0].charAt(i));
		}
		
	}

}
