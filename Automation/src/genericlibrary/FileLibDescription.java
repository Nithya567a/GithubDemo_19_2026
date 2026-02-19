package genericlibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * It is a generic class containing generic methods to read data from property file
 * and excel file and write data into excel file
 */
public class FileLibDescription {
	/**
	 * It is a generic method to read data from property file based on mentioned key
	 * @param key
	 * @return The value present in the property file associated with the key 
	 * @throws IOException
	 */
	public String readPropertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata./commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
	}
	/**
	 * It is a generic method to read data from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return It will return String Value from mentioned sheetName, rowIndex, cellIndex
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readExcelData(String sheetName,int rowIndex ,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis1 = new FileInputStream("./testdata./testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String data = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return data;
		}
	/**
	 * It is a generic method to write String data into excel file based on mentioned parameters
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @throws IOException 
	 * @throws IoException
	 * @throws EncryptedDocumentException @throws IoExcception
	 */
	
	public void writeDataIntoExcel(String sheetname,int rowIndex,int cellIndex,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis2 = new FileInputStream("./testdata/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);
		wb.getSheet(sheetname).getRow(rowIndex).getCell(cellIndex).setCellValue(value);
		FileOutputStream fos = new FileOutputStream("/.testdata.testscript.xlsx");
		wb.write(fos);
		wb.close();
				
		
	}
	

}
