package SDET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1) How to Launch Browsers in WebDriver?  
	    // 2) How to Open URL?
				
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		// 3) How to capture Title of the page?
		
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		
	   // 4) How to capture URL of the page?
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
	    // 5) How to capture page source of the Page?
		
		String src=driver.getPageSource();
		System.out.println(src);
		
		// 6)  What is WebDriverManager?
		
		// webdrivermanager is an API
		// maintains stable browser and driver versions 
		// no need to download any browsers 
		
		
		driver.quit();
		
	}

}
