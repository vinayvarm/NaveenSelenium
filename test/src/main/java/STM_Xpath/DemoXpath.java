package STM_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.salesforce.com/eu/form/signup/freetrial-sales-pe/");
		Thread.sleep(2000);
		WebElement we=driver.findElement(By.xpath("//*[@id=\"UserFirstName-SPZC\"]"));
		we.sendKeys("vinay");
		
		
	}

}
