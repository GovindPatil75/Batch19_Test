package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_3 {
	
	
	@Test
	public void verify_Login() {
		System.out.println("Test Login");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods="verify_Login")
	public void verify_HomePage() {
		System.out.println("Test HomePage");
	}
	
}
