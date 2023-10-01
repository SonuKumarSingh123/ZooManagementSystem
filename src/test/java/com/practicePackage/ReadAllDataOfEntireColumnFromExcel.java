package com.practicePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllDataOfEntireColumnFromExcel {

	public static void main(String[] args) throws Throwable {
	
		FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Add_Animal");
		int count = sh.getLastRowNum();
		
		for(int i=1;i<=count;i++) {
			
			String value = sh.getRow(i).getCell(0).getStringCellValue();
		
			System.out.println(value);
	
		}

		wb.close();
	}

}
