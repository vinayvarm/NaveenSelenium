package UdemyXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/");
		driver.findElement(By.xpath("//div[@id='navbar']//div//div//div//li[2]/a")).click();
		
		//div[@id="navbar"]//a[starts-with(@class,'navbar-link')]
		
		
	}

}
