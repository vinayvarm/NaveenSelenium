package Alerts_Popup_Fileupload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hubspot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		String tit=driver.getTitle();
		System.out.println(tit);
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		// to test sign in page 
		String value=driver.findElement(By.xpath("//div[@class='a-box']//h1")).getText();
		System.out.println(value);
        if(value.equals("Sign-In")) {
        	System.out.println("correct message");
        }		
        else {
        	System.out.println("invalid message");
        }
        
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("6303101152");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.id("ap_password")).sendKeys("NJDRD@90");
        driver.findElement(By.id("signInSubmit")).click();
        
        
        
	}

}
