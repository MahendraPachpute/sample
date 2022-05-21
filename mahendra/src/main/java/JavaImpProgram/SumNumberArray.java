package JavaImpProgram;

public class SumNumberArray {

	public static void main(String[] args) {

		int []num= {1,2,3,4,5,6};
		int sum=0;
	
		for(int value:num)
		{
			sum=sum+value;
		}
		System.out.println("sum of array:"+sum);
	}

}
