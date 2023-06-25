package com.TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTestLogin {
	
	@Test
	public void verify_loginFB() {
		
		//Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Identify
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.gettxt_Email().sendKeys("Test@gmail.com");
		login.getTxt_Password().sendKeys("12345678");
		login.getBtn_login().click();
		
		
		
		
	}

}
