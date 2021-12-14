package org.fblogin;

import java.io.File;
import java.io.FileInputStream; 
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileUpdate {
	
	public static void main(String[] args) throws Throwable {
		
		File f = new File("D:\\FacebookLogin\\FileManager\\File.xlsx");
		
		 FileInputStream file = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(file);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		
		int cellType = cell.getCellType();
		
		if(cellType==0) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			long li=(long)numericCellValue;
			
			System.out.println(li);
			
			cell.setCellValue(87698798798l);
		}
		 
		FileOutputStream fileOutPutSteam = new	FileOutputStream(f);
		wb.write(fileOutPutSteam);
		
	
		
	}

}
