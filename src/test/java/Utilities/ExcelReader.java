package Utilities;


import java.io.FileInputStream;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
public String path;
public FileInputStream fis;
private XSSFWorkbook workbook ;
private XSSFSheet sheet = null;
private XSSFRow row ;
private XSSFCell cell = null;

public  ExcelReader (String path) {
        
        try {
    		fis = new FileInputStream(path);
    	} catch (FileNotFoundException e1) {
    		// TODO Auto-generated catch block
    		e1.printStackTrace();
    	}
    	    try {
    			workbook = new XSSFWorkbook(fis);
    			sheet = workbook.getSheetAt(0);
    		} catch (IOException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
    	    
  }

  public List<String> getCellData(String sheetName,Integer ColumnNumber,Integer rowNum) {
	 
	 
	  int index = workbook.getSheetIndex(sheetName);
	   sheet = workbook.getSheetAt(index);
	   row = sheet.getRow(rowNum-1);
	   List<String> list = new ArrayList<>();
	   if(row!=null)
	   {
		   Cell cell = row.getCell(ColumnNumber);
		   if(cell!=null)
		   {
			   list.add(cell.getStringCellValue());
		   }
	   }
   try {
	workbook.close();
	fis.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   return list;
}
}
