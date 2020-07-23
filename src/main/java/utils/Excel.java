package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	static String projectpath;
	static XSSFWorkbook wb;
	static XSSFSheet sh;

	public Excel(String excelpath, String sheetname) throws IOException {

		
		//System.out.println(projectpath);
		wb = new XSSFWorkbook(excelpath);
		sh = wb.getSheet(sheetname);
	}

	public static void main(String[] args) throws IOException {

		getRowCount();
		getCellData(0, 1);
		getNumericData(1, 1);
	}

	public static void getRowCount() throws IOException {

		int rowCount = sh.getPhysicalNumberOfRows();
		System.out.println("No.ofrows :" + rowCount);

	}

	public static void getCellData(int rowNum, int colNum) throws IOException {

		String celldata = sh.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(celldata);

	}

	public static void getNumericData(int rowNum, int colNum) throws IOException {

		double numericvalue = sh.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(numericvalue);
	}

}
