package Naveen_dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // WebDriver is a interface 
		// chromedriver,firefox are classes 
		// cannot create object for interface WebDriver
		// WebDriver wd= new WebDriver(); is not possible
		// chrome driver implementing the methods of interface
	    // child class can implement the methods of parent interface
		// Before launching chrome always check the version of chrome and chrome driver
		// validation is more important in automation
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();// session id is created and it will 
		//open browser
		driver.get("https://www.google.com"); // enter url
		
		// get title method
		String tit=driver.getTitle();
		System.out.println(tit);
		
		// validation of title 
		
		if(tit.equals("Google")) {
			System.out.println("correct title" +tit);
		}
		else {
			System.out.println("invalid title");
		}
		
        // get current url and page source 
		
		System.out.println(driver.getCurrentUrl());
     	//System.out.println(driver.getPageSource());	
		driver.quit();
		System.out.println(driver.getTitle());
	}

}
