package practise;

import utilslayer.ExcelReader;

public class Demo4 {
	public static void main(String[] args) {
		
	
	
		ExcelReader obj=new ExcelReader("C:\\Users\\SHRIKANT\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		String a= obj.getData(0,2,1);
		System.out.println(a);
		
		int row=obj.getRowCount(0);
				for(int i=0;i<=row;i++)
		{
		String b=obj.getData(0, i, 0);
		String c=obj.getData(0, i, 1);
		String d=obj.getData(0, i, 2);
		System.out.println(b+" "+c+" "+d);
		}
	}

}
