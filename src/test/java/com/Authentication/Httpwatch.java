package com.Authentication;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Httpwatch {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		TakesScreenshot tss = (TakesScreenshot) w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("./src/src.png"));

	}

}
