package utils;

import java.io.IOException;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		String projectpath = System.getProperty("user.dir");   // this because when we take into another machine location need not to change
		Excel excel = new Excel(projectpath+"/excel/Test.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getCellData(0, 0);
		excel.getNumericData(1, 1);
	}

}
