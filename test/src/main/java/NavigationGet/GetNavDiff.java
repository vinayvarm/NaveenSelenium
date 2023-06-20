package NavigationGet;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetNavDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
// driver.get method will wait for the page to be loaded and then performs other operation, if it is available
		
		 driver.get("https://www.google.com");
		 System.out.println(driver.getTitle());
		 
// driver.navigate() method will not wait for the page to be loaded, it performs other operation, if it is available
       		
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
