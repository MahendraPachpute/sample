package JavaImpProgram;

public class ReverseString {

	public static void main(String[] args) {
		String st="Hello World";
		for(int i=st.length()-1;i>=0;i--)
		{
			System.out.print(st.charAt(i));
		}
	}

}
