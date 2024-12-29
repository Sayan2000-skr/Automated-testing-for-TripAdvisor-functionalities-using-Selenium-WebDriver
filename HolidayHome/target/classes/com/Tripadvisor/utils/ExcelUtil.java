import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	
	public static String readData(int columnNo) {
		File file1;
		FileInputStream fis1;
		XSSFWorkbook workbook;
		XSSFSheet sheet = null;
	
	try {
		file1 = new File(usrDir + ".\\src\\test\\resources\\TestData\\InputData.xlsx");  // C:\\ReadData.xlsx
		
		fis1 = new FileInputStream(file1);
		workbook = new XSSFWorkbook(fis1);
		sheet = workbook.getSheetAt(0); // workbook.getSheet("Sheet1")
		
		Staring data = workbook.getRow(1).getCell(columnNo).getStringValue();
		return data;
		
		// workbook.getSheet("")

				
	} catch (FileNotFoundException fe) {
		System.out.println("File name or file path is not correct");
	} catch (IOException ie) {
		System.out.println("IO Exception");
	}

}
