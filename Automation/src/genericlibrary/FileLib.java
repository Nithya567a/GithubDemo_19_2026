package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.j2objc.annotations.Property;

public class FileLib {
	public String readPropertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata./commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
	}
	public String readExcelData(String sheetName,int rowIndex ,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis1 = new FileInputStream("./testdata./testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String data = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return data;
		}

}
