package STM_IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoIframe {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		
		  //using index
		   //driver.switchTo().frame(0);
		  //driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys"selenium");
		 
		// using name 
		
		// driver.switchTo().frame("SingleFrame");
		// driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("iframe with name");
		// using webelement
		WebElement frame1= driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("iframe with webelement");
		// come out of frames
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		WebElement cb2=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		cb2.click();
		cb2.sendKeys("we are in second frame");
		/*
		 * WebElement
		 * frame1=driver.findElement(By.xpath("//div[@class=\"tabpane\"]//li[1]"));
		 * driver.switchTo().frame(frame1); String frametext=frame1.getText();
		 * System.out.println(frametext); frame1.click();
		 * System.out.println("clicked on iframe");
		 */	
	}

}
