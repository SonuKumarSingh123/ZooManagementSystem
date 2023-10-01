package com.testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.ZMS.genericUtiliti.IPathConstants;

public class ReadDataPrividerFromExcelPracticeTest {

	@DataProvider
	public Object[][] storedata() throws Throwable {
		FileInputStream fis =new FileInputStream(IPathConstants.excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("DP");
		int r = sh.getLastRowNum()+1;
		int c =sh.getRow(0).getLastCellNum();
		Object[][] obj =new Object[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				obj[i][j] =sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return obj;
	}
}
