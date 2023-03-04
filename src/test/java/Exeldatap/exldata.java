package Exeldatap;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exldata {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	public exldata(String path,String sheetname) throws IOException {
		workbook=new XSSFWorkbook(path);
		sheet=workbook.getSheet(sheetname);
	}
	
	public int getrownm() throws IOException {
		
		int rownum=sheet.getPhysicalNumberOfRows();
		return rownum;
	}
	
	public int getcolnm() throws IOException{
	int colnum=	sheet.getRow(0).getPhysicalNumberOfCells();
	return colnum;
	}
	
	public String getcellstdata(int ronm,int clnm)  throws IOException{
		DataFormatter formater=new DataFormatter();
		String value=formater.formatCellValue(sheet.getRow(ronm).getCell(clnm));
		
		return value;
	}

}
