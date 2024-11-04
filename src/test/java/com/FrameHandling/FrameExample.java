package com.FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		
		WebDriver w = new ChromeDriver();
		w.get("https://docs.oracle.com/javase/8/docs/api/");
		w.switchTo().frame(w.findElement(By.name("packageListFrame")));
		  w.findElement(By.linkText("java.awt.color")).click();
		  w.switchTo().parentFrame();
		  w.switchTo().frame("packageFrame");
		  w.findElement(By.linkText("ICC_Profile")).click();
		  w.switchTo().parentFrame();
		  w.switchTo().frame("classFrame");
		  w.findElement(By.linkText("ICC_ColorSpace")).click();
		
	}
	
}
