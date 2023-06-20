package Alerts_Popup_Fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// in-order to access the file, attribute should be filetype.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"input-4\"]")).sendKeys("C:\\Users\\Hp\\Downloads\\sm.jpeg");

	}

}
