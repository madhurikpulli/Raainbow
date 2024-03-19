package Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ExcelDataFetching {
public static void main(String[] args) throws Throwable {
	//WebDriver driver=new EdgeDriver();
	FileInputStream fise=new FileInputStream("C:\\for_selenium\\Advanced_Selenium\\Project_project\\src\\test\\resources\\TESTDATA1.xlsx");
	Workbook wb=WorkbookFactory.create(fise);
	String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
    boolean data1=wb.getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
	System.out.println(data1);
	double data2=wb.getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	System.out.println(data2);	
}
}
