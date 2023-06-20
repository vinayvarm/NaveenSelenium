

package TestngSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	//annotations
		//before
		//test
		//after
	WebDriver driver;
	
	By basicpage= By.xpath("//a[@id='nav-link-accountList']");
	By signincheck=By.xpath("//div[@class='a-box']//h1");
	By email=By.xpath("//input[@type='email']");
	By con1=By.xpath("//input[@id='continue']");
	By password= By.id("ap_password");
	By signin=By.id("signInSubmit");
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite--print vaalue from db");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test--db connection");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class--get vaalue from db");
	}
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	    driver.findElement(basicpage).click(); 
	    System.out.println("executing before method");
	    
	}
	// testing signup link 
	
	@Test(priority=1)
	public void VerifySigninTest() {
	      Assert.assertTrue(driver.findElement(signincheck).isDisplayed());	
	      System.out.println("executing test method");
	}
	
	@Test(priority=2, enabled=false)
	public void pageTitleTest() {
         String title=driver.getTitle();
         System.out.println("title is" + title);
         Assert.assertEquals(title, "Amazon Sign In");
	}
    @Test(priority=3,enabled=false)
    public void sample() {
    	 
          driver.findElement(email).sendKeys("6303101152");
          driver.findElement(con1).click();
          driver.findElement(password).sendKeys("NJDRD@90");
          driver.findElement(signin).click();
       
    }
  
    
	
	 
      @AfterMethod
	  public void tearDown() { System.out.println("after mehod"); }
	  @AfterClass
	  public void afterClass() {
		  System.out.println("after class");
	  }
	  @AfterTest
	  public void afterTest() {
		  System.out.println("after test");
	  }
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("after suite");
	  }
	}

	

