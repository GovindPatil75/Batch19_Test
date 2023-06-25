package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_15 {
	
	@Test
	public void verify_loginFB() {
		
		//Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Identify Element -XPath
		
		WebElement txt_Email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_Email.sendKeys("Test@gmail.com");
		
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_password.sendKeys("12345678");
		
		WebElement btnlogin=driver.findElement(By.xpath("//button[@name='login']"));
		btnlogin.click();
		
		//Verify --> Invalid user name and Invalid password 
		
		String Expected="Log in to Facebook";
		
		String Actual=driver.getTitle();
		
		System.out.println(driver.getTitle());
		//Verify
		Assert.assertEquals(Actual, Expected);
		
		
	}

}
