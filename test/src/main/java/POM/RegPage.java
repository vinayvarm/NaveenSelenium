package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RegPage {

	WebDriver driver;
	By firstname = By.name("firstName");
	By lastname = By.name("lastName");
	By phonenum = By.name(
			"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input");

	
	  RegPage(WebDriver d){ driver=d; }
	 
	public void setfirstName(String fname) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(firstname).sendKeys(fname);
	}

	public void setlasstName(String lname) {
		driver.findElement(lastname).sendKeys(lname);

	}

	public void setPhone(String phone) {
		driver.findElement(phonenum).sendKeys(phone);
	}

}
