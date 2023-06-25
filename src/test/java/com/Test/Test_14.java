package com.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_14 {
	
	@Test
	public void verify_HomePageTest_001() {
		
		// SoftAssert class -Object
		SoftAssert soft=new SoftAssert();
		
		System.out.println("User name");
		System.out.println("Password");
		System.out.println("Login");
		
		
		String Expected="XYZ";
		String Actual="BugSpotter";
		
		// Verify
		soft.assertEquals(Actual, Expected); // PASS
		
		System.out.println("User name");
		System.out.println("Password");
		System.out.println("Login");
		
		soft.assertEquals(Actual, Expected); // PASS
		
		//
		soft.assertAll(); //
		
	}

}
