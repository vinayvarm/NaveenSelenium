package NavigationGet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// driver.navigate().to()
		// driver.navigate().back()
		// driver.navigate().forward()
		// driver.navigate().refresh()
		// diff btw navigate and get method
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-3.141.59\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.amazon.in");
		System.out.println(driver.getTitle()); // gives amazon title
		driver.navigate().back();
		System.out.println(driver.getTitle()); // gives google title
		driver.navigate().forward();
		System.out.println(driver.getTitle()); // gives amazon title
		driver.navigate().back();
		System.out.println(driver.getTitle());//gives google title
		
		driver.close();
			}

}
