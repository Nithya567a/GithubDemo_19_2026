package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyfile {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("./testdata/commondata.properties");
		Properties p = new Properties();
		p.load(f);
		String url = p.getProperty("url");
		System.out.println(url);
		String un = p.getProperty("un");
		System.out.println(un);
		String password = p.getProperty("password");
		System.out.println(password);
		
	}
	

}
