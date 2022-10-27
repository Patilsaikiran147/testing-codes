package package1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ddtpgmwritedata 
{

	public static void main(String[] args) throws IOException
	{
		//WebDriver driver=new ChromeDriver();
		XSSFWorkbook wrkbk=new XSSFWorkbook();
		XSSFSheet sheet=wrkbk.createSheet();
		Object empdata[][]= {{"EmpId","Name","Sal"},{21394,"harish",15000},{21408,"Tulasi",90000},{21405,"phaniraj",10000}};
		int rows=empdata.length;
		int cols=empdata[0].length;
		System.out.println(rows);
		System.out.println(cols);
		for(int r=0;r<rows;r++)
		{
			XSSFRow row=sheet.createRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.createCell(c);
				Object value=empdata[r][c];
				if(value instanceof String)
				{
					cell.setCellValue((String)value);
				}
				if(value instanceof Integer)
				{
					cell.setCellValue((Integer)value);
				}
				if(value instanceof Boolean)
				{
					cell.setCellValue((Boolean)value);
				}
			}
		}
		String filepath=".\\datafiles\\employee.xlsx";
		FileOutputStream ops=new FileOutputStream(filepath);
		wrkbk.write(ops);
		ops.close();
		System.out.println("Employee data written successfully");

	}

}
