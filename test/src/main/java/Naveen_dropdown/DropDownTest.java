package Naveen_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement year=driver.findElement(By.id("yearbox"));
		WebElement month=driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement day=driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));

		Dropdownutil.getdropdownvalues(day);
		
		
	}

}
