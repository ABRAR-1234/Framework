package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_automation {

	public static void main(String[] args) throws IOException {
		

		FileInputStream file = new FileInputStream("./src/com/excel/Excel_basic.xlsx");
		
		XSSFWorkbook wrkbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wrkbook.getSheet("Sheet1");
		
		Row row=sheet.getRow(2);
		
		Cell e = row.getCell(1);
		
		System.out.println(e.getStringCellValue());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
