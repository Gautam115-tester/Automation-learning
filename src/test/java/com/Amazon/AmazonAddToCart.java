package com.Amazon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddToCart {

	public static void main(String[] args) {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.amazon.in/");
		w.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes",Keys.ENTER);
		w.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[2]/div[2]/h2/a/span")).click();
	String main =	w.getWindowHandle();
	Set<String> multiwindow = w.getWindowHandles();
	for (String window : multiwindow) {
		if (!window.equals(main)) {
			w.findElement(By.id("add-to-cart-button")).click();
			
		}
	}

	}

}
