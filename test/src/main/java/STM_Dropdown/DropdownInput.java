package STM_Dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownInput {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		System.out.println("launching chrome");
		driver.get("https://www.goibibo.com/");
		WebElement from=driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
		from.sendKeys("visakhapatnam");
		Thread.sleep(3000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
	}

}
