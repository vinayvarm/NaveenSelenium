package STM_IFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesExample2 {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/nestedframes");
		// handling parent frame
		driver.switchTo().frame("frame1");
		// travel through child frame
		driver.switchTo().frame(0);
		// get back to parent frame
		driver.switchTo().parentFrame();
		// get  out of frames
		driver.switchTo().defaultContent();
		
		
	}

}
