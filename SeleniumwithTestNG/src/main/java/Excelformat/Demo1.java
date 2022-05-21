package Excelformat;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {

	public static void main(String[] args) throws Exception  {
		File f= new File("C:\\Users\\SHRIKANT\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		System.out.println(f.exists());
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook ex=new XSSFWorkbook(fis);
		XSSFSheet sheet=ex.getSheetAt(0);
		System.out.println(sheet.getLastRowNum());
		
	}

}
