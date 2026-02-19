package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testdata/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		//		String data = wb.getSheet("multipleData").getRow(0).getCell(1).getStringCellValue();
		//		System.out.println(data);

		for(int i=1; i<=10; i++) {
			String data = wb.getSheet("multipleData").getRow(i).getCell(1).getStringCellValue();
			System.out.println(data);

		}
		System.out.println("---------");
		for(int i=1; i<=4; i++) {
			String data = wb.getSheet("multipleData").getRow(0).getCell(i).getStringCellValue();

			System.out.print(data+" ");
		}

	}

}

