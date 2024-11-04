package com.log;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrontAccounting {

	public static void main(String[] args) {
		Logger log = LogManager.getLogger(FrontAccounting.class);
		WebDriverManager.firefoxdriver().setup();
		WebDriver w = new FirefoxDriver();
		log.info("browser has been open");
		
		w.get("https://demo.frontaccounting.eu/");
		log.info("Webapplication has been launch");
		
		w.findElement(By.name("user_name_entry_field")).clear();
		w.findElement(By.name("user_name_entry_field")).sendKeys("demo");
		w.findElement(By.name("password")).click();
		w.findElement(By.name("password")).sendKeys("password");
		w.findElement(By.name("SubmitUser")).click();
		log.info("user is trying to login");
		
		try {
			
			w.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[3]/a[5]")).click();
			log.info("user login and after that logout successfully");
			
		} catch (Exception e) {
			log.error("user unable to login");
		}
		
		
		w.close();
		log.info("Quitting browser");

	}

}
