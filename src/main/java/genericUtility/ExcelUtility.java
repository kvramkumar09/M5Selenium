package genericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcel(String sheetname, int rowNum, int cellNum) throws Exception {
		FileInputStream fis = new FileInputStream(IConstantUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell= wb.getSheet(sheetname).getRow(rowNum).getCell(cellNum);
		DataFormatter df= new DataFormatter();
		String value= df.formatCellValue(cell);
		return value;
	}
	
	public void getMultipleDataFromExcel(String sheetname, int startRowNum, int startcellNum) throws Exception {
		FileInputStream fis = new FileInputStream(IConstantUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet(sheetname);
		DataFormatter df= new DataFormatter();
		for (int i=startRowNum; i<=sh.getLastRowNum();i++) {
			Row r=sh.getRow(i);
			for (int j=startcellNum;j<r.getLastCellNum();j++)
			{
			Cell c = r.getCell(j);
			//String value =c.getStringCellValue();
			String value = df.formatCellValue(c);
			System.out.println(value);
		}
	}
}
}
