package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public  MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@name='email']")
	private WebElement email;

	
	@FindBy(xpath="//*[@name='pass']")
	private WebElement password;
	
	@FindBy(xpath="//*[@name='login' ]")
			private WebElement logIn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogIn() {
		return logIn;
	}
	
	
}
