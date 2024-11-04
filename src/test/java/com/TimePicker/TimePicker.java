package com.TimePicker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TimePicker {
	public static void main(String[] args) throws Exception {
		WebDriver  w = new ChromeDriver();
		w.get("https://jqueryui.com/datepicker/");
		w.navigate().refresh();
		Thread.sleep(2000);
		w.switchTo().frame(w.findElement(By.cssSelector("iframe[src=\"/resources/demos/datepicker/default.html\"]")));
		w.findElement(By.id("datepicker")).click();
	while (true) {
		WebElement prev = w.findElement(By.cssSelector("a[data-handler=\"prev\"]"));
		prev.click();
	WebElement year =	w.findElement(By.className("ui-datepicker-year"));
	if (year.getText().equals("1993")) {
		WebElement month = w.findElement(By.className("ui-datepicker-month"));
		if (month.getText().equals("February")) {
			w.findElement(By.partialLinkText("23")).click();
			break;
		}
	}	
	}
	}
}