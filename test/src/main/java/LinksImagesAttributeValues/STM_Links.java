package LinksImagesAttributeValues;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class STM_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		List<WebElement> values=driver.findElements(By.tagName("a"));
		System.out.println(values.size());
		
		// code for getting text for all links 
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i).getText());
			// code for printing links
			System.out.println(values.get(i).getAttribute("href")); 
		}
		// code for printing all dropdown   values
		
		
		
		
		
		driver.quit();
		
	}

}
