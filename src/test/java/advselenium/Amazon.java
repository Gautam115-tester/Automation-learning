package advselenium;

import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws Exception {
	 WebDriverManager.firefoxdriver().setup();
	 WebDriver w = new FirefoxDriver();
	 w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fis = new FileInputStream("/home/lab-01-09/Workspace/Advance Demo/Selenium/src/test/java/advselenium/CreateAccount.xlsx");
//	 home to login page
	 Actions act = new Actions(w);
	 w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 w.get("https://www.amazon.in/");
	 
WebElement login =w.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span/span"));
WebElement login1 = w.findElement(By.linkText("Sign in"));

act.moveToElement(login).perform();

act.moveToElement(login1).click().perform();
//   login to create an account.

w.findElement(By.linkText("Create your Amazon account")).click();
// create an acccount by using data.
// 
XSSFWorkbook createaccount = new XSSFWorkbook(fis);
XSSFSheet sheet1 = createaccount.getSheet("createaccount");
for (int i = 1; i <= sheet1.getLastRowNum(); i++) {
	XSSFRow rs = sheet1.getRow(i);
	XSSFCell yourname = rs.getCell(0);
	XSSFCell mobile = rs.getCell(1);
	XSSFCell email = rs.getCell(2);
	XSSFCell password = rs.getCell(3);
	w.findElement(By.id("ap_customer_name")).clear();
	
	w.findElement(By.id("ap_customer_name")).sendKeys(yourname.toString());
	Thread.sleep(2000);
	w.findElement(By.id("ap_phone_number")).clear();
	
	
	w.findElement(By.id("ap_phone_number")).sendKeys(mobile.getRawValue());
	Thread.sleep(2000);
	w.findElement(By.id("ap_email")).clear();
	
	w.findElement(By.id("ap_email")).sendKeys(email.toString());
	Thread.sleep(2000);
	w.findElement(By.id("ap_password")).clear();
	
	w.findElement(By.id("ap_password")).sendKeys(password.toString());
	Thread.sleep(2000);
	w.findElement(By.id("continue")).click();

String acttitle =	w.getTitle();
String exptitle = "Authentication required";
	if (acttitle.equals(exptitle)) {
		Thread.sleep(2000);
		w.navigate().back();
	}	
}
w.findElement(By.linkText("Sign in")).click();

XSSFSheet sheet2 = createaccount.getSheet("Signin");
for (int i = 1; i <= sheet1.getLastRowNum(); i++) {
	XSSFRow rs = sheet2.getRow(i);
	XSSFCell sign_email = rs.getCell(0);
	XSSFCell sign_password = rs.getCell(1);
	w.findElement(By.id("ap_email")).sendKeys(sign_email.toString());
	w.findElement(By.id("continue")).click();
	w.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
	w.findElement(By.id("ap_password")).sendKeys(sign_password.toString());
	
	w.findElement(By.id("signInSubmit")).click();

		String acttitle =	w.getTitle();
		String exptitle = "Authentication required";
			if (acttitle.equals(exptitle)) {
				Thread.sleep(2000);
				w.navigate().back();
				Thread.sleep(2000);
				w.navigate().refresh();
				w.findElement(By.linkText("Change")).click();	
	}
	
}


w.close();



	}

}
