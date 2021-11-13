package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_Test_data {
	
	public static Object getdata(String dataNeeded) throws IOException {
		String path = new File("src/test/resources/testdata.properties").getAbsolutePath();//Path to the proper file
		FileInputStream fileStream = new FileInputStream(path);
		Properties prop = new Properties();//Create object ref for properties
		prop.load(fileStream);
		return prop.get(dataNeeded);
	}
	

}
