package utilities;

public class exceldemo {

	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		ExcelReader excel= new ExcelReader(projectPath +"/excel/LoginDetails.xlsx","Sheet1");
		excel.getCellValueU1(1, 0);
		excel.getCellValueU2(2, 0);
		excel.getCellValueP1(1, 1);
		excel.getCellValueP2(2, 1);
	}

	
}
