package Naveen_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
	    List<WebElement> data=driver.findElements(By.xpath("//select[@placeholder=\"Month\"]/option"));
		System.out.println(data.size());
		int length=data.size();
		System.out.println();
		for(int i=0;i<length;i++) {
			System.out.println(data.get(i).getText());
			if(data.equals("May")) {
				data.get(i).click();
				break;
			}
		}
		
		
	}

}
