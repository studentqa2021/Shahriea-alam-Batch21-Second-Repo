package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;

public class BaseLogin {
	
	public void getLogin() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","/Users/shahrieaalam/Desktop/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get(BaseConfig.getConfig("URL"));	
		driver.manage().window().maximize();
		
		MasterPageFactory mfp=new MasterPageFactory(driver);
		mfp.getEmail().sendKeys(BaseConfig.getConfig("EMAIL"));
		mfp.getPassword().sendKeys(BaseConfig.getConfig("PASS"));
		mfp.getLogIn().click();
		
	}

}
