package episode61a;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ReadXlData {
	
	@DataProvider()
	
	public String[][] testdata() throws IOException {
	
	String filelocation = "./TestData/Data.xlsx";
	XSSFWorkbook wbook = new XSSFWorkbook(filelocation);
	XSSFSheet sheet = wbook.getSheetAt(0);
	int lastrow = sheet.getLastRowNum();
	short lastcell = sheet.getRow(0).getLastCellNum();
	String[][] data = new String[lastrow][lastcell];
	for (int i = 1; i <= lastrow; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < lastcell; j++) {
			XSSFCell cell = row.getCell(j);
			DataFormatter dft = new DataFormatter();
			String value = dft.formatCellValue(cell);
			//String value = cell.getStringCellValue();
			//System.out.println(value);
			data[i-1][j] = value;
		} 
	}
	
	wbook.close();
	
	return data;
	
	
	}
	
	

}
