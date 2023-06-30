package com.TestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTestLogin {
	
	@Test
	public void verify_loginFB() {
		
		//Browser Open
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
		
		
		
		
	}

}
