package Frameworkpracflipkart;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SampleTestNG {
	
	@Test(priority=1, invocationCount=5)
	public void CreateUser() {
		System.out.println("Create User");
	}
	
	@Test(priority=-2, dependsOnMethods = {"CreateUser","DeleteUser"})
	public void ModifiedUser() {
		System.out.println("Modified User");
	}
	
	@Test(invocationCount=0)
	public void DeleteUser() {
		System.out.println("Delete User");
	}
	
	@Test(enabled=false)
	public void enabled() {
		System.out.println("enabled User");
	}
	
	@Ignore
	@Test(invocationCount=0)
	public void ignoreMethod() {
		System.out.println("ignore this method");
	}

}
