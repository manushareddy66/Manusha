package com.Nykaa;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

	static FileReader fr;
	
	public static Properties propfile() {
		File f = new File("E:\\backup c\\eclipse\\eclipse-workspace\\NykaaProject\\src\\main\\java\\nykaa.Properties");
		try {
			fr = new FileReader(f);
		}
		catch(Exception e) {
			e.printStackTrace();

		}

		Properties prop = new Properties();
		try {
			prop.load(fr);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return prop;
	}

}
