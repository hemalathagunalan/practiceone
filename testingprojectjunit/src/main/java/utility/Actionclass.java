package utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Actionclass {
	
	public static Logger logger=LogManager.getLogger();
	
	public boolean is_displayed(WebDriver driver,WebElement element)
	{
		try{
			element.isDisplayed();
			logger.info("elements are displayed");
			return true;
		}catch(Exception e)
		{
			logger.info(e);
			return false;
		}
	}
	
	public boolean click(WebDriver driver,WebElement element)
	{
	try{
		element.click();
		return true;
	}catch(Exception e)
	{
		logger.info(e);
		return false;
	}
	}
	
}
