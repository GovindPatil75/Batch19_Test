package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_13 {
	
	
	@Test
	public void verifyTest_TC_001() {
		
		//Test Steps 
		
		String expected="ABC";
		String Actual="ABCD";
		//Verify
		Assert.assertEquals(Actual, expected); // PASS -Fail
		
		//Test Steps 
		System.out.println("Action");
		
	}

	@Test
	public void verifyTest_TC_002() {
		
		//Test Steps 
		
		String expected="ABC";
		String Actual="ABC";
		//Verify
		Assert.assertEquals(Actual, expected); // PASS -Fail
		
		//Test Steps 
		System.out.println("Action -002");
		
	}
}
