package Utilities;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelReader1 {
	 WebDriver driver;
	 XSSFWorkbook workBook ;
	  XSSFSheet sheet ;
	  String projectPath;

	//Creating a constructor to call every time the class is called.
	
	public ExcelReader1(String excelPath, String sheetName) {
		try {
			//projectPath=System.getProperty("user.dir");
			workBook=new XSSFWorkbook (excelPath);
			sheet=workBook.getSheet(sheetName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) {
//		
//		getCellValueU1(1,0);
//		getCellValueU2(2,0);
//        getCellValueP1(1,1);
//        getCellValueP2(2,1);
//	}

	
	public  String  getCellValueU1 (int rownum, int colnum) {
		try {
			//projectPath=System.getProperty("user.dir");
			//workBook=new XSSFWorkbook (projectPath +"/excel/LoginDetails.xlsx");
			sheet=workBook.getSheet("Sheet1");
			String userName1=sheet.getRow(1).getCell(0).getStringCellValue();
			System.out.println(userName1);
			return userName1;
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}return null;
		} 

	
	
	public  String getCellValueP1(int rownum, int colnum) {
		try {
			
			String password1=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println(password1);
			return password1;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}return null;
		}




	public  String getCellValueU2(int rownum, int colnum) {
		try {
			//projectPath=System.getProperty("user.dir");
			//workBook=new XSSFWorkbook (projectPath +"/excel/LoginDetails.xlsx");
			sheet=workBook.getSheet("Sheet1");
			String userName2=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println(userName2);
			return userName2;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		} return null;
	}



	public  String getCellValueP2(int rownum, int colnum) {
		try {
			
			String password2=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println(password2);
			return password2;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}return null;
		}
}