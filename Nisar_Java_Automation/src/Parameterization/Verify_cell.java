package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Verify_cell {

	public static void main(String[] args) throws IOException {
			FileInputStream file = new FileInputStream("C:\\Selenium\\Parameterization\\demo work sheet file.xlsx");
	  		
			Sheet rowdata = WorkbookFactory.create(file).getSheet("demosheet");
		   CellType ct = rowdata.getRow(2).getCell(2).getCellType();
	          
		   System.out.println(ct);

	}

}
