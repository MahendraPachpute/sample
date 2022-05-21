package Excelformat;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		File f=new File("C:\\Users\\SHRIKANT\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		System.out.println(f.exists());
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook ex =new XSSFWorkbook(fis);
		XSSFSheet sheet=ex.getSheetAt(1);
		int row=sheet.getLastRowNum();
		
		for(int i=0;i<=row;i++)
		{
			String user=sheet.getRow(i).getCell(0).getStringCellValue();
			String pass=sheet.getRow(i).getCell(1).getStringCellValue();
			String location1=sheet.getRow(i).getCell(2).getStringCellValue();
			String location2=sheet.getRow(i).getCell(3).getStringCellValue();
			System.out.println(user+"...."+pass+"...."+location1+"...."+location2);
		}
		
		
		
	}

}
