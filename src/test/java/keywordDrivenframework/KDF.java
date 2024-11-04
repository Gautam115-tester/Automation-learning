package keywordDrivenframework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KDF {

	public static void main(String[] args) {
		
		WebDriver w = new FirefoxDriver();
		
		RespKDF r = new RespKDF(w);
		RespWithPageFactoryKDF f = new RespWithPageFactoryKDF(w);
		
		w.get("https://www.saucedemo.com/v1/");
		
//		without page factory
//		r.enterUsername("standard_user");
//		r.enterPassword("secret_sauce");
//		r.enterLogin();
		
//      with page factory
		f.enterUsername("standard_user");
		f.enterPassword("secret_sauce");
		f.enterLogin();
		
	}

}
