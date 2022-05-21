package JavaImpProgram;

public class RemoveDupli {

	public static void main(String[] args) {
String a="selenium testing";
String duplicate="";
for(int i=0;i<a.length();i++)
{
	if(!duplicate.contains(String.valueOf(a.charAt(i))))
	
		duplicate+=a.charAt(i);
		
	System.out.println(duplicate);
	
}
	}

}
