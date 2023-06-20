package STM_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleClick {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		System.out.println("launching chrome");
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		// code for selecting all the check boxes
		/*
		 * driver.findElement(By.id("interest_market_c0")).click();
		 * driver.findElement(By.id("interest_sell_c0")).click(); JavascriptExecutor js
		 * = (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,250)",
		 * ""); driver.findElement(By.id("interest_serve_c0")).click();
		 */
		
		// code for checking and unchecking 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");
		Thread.sleep(3000);
		WebElement cb1=driver.findElement(By.id("interest_market_c0"));
		for(int i=0;i<=1;i++) {
		   	cb1.click();
		     Thread.sleep(3000);
		}

		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
		
		
		//WebElement radio=driver.findElement(By.id("doi0"));
		
		
		
	// we can also use actions class
		
		//Actions action= new Actions(driver);
		//action.moveToElement(radio);
		//action.perform();
	}

}
