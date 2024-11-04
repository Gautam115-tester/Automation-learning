package testNGDemo;

import static org.testng.Assert.*;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
 
	@Test
	public void DemoTest3() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver w = new FirefoxDriver();
		w.get("https://www.google.com/");
		w.findElement(By.name("q")).sendKeys("shoes",Keys.ENTER);
		
		Thread.sleep(5000);
		String exptitle = "shoes - Google Searchhh";
		String acttitle = w.getTitle();
		Assert.assertEquals(acttitle, exptitle,"Title is match");
		
		Thread.sleep(2000);
		w.close();
	}
	@Test
	public void DemoTest2() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver w = new FirefoxDriver();
		w.get("https://www.facebook.com/");
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		w.findElement(By.name("email")).sendKeys("hello everyone",Keys.ENTER);
		Thread.sleep(15000);
		
		SoftAssert soft = new SoftAssert();
		
//		Title
	    String	exptitle = "Log in to Facebook";
	    String acttitle = w.getTitle();
	    soft.assertEquals(acttitle, exptitle,"Title is mismatched");
//	    Url 
	    String acturl = w.getCurrentUrl();
	    String expurl = "https://www.facebook.com/";
	    soft.assertNotEquals(acturl, expurl,"Url is mismatched");
//	    text
	    String acttext = w.findElement(By.name("email")).getAttribute("value");
	    String exptext = "";
	    soft.assertEquals(acttext, exptext,"Text is mismatched");
//	    Border
	    String actborder = w.findElement(By.name("email")).getCssValue("border");
	    String expborder = "1px solid rgb(240, 40, 73)";
	    soft.assertEquals(actborder, expborder,"Border is mismatched");
//	    ErrorMessage
	    String acterrormessage = w.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText();
	    String experrormessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
	    soft.assertEquals(acterrormessage, experrormessage,"Error message is mismatched");
		
		Thread.sleep(2000);
		w.close();
		soft.assertAll();
		
		
	}

}
