package com.TimePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		
	WebElement element =	w.findElement(By.id("mousehover"));
	int x = element.getLocation().getX();
	int y = element.getLocation().getY();
	
	System.out.println(x);
	System.out.println(y);
		
//		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) w;
//	      javascriptExecutor.executeScript("window.scrollBy("+x+","+y+")", "");
	
	
//	JavascriptExecutor js = (JavascriptExecutor) w;
//    js.executeScript("arguments[0].scrollIntoView(true);", element);
	
	

	}

}
