package TestngSessions;

import org.testng.annotations.Test;

public class ExceptedExceptConcept {

	@Test(expectedExceptions=Throwable.class)
	public void  test() {
		System.out.println("test");
	    int i=9/0;
		System.out.println("test1");
	}
	// used when giving demo
	// to reduce or cover issues
    // for multpile exception 
	// @Test(expectedExceptions={ArithmeticException.class,NUllPointerException.class})
	
}
