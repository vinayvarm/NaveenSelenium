package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegTest {

	@Test
	public void bookFlight() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
     	driver.get("http://demo.guru99.com/test/newtours/register.php");
		/*
		 * RegPage rp= new RegPage(driver); rp.setfirstName("vinay");
		 * rp.setlasstName("varma"); rp.setPhone("567567657");
		 */
     	
     	RegPage2 rp= new RegPage2(driver);
     	rp.setFirstname("vinay");
     	rp.setLastname("varma");
     	
	}
	
}
