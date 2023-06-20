package STM_MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
	
		WebElement drag= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions action= new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
	}

}
