package Utilities;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
	
	public class ConfigReader {
		private static String browserType = null;
	//This method is used to load the properties from the config file
	public static Properties init_prop() throws IOException
	{	
		FileInputStream ip = new FileInputStream("./src/test/resources/Config/config.properties");

	  Properties prop=new Properties();
	 
			prop.load(ip);
		
		
		return prop;
	}
	public static void setBrowserType(String browser)
	{
		browserType = browser;
	}
	public static String getBrowserType() 
	{	
		
			return browserType;
		
			
	}
	public static String getExpectedText2() throws IOException
	{
		return init_prop().getProperty("expectedText2");
	}
	public static String getExpectedText3() throws IOException
	{
		return init_prop().getProperty("expectedText3");
	}
	public static String getGraphUrl() throws IOException
	{
		return init_prop().getProperty("expectedGraphUrl");
	}
	public static String getURL() throws IOException
	{
		return init_prop().getProperty("url");
	}
   public  static String getPath() throws IOException 
   {
	   return init_prop().getProperty("path");
   }
   public static String ExpURL() throws IOException
   {
	   return init_prop().getProperty("expectedUrl");
   }
   public static String getMessage() throws IOException
   {
	   return init_prop().getProperty("expectedMessage");
   }
   public static String getTreeURL() throws IOException
   {
	   return init_prop().getProperty("expectedTreeURL");
   }
   public static String getQueueUrl() throws IOException
   {
	   return init_prop().getProperty("expectedQueueUrl");
   }
   public static String getExpText() throws IOException
   {
	   return init_prop().getProperty("expectedText");
   }
   public static String getExpText1() throws IOException
   {
	   return init_prop().getProperty("expectedText1");
   }
   public static String getExpText4() throws IOException
   {
	   return init_prop().getProperty("expectedText4");
   }
   public static String getExpText5() throws IOException
   {
	   return init_prop().getProperty("expectedText5");
   }
   
  
}
