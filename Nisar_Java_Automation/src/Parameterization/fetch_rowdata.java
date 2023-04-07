package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_rowdata {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Selenium\\Parameterization\\demo work sheet file.xlsx");
  		
		Sheet rowdata = WorkbookFactory.create(file).getSheet("demosheet");
			int lastrowindex = rowdata.getLastRowNum();
			System.out.println(lastrowindex);
			for (int i = 0;i <=lastrowindex; i++) {
				String data = rowdata.getRow(i).getCell(2).getStringCellValue();
			
				System.out.print(" "+data);
			}
			
	}
	}

