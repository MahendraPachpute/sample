package javatutorial1;

import java.util.Arrays;

public class Demo8 {

	public static void main(String[] args) {
		int []abc=new int[5];
		abc[0]=100;
		abc[1]=150;
		abc[2]=10;
		abc[3]=55;
		abc[4]=300;
	System.out.println(abc.length);
		for(int a:abc)
		{
			System.out.println(a);
		}
		for(int i=0;i<=abc.length-1;i++)
		{
			System.out.println(abc[i]);
		}
		System.out.println(Arrays.toString(abc));
	}

}
