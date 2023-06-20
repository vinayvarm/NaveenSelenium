package Alerts_Popup_Fileupload;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class STM_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		
		/*
		 * driver.findElement(By.id("alertButton")).click(); Alert
		 * alert=driver.switchTo().alert(); alert.accept();
		 * driver.findElement(By.id("timerAlertButton")).click(); Thread.sleep(7000);
		 * driver.switchTo().alert(); alert.accept();
		 * driver.findElement(By.id("confirmButton")).click();
		 * driver.switchTo().alert(); alert.dismiss();
		 */
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		
		driver.findElement(By.id("promtButton")).click();
         driver.switchTo().alert().sendKeys("vinay");
	driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
