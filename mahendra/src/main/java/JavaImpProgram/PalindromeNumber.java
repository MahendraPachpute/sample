package JavaImpProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int num =sc.nextInt();
		int orgnum=num;
		int reverse =0;
		while(num!=0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
			
		}
	if(orgnum==reverse)
	{
		System.out.println(orgnum+"  number is palindrome");
		
	}
	else
	{
		System.out.println(orgnum+"  number is not palindrome");
		
	}
		
	}

}
