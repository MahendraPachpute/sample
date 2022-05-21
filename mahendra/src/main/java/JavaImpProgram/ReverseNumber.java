package JavaImpProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number=123456789, reverse =0;
		while(number!=0)
		{
			//int remainder=number%10;
			reverse =reverse*10+number%10;
			number=number/10;
			
		}
		System.out.println("the reverse of number is:"+reverse);
	}

}
