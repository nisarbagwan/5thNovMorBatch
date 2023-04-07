package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_cell_value {

	public static void main(String[] args) throws IOException {
		//string type value
		FileInputStream file = new FileInputStream("C:\\Selenium\\Parameterization\\demo work sheet file.xlsx");
        String data = WorkbookFactory.create(file).getSheet("demosheet").getRow(1)
        		.getCell(3).getStringCellValue();       
           System.out.println(data);
		
//         //int type value        
//           double data = WorkbookFactory.create(file).getSheet("demosheet").getRow(4)
//		   .getCell(5).getNumericCellValue();
//           System.out.println(data);
		
		//fetch last Row
//		int lastrow = WorkbookFactory.create(file).getSheet("demosheet").getLastRowNum();
//		System.out.println(lastrow);
	
//		//to fetch sheet name we used this method
//		Object abc = WorkbookFactory.create(file).getSheet("demosheet").getSheetName();
//		System.out.println(abc);
	}
}
