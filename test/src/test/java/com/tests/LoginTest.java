package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    WebDriver driver;
	
	By email= By.cssSelector("input[id='input-email']");
	By password= By.cssSelector("input[id='input-password']");
	By logincheck=By.xpath("//h2[text()='Returning Customer']");				
	By loginbutton=By.xpath("//input[@type=\"submit\"]");
	
	@BeforeTest
	@Parameters({"url"})
	public void setUp(String url) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		
	}
	@Test(priority=1)
	public void verifyLoginPage() {
	  
		/*
		 * String
		 * text=driver.findElement(By.xpath("//h2[text()='Returning Customer']")).
		 * getText(); System.out.println(text); Assert.assertEquals(text,
		 * "Returning Customer");
		 */		
		Assert.assertTrue(driver.findElement(logincheck).isDisplayed());
		System.out.println("verified login check");
	
	}
	@Test(priority=2)
	@Parameters({"un","pwd"})
	public void loginTest(String un,String pwd) {
		driver.findElement(email).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginbutton).click();
	}
	
   @AfterTest
   public void tearDown() {
	   // driver.quit();
   }
	
	
	
}
