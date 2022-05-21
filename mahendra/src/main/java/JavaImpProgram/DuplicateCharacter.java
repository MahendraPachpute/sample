package JavaImpProgram;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String a = "Selenium Testing";
		int ac = 0;
		char []abc=a.toCharArray();
		for (int i = 0; i < a.length();i++) 
		{
			for(int j=i+1;j<a.length();j++)
			{
				if(abc[i]==abc[j])
				{
					System.out.print(abc[j]);
					ac++;
					System.out.println(j);
					break;
					
				}
				
			}
			
		}
	}

}
