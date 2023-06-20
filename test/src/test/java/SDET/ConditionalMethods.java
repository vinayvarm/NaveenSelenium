package SDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // conditional methods are to know the status of an web element
	// is Displayed();
	// is Enabled();
	// is Selected();
		
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/register");
		 WebElement value=driver.findElement(By.xpath("//input[@placeholder='Search store']"));
		 System.out.println(value.isDisplayed());
		 System.out.println(value.isEnabled());
		 WebElement male=driver.findElement(By.xpath("//div[@id='gender']//span[1]"));
		 WebElement female= driver.findElement(By.xpath("//div[@id='gender']//span[2]"));
		 System.out.println(male.isSelected()); //false
		 System.out.println(female.isSelected()); // false
		 
		 male.click();
		 female.click();
		 
		 System.out.println(male.isSelected()); //true
		 System.out.println(female.isSelected()); // true
		 
		 
		 male.clear();
		 female.clear();
		 
		 System.out.println(male.isSelected()); //false
		 System.out.println(female.isSelected()); // false
		 
		 
		 
	}

}
