package STM_WindowMultiple;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a/span")).click();
		Set<String> windowhandle=driver.getWindowHandles();
		System.out.println(windowhandle);
		Iterator<String> iterator=windowhandle.iterator();
		// iterator first sets in parent window
		// it.next will move window handle from parent to child
       String parent= iterator.next();
       String child=iterator.next();
       
       driver.switchTo().window(child);
       Thread.sleep(4000);
       driver.findElement(By.id("windowhandle")).sendKeys("vinay");
       
		
		
		
		
	}

}
