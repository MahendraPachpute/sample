package JavaImpProgram;

public class SeparateStringCharcterInteger {

	public static void main(String[] args) {
		Object[]a= {'a',12345,'h',"selenium",789};
		for(int i=0;i<a.length;i++)
		{
			if(a[i].getClass()==Integer.class)
			{
				System.out.println("integer is  " + a[i]);
			}
			else if(a[i].getClass()==String.class)
			{
				System.out.println("string is  "+a[i]);
			}
			else if(a[i].getClass()==Character.class)
			{
				System.out.println("character is   "+a[i]);
			}
		}
		
	}

}
