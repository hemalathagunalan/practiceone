package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
public class runcucks {
	private WebDriver driver;
@Before
public void driverinit()
{
setDriver(new ChromeDriver());

}
public WebDriver getDriver() {
	return driver;
}
public void setDriver(WebDriver driver) {
	this.driver = driver;
}
	
}
