package com.ShadowRoot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unreal {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.unrealengine.com/en-US");
		w.findElement(By.linkText("See all features")).click();
		TimeUnit.SECONDS.sleep(5);
	SearchContext root =	w.findElement(By.xpath("/html/body/div/div[2]/form/div/div/div")).getShadowRoot();
//	System.out.println(root);
//	w.switchTo().frame("cf-chl-widget-kmzje");
//	SearchContext root1 = 	w.findElement(By.xpath("/html/body")).getShadowRoot();
//	w.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
	
	

	}

}
