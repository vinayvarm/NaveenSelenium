package Alerts_Popup_Fileupload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Automatic chromedriver and chrome browser updation 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
