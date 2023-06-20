package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RegPage2 {
	
	WebDriver driver;
	
	
	public RegPage2(WebDriver driver) 
    {
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }

	
	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(name="lastName")
	WebElement LastName;

	
	public RegPage2() {
		// TODO Auto-generated constructor stub
	}

	public void setFirstname(String fname) {
        		FirstName.sendKeys(fname);
	}
	
	public void setLastname(String lname) {
           LastName.sendKeys(lname);		
	}
	
}
