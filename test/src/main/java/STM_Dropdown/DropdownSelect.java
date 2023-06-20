package STM_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelect {
	public static WebDriver driver;
	
	public static void main(String a[]) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		WebElement value=driver.findElement(By.name("employees_c"));
		
		// single select dropdowns
		
		Select select= new Select(value);
		select.selectByIndex(1);
		//select.deselectByIndex(1);
		select.selectByValue("level5");
		//select.deselectByValue("level5");
		select.selectByVisibleText("1,001 - 2,500 employees");
		//select.deselectByVisibleText("1,001 - 2,500 employees");
		
		
		
		
		
	}
	

}
