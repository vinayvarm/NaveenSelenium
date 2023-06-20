package Naveen_dropdown;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownutil {

	
	 public static void dropdown(WebElement element, String value) {
		  
		  Select sel= new Select( element);
		  sel.selectByVisibleText(value);
		  
		  }
	
	
	 public static void getdropdownvalues(WebElement element) {
    	 Select sel= new Select(element);
     List<WebElement> data=sel.getOptions();    	   
     System.out.println("size is" + data.size());
     int length=data.size();
     // get values for  web element
     
     for(int i=0;i<length;i++) {
    	 System.out.println(data.get(i).getText());
     }
	
	
	 }
	
}
