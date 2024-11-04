package advselenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenFrameWork {

	public static void main(String[] args) throws Exception {

		WebDriverManager.firefoxdriver().setup();
		WebDriver w = new FirefoxDriver();

		FileInputStream fis = new FileInputStream("/home/lab-01-09/Workspace/Advance Demo/Selenium/src/test/java/advselenium/ddf.xlsx");
		XSSFWorkbook Untitled = new XSSFWorkbook(fis);
		FileOutputStream fos = new FileOutputStream("/home/lab-01-09/Workspace/Advance Demo/Selenium/src/test/java/advselenium/ddf.xlsx");
		XSSFSheet sheet1 = Untitled.getSheet("Sheet1");
		for (int i = 1; i <= sheet1.getLastRowNum(); i++) {
			XSSFRow rs = sheet1.getRow(i);
			XSSFCell username = rs.getCell(0);
			XSSFCell actual = rs.getCell(3);
			XSSFCell password = rs.getCell(1);
			w.get("https://demo.frontaccounting.eu/");
			w.findElement(By.name("user_name_entry_field")).clear();
			Thread.sleep(2000);
			w.findElement(By.name("user_name_entry_field")).sendKeys(username.toString());
			Thread.sleep(2000);
			w.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			w.findElement(By.name("password")).sendKeys(password.toString());
			Thread.sleep(2000);
			w.findElement(By.name("SubmitUser")).click();
		Cell cs =	rs.createCell(3);
			fis.close();
			try {
				w.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[3]/a[5]")).click();
				String pass = "Test pass";	
				cs.setCellValue(pass);
				System.out.println(pass);
			} 
			catch (Exception e) {
				w.navigate().back();
				String fail = "Test fail";
				cs.setCellValue(fail);
				System.out.println(fail);
			}

		}

		Untitled.write(fos);

		fos.close();

		w.close();
	}
}
