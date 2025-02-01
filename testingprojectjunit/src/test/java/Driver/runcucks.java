package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
public class runcucks {
	private static WebDriver driver;
@Before
public static WebDriver driverinit()
{
	if(driver==null) {
System.out.println("came for driver init");
driver = new ChromeDriver();
System.out.println("came for driver init a");
	}
	return driver;
}
public static WebDriver getDriver() {
	System.out.println("came for driver init b");
	return driverinit();
}

	
}
