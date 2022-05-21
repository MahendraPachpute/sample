package utilslayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public XSSFWorkbook workbook;
	public ExcelReader(String path) {
		
		File f=new File(path);
		try {
			FileInputStream fis =new FileInputStream(f);
			workbook=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public String getData(int sheetIndex,int row,int cells) {
		XSSFSheet sheet =workbook.getSheetAt(sheetIndex);
		String a=sheet.getRow(row).getCell(cells).getStringCellValue();
		return a;
	}
	public int getRowCount(int sheetIndex) {
		int rows=workbook.getSheetAt(sheetIndex).getLastRowNum();
		return rows;
	}
	public int getColumnCount(int SheetIndex) {
		int col=workbook.getSheetAt(SheetIndex).getRow(0).getLastCellNum();
		return col;
	}

}
