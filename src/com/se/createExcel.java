package com.se;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createExcel {

	static String filePath="C:/Workplace/Mar17/Logic/TestData/test.xlsx";
	public static void main(String[] args) throws IOException {
		writeExcelFile();
		readExcelFile();
		
		
	}
	
	public static void writeExcelFile(){
		
		try {
			Workbook wb=new XSSFWorkbook();
			FileOutputStream fos=new FileOutputStream(filePath);
			System.out.println("File is created");
			XSSFSheet sh=(XSSFSheet) wb.createSheet("Employee Details");
			
			String safeName = WorkbookUtil.createSafeSheetName("[Expense Details*?]");
			org.apache.poi.ss.usermodel.Sheet sheet3 = wb.createSheet(safeName);
			
			
			Row row1=sh.createRow((short) 0);
			row1.createCell(0).setCellValue("Employee Code");
			row1.createCell(1).setCellValue("Emp Name");
			row1.createCell(2).setCellValue("Dept");
			row1.createCell(3).setCellValue("City");
			row1.createCell(4).setCellValue("DOB");
			
			Row row2=sh.createRow(1);
			row2.createCell(0).setCellValue("101");
			row2.createCell(1).setCellValue("Shivam");
			row2.createCell(2).setCellValue("OSS");
			row2.createCell(3).setCellValue("Denver");
			row2.createCell(4).setCellValue("15-01-1997");
			
			
			// write the output to the file
			wb.write(fos);
			wb.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void readExcelFile() throws IOException{
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			
			XSSFWorkbook rwb=new XSSFWorkbook(fis);
			Sheet rsh=rwb.getSheetAt(0);
			System.out.println("Row value:::"+rsh.getRow(1).getCell(1).getStringCellValue());
			
			Iterator<Row> rowIterator=rsh.iterator();
			while(rowIterator.hasNext()){
				Row row=rowIterator.next();
				
				System.out.print("Cell value is:");
				Iterator<Cell> cellIterator=row.cellIterator();
				while(cellIterator.hasNext())
				{
					Cell cell=cellIterator.next();
					System.out.print(cell.getStringCellValue());
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
			
}
