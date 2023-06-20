package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
   WebDriver driver;
	
	By verifyregister=By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[1]/strong");
   
	@BeforeTest
	@Parameters({"appurl"})
	public void setup(String appurl) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(appurl);
	}
	@Test
	public void verifyRegisterAccount() {
		
	     String value=driver.findElement(verifyregister).getText();	
		System.out.println(value);
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
