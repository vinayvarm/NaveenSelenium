package Naveen_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement year=driver.findElement(By.id("yearbox"));
		WebElement month=driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement day=driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));
		getdropdownvalues(year);
		getdropdownvalues(month);
		getdropdownvalues(day);
      
    
     }  
	 // method to get values from dropdown 
	 public static void getdropdownvalues(WebElement element) {
    	 Select sel= new Select(element);
     List<WebElement> data=sel.getOptions();    	   
     System.out.println("size is" + data.size());
     int length=data.size();
     // get values for  web element
     
     for(int i=0;i<length;i++) {
    	 System.out.println(data.get(i).getText());
     }
     
    // method for getting dropdown valuess and store in arraylist
     
	}

}
