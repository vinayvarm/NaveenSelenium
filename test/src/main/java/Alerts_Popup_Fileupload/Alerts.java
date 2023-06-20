package Alerts_Popup_Fileupload;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
	    Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		
		if(text.equals("I am an alert box!")) {
	       System.out.println("correct message");		
		}
		else {
			System.out.println("wrong mesage");
		}
	alert.accept();	
	
	// cancel the alert 
	
	driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	Thread.sleep(3000);
	Alert alert1=driver.switchTo().alert();
	String message=alert1.getText();
	System.out.println(message);
	alert1.dismiss();
	
	WebElement we= driver.findElement(By.xpath("//p[@id=\"demo\"]"));
	System.out.println(we);
	
	
	
	}

}
