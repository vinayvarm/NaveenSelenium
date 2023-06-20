import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // capturing texts for the links 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		List <WebElement> we= driver.findElements(By.xpath("//aside[@id='column-right']"));
		int len=we.size();
		System.out.println(len);
		for(int i=0;i<we.size();i++) {
		    String value=we.get(i).getText();
		    System.out.println(value);
		}
		
		driver.findElement(By.xpath("//aside[@id='column-right']/div/a[2]")).click();
		
		
		
		
	}

}
