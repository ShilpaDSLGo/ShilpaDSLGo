package Logger;

import org.testng.annotations.Test;





import Utilities.Loggerload;



public class LoggerTest1 {

	@Test
	public void testInfo()
	{
		int c,a=10, b=20;
		c=a+b;
		System.out.println("Value of c :"+c);
		Loggerload.info("Info  - Addition of integers");
	}
	
	@Test
	public void testError()
	{
		try
			{
			int i=1/0;
			}
		catch(Exception e)
			{
			System.out.println(e);
			}
		finally
			{
			Loggerload.error("Error - You can not divide a number by zero");
			}
	
	}
	
	@Test
	public void testWarn()
	{
		Loggerload.warn("Warning - Testing");
	}
}
