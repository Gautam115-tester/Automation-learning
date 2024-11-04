package keywordDrivenframework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RepositoryFrontAccounting {
	WebDriver w;
	public RepositoryFrontAccounting(WebDriver wd) {
		w = wd;
		PageFactory.initElements(w, this);
	}
	@FindBy(name = "user_name_entry_field") WebElement username; 
	@FindBy(name = "password") WebElement password;
	@FindBy(name = "SubmitUser") WebElement loginbtn;
	@FindBy(linkText = "Sales Quotation Entry") WebElement salesquotationentry;
	@FindBy(xpath = "/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[3]/a[5]") WebElement logout;
	
	public void launch() {
		w.get("https://demo.frontaccounting.eu/index.php");
	}
	public void login(String uname,String pass) {
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pass);
		loginbtn.click();
	}
	public void salesQuotationLinkClick() {
		salesquotationentry.click();
	}	
	public void Logout() {
		logout.click();
	}
}