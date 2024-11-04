package keywordDrivenframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RespWithPageFactoryKDF {
WebDriver w;
	RespWithPageFactoryKDF(WebDriver wd){
		w = wd;
//		this method will create web elements
		PageFactory.initElements(w, this);
	}
	
//	identify web element
	@FindBy(id = "user-name") WebElement username;
	@FindBy(id = "password") WebElement password;
	@FindBy(id = "login-button") WebElement loginbtn;
	
//	
	public void enterUsername(String uname) {
		username.sendKeys(uname);;
	}	
	public void enterPassword(String upass) {
		password.sendKeys(upass);;
	}
	public void enterLogin() {
		loginbtn.click();
	}
}