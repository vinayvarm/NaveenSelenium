package STM_Dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownMultiselect {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		// if the dropdown has multi select values then following methods will ber helpfull
		
		// select.getFirstSelectedOption();
		// return WebElement so u can save it
		//select.getAllSelectedOptions()----- save it in list
		// it is saved in list so list.size() will give its size
		
		
	}

}
