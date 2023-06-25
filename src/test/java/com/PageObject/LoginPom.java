package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	// WebElement --identify 
	
	@FindBy(how=How.XPATH,using="//input[@id='email']") private WebElement txt_Email;

	@FindBy(how=How.XPATH,using="//input[@name='pass']") private WebElement txt_Password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']") private WebElement btn_login;

	// create getter method 	
	
	public WebElement gettxt_Email() {
		return txt_Email;
	}

	public WebElement getTxt_Password() {
		return txt_Password;
	}
	
	public WebElement getBtn_login() {
		return btn_login;
	}

}
