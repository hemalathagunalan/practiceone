package testingprojectjunit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.tools.javac.launcher.Main;

import utility.Actionclass;

public class dashboardobject extends Actionclass {

	
	private static Logger logger=LogManager.getLogger();
	
@FindBy (css="button#deny.button.close")
//button#deny.button.close >div.wrapper>div.button-group-custom.clearfix>#allow"
WebElement Pushpromt_denybutton;

@FindBy (css="div.vQ43Ie")
WebElement promt;

@FindBy (css="button.M6CB1c.rr4y5c")
WebElement signout;
@FindBy (className="//textarea[@id='APjFqb']")
WebElement search;

@FindBy (xpath="span.logSprite.icClose")
WebElement Login_closebutton;

private WebDriver driver;



public dashboardobject(WebDriver driver){
	logger.error("consturcot invoked successfully");
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public boolean is_displayed()
{
return is_displayed(driver,Pushpromt_denybutton);
}
public boolean pushpromt_button_click()
{
return click(driver,Pushpromt_denybutton);
}
public boolean Login_button_click()
{
return click(driver,Login_closebutton);
}
public void Search(String data)

{
	try {
		driver.wait(5000);
		signout.click();
		search.sendKeys(data);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}



