package STM_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownValues {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		List<WebElement> values=driver.findElements(By.tagName("option"));
		System.out.println(values.size());
		
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i).getAttribute("value"));
		}
		
		
		
		
	}

}
