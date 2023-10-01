package com.practicePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteSingleDataIntoExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Organisation");
		
		//Row r = sh.createRow(6);
		//Cell c = r.createCell(0);
		//c.setCellValue("Capg");
		
		sh.createRow(8).createCell(0).setCellValue("Wsp");
		
		FileOutputStream fos =new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		wb.write(fos);
		wb.close();
		
		

	}

}
