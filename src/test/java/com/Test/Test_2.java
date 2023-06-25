package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {
	
	ChromeDriver driver;
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test(priority=1,invocationCount=3)
	public void verify_loginz() {
		
		System.out.println("Email");
		System.out.println("Password");
		System.out.println("Login");
	}
	
	@Test(priority=0)
	public void verify_logina() {
		
		System.out.println("Email");
		System.out.println("Password");
		System.out.println("Login");
	}
	@Test(priority=-1,enabled=false)
	public void verify_loginc() {
		
		System.out.println("Email");
		System.out.println("Password");
		System.out.println("Login");
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
