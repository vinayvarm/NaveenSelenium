package TestngSessions;

import org.testng.annotations.Test;

public class InvocationCount {

	// want to execute method 10 times
	
@Test(invocationCount=10)
public void test() {
	System.out.println("test method");
}




}
