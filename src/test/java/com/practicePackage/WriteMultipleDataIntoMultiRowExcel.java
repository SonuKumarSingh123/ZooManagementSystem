package com.practicePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteMultipleDataIntoMultiRowExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		WorkbookFactory.create(fis);
		

	}

}
