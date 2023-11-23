package readandWriteExcel;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\XL Sheet data\\For Eclipse.xlsx"); 

		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet();
		
		
		XSSFRow row1=sheet.createRow(0);
				
		row1.createCell(0).setCellValue("kalai");
		row1.createCell(1).setCellValue("18");
		row1.createCell(2).setCellValue("Cricket");
				
		XSSFRow row2=sheet.createRow(1);
		
		row2.createCell(0).setCellValue("Lalith");
		row2.createCell(1).setCellValue("45");
		row2.createCell(2).setCellValue("Cricket");
		
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Writing is done!!!!");
		
	}


	}


