package JavaImpProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.next();
		String orgstr=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		if(orgstr.equals(rev))
		{
			System.out.println("String is palindrome "+orgstr);
		}
		else
		{
			System.out.println("String is not palindrome "+orgstr);

		}
			
		
		
	}

}


