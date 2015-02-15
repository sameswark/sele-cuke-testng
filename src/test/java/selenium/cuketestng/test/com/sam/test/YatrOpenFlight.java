package selenium.cuketestng.test.com.sam.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import cucumber.api.java.Before;

public class YatrOpenFlight {
	
	
	@Before
	public void setup(){
		
		WebDriver driver = new FirefoxDriver();
		
	}
	
	

}
