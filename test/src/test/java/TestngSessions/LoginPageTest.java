package TestngSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
			}
	
	   @Test(priority=1)
	   public void getTitle() {
		   String title=driver.getTitle();
		   System.out.println("page title is" + " "+ title);
		   Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	   }
	   
	   @Test(priority=2)
	   public void testSignin() {
		  boolean flag= driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).isDisplayed();
		  System.out.println(flag);
	   }
	   
	   @Test(priority=3)
	   public void login() {
		   
		      driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("6303101152");
	          driver.findElement(By.xpath("//input[@id='continue']")).click();
	          driver.findElement(By.id("ap_password")).sendKeys("NJDRD@90");
	          driver.findElement(By.id("signInSubmit")).click();
	       
	   }
	
     @AfterMethod
     public void tearDown() {
    	 driver.quit();
     }
	
	
}
