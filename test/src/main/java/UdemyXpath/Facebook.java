package UdemyXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		// code for handling toggle checkbox
		WebElement we= driver.findElement(By.id("checkbox1"));
		
		for(int i=0;i<2;i++) {
	        we.click();	
	        System.out.println(we.isSelected());
		}
		// to get all the links 
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			String ele=links.get(i).getText();
			System.out.println(ele);
			}
		
		
		
	}

}
