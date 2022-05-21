package constructor;

public class Demo4 {
	int a=10;
	public Demo4()
	{
		this(10);
		System.out.println("o args");//4
	}
	public Demo4(int a) {
		this(10,20);
		System.out.println("i args"+a);//3
	}
	public Demo4(int a, int b)
	{
		System.out.println("2 int args");//2
	}

	public static void main(String[] args) {
		System.out.println("mms");//1
		Demo4 obj=new Demo4(10,20);
		System.out.println("mme");//5
		

	}

}
