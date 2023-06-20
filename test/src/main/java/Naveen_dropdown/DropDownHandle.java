package Naveen_dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// handling facebook login using dropdown
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement year=driver.findElement(By.id("yearbox"));
		WebElement month=driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement day=driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));
	
		Select sel= new Select( year); 
		sel.selectByVisibleText("2004");
		
		// method which can can be called for dropdowns
		
		
		  dropdown(year,"1994"); dropdown(month,"January"); dropdown(day,"1");
		 	
	}
	
	
	  public static void dropdown(WebElement element, String value) {
	  
	  Select sel= new Select( element);
	  sel.selectByVisibleText(value);
	  
	  }
	 // dropdown get methods 
	
	

}
