package com.Test;

import org.testng.annotations.Test;

public class Test_8 {
	
	
	@Test(groups= {"Sanity"})
	public void t1() {
		System.out.println("Test t1");
	}

	@Test(groups= {"CriticalRegression"})
	public void t2() {
		System.out.println("Test t2");
	}
}
