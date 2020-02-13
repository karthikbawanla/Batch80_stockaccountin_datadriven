package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis =new FileInputStream("C:\\Users\\karthikb\\Desktop\\karthik_1\\Stockaccounting Datadriven framework\\TestInput\\supplier.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Supplier");
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		int colcount=sheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();
				System.out.println(" " +value);
				
			}
			System.out.println();
		}
			
		
		
		
	}

}
