package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/shahrieaalam/Desktop/chromedriver");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
	}

}
