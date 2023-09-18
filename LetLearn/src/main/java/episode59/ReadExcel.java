package episode59;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	

	public static void main(String[] args) throws IOException {

		String filelocation = "./TestData/Data.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(filelocation);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rownum = sheet.getLastRowNum();
		short cellnum = sheet.getRow(0).getLastCellNum();
		for (int i = 1; i <= rownum; i++) {
			XSSFRow row = sheet.getRow(i);		
			for (int j = 0; j < cellnum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
				//String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}

		wbook.close();
	}
	

}
