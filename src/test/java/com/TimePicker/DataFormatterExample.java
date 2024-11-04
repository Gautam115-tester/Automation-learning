package com.TimePicker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFormatterExample {
public static void main(String[] args) throws Exception {
	
	
	FileInputStream fis = new FileInputStream("C:\\Users\\user\\Downloads\\example.xlsx");
	XSSFWorkbook work = new XSSFWorkbook(fis);
	XSSFSheet sheet = work.getSheetAt(0);
	XSSFRow row = sheet.getRow(1);
	XSSFCell cell = row.getCell(0);
	
	System.out.println(cell.toString());
	
	DataFormatter data = new DataFormatter();
	
	String ex = data.formatCellValue(cell);
	
	System.out.println(ex);
	
	
	
	
	
	
	
}
}
