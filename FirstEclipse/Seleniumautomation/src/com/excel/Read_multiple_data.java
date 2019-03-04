package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_multiple_data {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("./src/com/excel/Excel_basic1.xlsx");
		
		XSSFWorkbook Workbook = new XSSFWorkbook(file);
		
		XSSFSheet Sheet = Workbook.getSheet("Sheet1");
		
		int rownum = Sheet.getLastRowNum();
		
		System.out.println(rownum);
		
		for(int i = 0;i<=rownum;i++)
		{
			Row r = Sheet.getRow(i);
			
			int cellnum = r.getLastCellNum();
			
			for(int k=0;k<cellnum;k++)
			{
				String Data = r.getCell(k).getStringCellValue();

				System.out.print(Data);				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
		

	}

}
