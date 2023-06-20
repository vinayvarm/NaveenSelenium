package STM_MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]"));
		Actions action= new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement destination=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div"));
		Thread.sleep(2000);
		action.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}

}
