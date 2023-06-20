package TestngSessions;

import org.testng.annotations.Test;

public class dependsOnMethod {

	@Test(priority=1)
	public void login() {
		System.out.println("test1");
	
	}
	@Test(priority=2,dependsOnMethods="login")
	public void homepage() {
		System.out.println("test2");
		int i=9/0;
	}
	
	@Test(priority=3,dependsOnMethods={"login","homepage"})
	public void logout() {
		System.out.println("test3");
	}
	
}