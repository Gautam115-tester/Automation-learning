package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FluentwaitExample {
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver w = new FirefoxDriver();
		
		w.get("https://github.com/signup");
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(w)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(5))
		        .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
		w.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("qst@gmail.com");
		WebElement rel = w.findElement(By.xpath("/html/body/div[1]/div[4]/div[4]/main/div[1]/text-suggester/div[1]/form/div[1]/div[2]/button"));
		Wait<WebDriver> wait = new WebDriverWait(w, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[4]/div[4]/main/div[1]/text-suggester/div[1]/form/div[1]/div[2]/button")));
		rel.click();
		
		
	}
}

