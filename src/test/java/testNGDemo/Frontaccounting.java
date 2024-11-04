package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frontaccounting {

	WebDriver w;
	@Test
	public void launch() {
		
		WebDriverManager.firefoxdriver().setup();
		w=new FirefoxDriver();
		w.get("https://demo.frontaccounting.eu/");
	}
	@Test
	public void EnterLoginDetail() throws Exception {
		w.findElement(By.name("user_name_entry_field")).clear();
		Thread.sleep(2000);
		w.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
		w.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		w.findElement(By.name("password")).sendKeys("password");
		w.findElement(By.name("SubmitUser")).click();
		
	}

}
