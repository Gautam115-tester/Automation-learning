package keywordDrivenframework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RespKDF {
	// by using without pageFactory.
	WebDriver w;
	RespKDF(WebDriver wd){
		w = wd;
	}	
	By username = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button"); 	
	public void enterUsername(String name) {
		w.findElement(username).sendKeys(name);;
	}	
	public void enterPassword(String pass) {
		w.findElement(password).sendKeys(pass);;
	}
	public void enterLogin() {
		w.findElement(login).click();
	}	
}