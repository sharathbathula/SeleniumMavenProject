package libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelUtil extends BasePage{
	
	public ExcelUtil(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sh = wb.getSheet(sheetName);
				
			int totalNoOfCols = 2;
			int totalNoOfRows = sh.getLastRowNum()+1;
			System.out.println(totalNoOfRows);
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {
				
				for (int j=0; j < totalNoOfCols; j++) {
					System.out.println(sh.getRow(i).getCell(j).toString());
					arrayExcelData[i-1][j] = sh.getRow(i).getCell(j).toString();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		}
		return arrayExcelData;
	}


}
