package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_12 {
	
	
	@Test
	public void verifyLogin() {
		
		System.out.println("Username -valid");
		System.out.println("Password -valid");
		System.out.println("Login Click");
		
		
		String Expected="ABC";
		String actual="PQR"; //driver.gettitle();
		
		int countExpected=10;
		int countactual=9; //Action 
		
		boolean expected=true;
		boolean actualData=false;
		
		//Verify
		Assert.assertEquals(actual, Expected); // String
		
		Assert.assertEquals(countactual, countExpected); // int
		
		Assert.assertEquals(actualData, expected);// boolean 
		
	}

}
