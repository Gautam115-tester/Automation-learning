package keywordDrivenframework;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FrontAccountingKDF {
	public static void main(String[] args) throws Exception {
		WebDriver w = new FirefoxDriver();
		FileInputStream fis = new FileInputStream("/home/lab-01-09/Workspace/Advance Demo/Selenium/src/test/java/keywordDrivenframework/Untitled 1.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for(int i = 1; i <= sheet.getLastRowNum();i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell Teststep = row.getCell(0);
			RepositoryFrontAccounting f = new RepositoryFrontAccounting(w);
			switch (Teststep.toString()) {
			case "launch":
				f.launch();
				break;
            case "login":
				f.login("demouser", "password");
				break;
            case "sales":
            	f.salesQuotationLinkClick();
	            break;
             case "logout":
            	 f.Logout();
	            break;
			default:
				System.out.println("some error is occured during execution");
				break;
			}	
		}
	}
}