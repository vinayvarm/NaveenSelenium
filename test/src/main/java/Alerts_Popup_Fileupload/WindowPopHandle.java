package Alerts_Popup_Fileupload;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Set<String> handles=driver.getWindowHandles();// will return a string, those will not be in order, so ierator is used to handle them
		Iterator<String> it= handles.iterator();
		String parentwindow=it.next();
		System.out.println("parent window" + parentwindow);
		String childwindow=it.next();
		System.out.println("childwindow" + childwindow);
	    driver.switchTo().window(childwindow);
	    System.out.println("child window is"+driver.getTitle());
	    driver.close();
	    driver.switchTo().window(parentwindow);
	    System.out.println("parent is"+ driver.getTitle());
	    
	    
		
		
	}

}
