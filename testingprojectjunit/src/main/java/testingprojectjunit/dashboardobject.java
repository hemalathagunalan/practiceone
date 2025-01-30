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

	
	private static Logger logger=LogManager.getLogger(Main.class);
	
@FindBy (css="button#deny.button.close")
//button#deny.button.close >div.wrapper>div.button-group-custom.clearfix>#allow"
WebElement Pushpromt_denybutton;

@FindBy (xpath="span.logSprite.icClose")
WebElement Login_closebutton;

public WebDriver driver;

public dashboardobject(WebDriver driver.getDriver){
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
}



