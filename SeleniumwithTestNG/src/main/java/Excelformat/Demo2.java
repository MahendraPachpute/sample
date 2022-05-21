package Excelformat;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		File f= new File("C:\\Users\\SHRIKANT\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		System.out.println(f.exists());
		FileInputStream fis =new FileInputStream(f);
		XSSFWorkbook exsheet=new XSSFWorkbook(fis);
		XSSFSheet ex=exsheet.getSheetAt(0);
		int row=ex.getLastRowNum();
		for(int i=0;i<=row;i++)
		{
			String user=ex.getRow(i).getCell(0).getStringCellValue();
			String pass=ex.getRow(i).getCell(1).getStringCellValue();
			String pune=ex.getRow(i).getCell(2).getStringCellValue();
			System.out.println(user+""+pass+""+pune);
		
		}
		
	}

}
