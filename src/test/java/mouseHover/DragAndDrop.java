package mouseHover;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver w = new FirefoxDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://jqueryui.com/droppable/");
		w.switchTo().frame(w.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe")));
		Actions act = new Actions(w);
		WebElement drag = w.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = w.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop).perform();
	}

}
