package Log4j;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookFlight {
	
	public static void main(String args[]) {
		Logger logger= Logger.getLogger("BookFlight.class");
		//PropertyConfigurator.configure("log4j2.properties");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		logger.info("openinig browser");
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		logger.info("entering firstname");
		driver.findElement(By.name("firstName")).sendKeys("vinay");
		logger.info("openinig lastname");
		driver.findElement(By.name("lastName")).sendKeys("varma");
		logger.info("quitting browser");
	    driver.quit();	
	}
	

}
