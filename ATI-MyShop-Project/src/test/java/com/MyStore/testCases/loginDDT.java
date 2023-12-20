package com.MyStore.testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginDDT {
	
	
	
	@DataProvider(name="DDT")
	public Object[][] getXLDATA() throws IOException
	{
		String filepath = System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		
		FileInputStream fis = new FileInputStream(filepath) ;
		XSSFWorkbook book =  new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<colCount;j++)
			{
				Cell cell = row.getCell(j);
				
				data[i-1][j] = cell.getStringCellValue();
				
			}
		}
		return data;
		
	}
	@Test(dataProvider = "DDT")
	public void LoginTest(String name, String pwd)
	{
		System.out.println("The userName is : "+name);
		System.out.println("The passWord is : "+pwd);
	}

}
