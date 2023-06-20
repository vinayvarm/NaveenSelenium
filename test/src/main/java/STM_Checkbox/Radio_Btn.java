package STM_Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio_Btn {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		Thread.sleep(3000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(2000);
		WebElement value=driver.findElement(By.xpath("//input[@id=\"redeemFlights\"]"));
		value.click();
		System.out.println(value.isSelected());
		
	}

}
