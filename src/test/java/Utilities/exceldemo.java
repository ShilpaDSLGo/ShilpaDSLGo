package Utilities;

import org.openqa.selenium.WebDriver;

public class exceldemo {
	 WebDriver driver;
	public static void main(String[] args) {
		//String projectPath=System.getProperty("user.dir");
		ExcelReader1 excel= new ExcelReader1("C:\\Users\\shaun\\eclipse-workspace\\Ds_AlgoProject3\\src\\test\\resources\\excel\\LoginDetails.xlsx","Sheet1");
		excel.getCellValueU1(1, 0);
		excel.getCellValueU2(2, 0);
		excel.getCellValueP1(1, 1);
		excel.getCellValueP2(2, 1);
		System.out.println(excel.getCellValueU1(1,0));
	}

	
}
