package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchdata_cellnum {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Selenium\\Parameterization\\demo work sheet file.xlsx");

		Sheet sheet1 = WorkbookFactory.create(file).getSheet("demosheet");
		short cellsize = sheet1.getRow(0).getLastCellNum();
		System.out.println(cellsize);
		
		for (int i=0;i<=cellsize;i++) {
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.print(data+" ");
			
			
			
		
			
			
		}
		
		
		
		
	}

}
