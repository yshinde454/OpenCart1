package utility;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * This class is used for the main set up  before the all test cases.
 * 
 * browser setup, url load, maximize window, close window
 * 
 * @author user
 *
 */

public class Base {
	public static EdgeDriver driver;
	//this is created for setup or configuration
	@BeforeMethod
	public void setUp() {
		driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}
	
	//this is created to close after running the test cases
	@AfterMethod
	public void closeIt() {
		driver.quit();
	}

}
