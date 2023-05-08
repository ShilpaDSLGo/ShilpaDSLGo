package Logger;

import org.testng.annotations.Test;



import Utilities.Loggerload;

public class Logtest {
	@Test
	public void test001()throws InterruptedException 
	{
		Loggerload.info("<----------Testing info------------>");
		
		Loggerload.warn("<----------Testing warn------------>");
		
		Loggerload.error("<----------Testing error------------>");
				
	}

}
