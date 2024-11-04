package windowHandling;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowExample {

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver", "/home/lab-01-09/Downloads/chromedriver-linux64/chromedriver");
		ChromeOptions option = new ChromeOptions().setBinary("/usr/bin/brave-browser");
		WebDriver w = new ChromeDriver(option);
		
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		w.findElement(By.id("openwindow")).click();
		String parent_id = w.getWindowHandle();
		Set<String> child_id = w.getWindowHandles();
		for (String child : child_id) {
			if (!parent_id.equals(child)) {
				w.switchTo().window(child);
				Thread.sleep(2000);
				w.findElement(By.linkText("Blog")).click();
			} 
		}
		

	}

}
