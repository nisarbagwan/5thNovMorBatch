package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verify_cell_type {

	

	public static void main(String[] args) throws Exception, IOException {
		FileInputStream file = new FileInputStream("C:\\Selenium\\Parameterization\\demo work sheet file.xlsx");
       Sheet sheet1 = WorkbookFactory.create(file).getSheet("demosheet");
              Cell cellinfo = sheet1.getRow(0).getCell(0);
              CellType CT = cellinfo.getCellType();
              
//             if (CT==cellinfo.STRING) {
//           	  System.out.println(sheetdata.getStringCellValue());
//              }
//             else if (CT==cellinfo.NUMERIC){
//        		System.out.println(cellinfo.getNumericCellValue());
//        	}
//             else if (CT==cellinfo.BOOLEAN){
//            		System.out.println(cellinfo.getBooleanCellValue());
//            	} 
	}
	

}
