package STM_Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions action= new Actions(driver);
		action.moveToElement(ele).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// thread.sleep()---- waits for time to be executed even if element found
		// imp wait-- once element found, it will move for next statement
		// exp wait-- wait for the condition to be executed, particular webelement wait will be determined
		
		
		
		
		
		
	}

}
