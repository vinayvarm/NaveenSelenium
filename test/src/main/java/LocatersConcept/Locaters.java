package LocatersConcept;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		//Thread.sleep(15000);
		// 1. FINDING ELEMENT BY ID LOCATER
		// WebElement ele=driver.findElementById("input-email");
		 //System.out.println(ele);
		 //WebElement el1=driver.findElementById("input-password");
		 //System.out.println(el1);
		driver.findElementById("input-email").sendKeys("naveenanimation20@gmail.com");
		driver.findElementById("input-password").sendKeys("Selenium12345");
		
		//2. finding element by name 
		driver.findElementByName("name").click();
		
		// 3.finding element by xpath
		driver.findElementByXPath("//input[@type=\"submit\"]").click();
		
		// 4. CSS locator
		driver.findElementByCssSelector("#username");
	     	
		// 5. classname
		
		driver.findElementByClassName("vinay");
		
		//6. link text: used for only links
		driver.findElementByLinkText("signup");
		
		//7. partial link text
		
		driver.findElementByPartialLinkText("sign").click();
		
		// 8. tagname 
		
		driver.findElementByTagName("a");
		
		driver.quit();
	}

}
	