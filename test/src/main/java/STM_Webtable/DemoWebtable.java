package STM_Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		
		// GETTING ROW COUNT
		
		List<WebElement> rowcount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		int size=rowcount.size();
		System.out.println(size);
		// code for 1st row getting text
		
		String beforeXpath="//*[@id=\"customers\"]/tbody/tr[";
		
		String afterxpath="]/td[1]";
		
		for(int i=2;i<=7;i++) {
			String actualxpath= beforeXpath+i+afterxpath;
			WebElement we=driver.findElement(By.xpath(actualxpath));
			System.out.println(we.getText()); 
			}
		System.out.println("===========================");
		// code for 2nd row text
		String afterxpathconcept="]/td[2]";
		for(int i=2;i<=7;i++) {
			String conceptxpath=beforeXpath+i+afterxpathconcept;
			WebElement we1=driver.findElement(By.xpath(conceptxpath));
			System.out.println(we1.getText());
		}
		System.out.println("===========================");
		// code for 3rd row text
				String afterxpathcountry="]/td[3]";
				for(int i=2;i<=7;i++) {
					String countryxpath=beforeXpath+i+afterxpathcountry;
					WebElement we2=driver.findElement(By.xpath(countryxpath));
					System.out.println(we2.getText());
				}
				System.out.println("===========================");
	}

}
