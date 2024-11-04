package com.ShadowRoot;

import java.time.Duration;

import org.apache.poi.sl.usermodel.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleShadowRootElement {

	public static void main(String[] args) {

		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		w.get("https://www.unrealengine.com/en-US");
		Actions act = new Actions(w);
		SearchContext root =	w.findElement(By.xpath("/html/body/unrealengine-navigation")).getShadowRoot();

		//  Related to download
		//SearchContext root2 =	root.findElement(By.cssSelector("epic-wf-cta-button[href=\"https://www.unrealengine.com/en-US/download\"]")).getShadowRoot();

		//     WebElement download = root2.findElement(By.cssSelector("a[href=\"https://www.unrealengine.com/en-US/download\"]"));

		//     act.moveToElement(download).click().perform();        


		//	Related to news
//		SearchContext root2 =	root.findElement(By.cssSelector("epic-wf-main-link[key=\"news-parent\"]")).getShadowRoot();

//		WebElement news =      root2.findElement(By.cssSelector("a[href=\"https://www.unrealengine.com/en-US/feed\"]"));

//		act.moveToElement(news).click().perform();
  
//		 related to overview
		
		SearchContext root2 = root.findElement(By.cssSelector("epic-wf-main-link[key=\"overview-parent\"]")).getShadowRoot();
		
		WebElement overview = root2.findElement(By.cssSelector("a[href=\"https://www.unrealengine.com/en-US/home\"]"));
		
		act.moveToElement(overview).perform();

		SearchContext root3 = root.findElement(By.cssSelector("epic-wf-main-link[key=\"overview-parent\"]")).getShadowRoot();
		
		root3.findElement(By.cssSelector("epic-wf-menu-item[label=\"Unreal Engine\"]")).getShadowRoot();
		
		WebElement 	unrealEngine = w.findElement(By.cssSelector("a[href=\"https://www.unrealengine.com/en-US/home\"]"));
		
		act.moveToElement(unrealEngine).click().perform();


	}

}
