package com.util;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
	
	public static void getColor (WebDriver driver, WebElement element) {
		
		Random r = new Random();
		int rand = r.nextInt(5)+1;
		System.out.println("Color Code Number: "+rand);
		if(rand == 1)
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid red'", element);
		else if(rand == 2)
			((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid green'", element);
		else if(rand == 3)
			((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid blue'", element);
		else if(rand == 4)
			((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid yellow'", element);
		else if(rand == 5)
			((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid purple'", element);
		else
			System.out.println("No color selected "+rand+ " Number genarated");
	}
}