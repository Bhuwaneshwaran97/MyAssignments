package week6day1_assignments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String filename) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("./excelData/"+filename+".xlsx");
		XSSFSheet sheetAt = book.getSheetAt(0); // represents sheet 1 in excel file, index starts with zero.
		XSSFRow row = sheetAt.getRow(0);
		int rowCount = sheetAt.getLastRowNum();
		int colCount = row.getLastCellNum();
		
		String[][] data = new String[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cellValue = sheetAt.getRow(i).getCell(j).getStringCellValue();
			data[i-1][j] = cellValue;
			}
		}
		book.close();
		return data;
	}
	
}
