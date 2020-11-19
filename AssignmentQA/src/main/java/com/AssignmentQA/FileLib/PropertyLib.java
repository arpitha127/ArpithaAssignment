package com.AssignmentQA.FileLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLib {
	public static String BROWSER;
	public static String URL;
	public static int IMPLICITWAIT;
	
	public static void readProperty() throws IOException {
		FileInputStream fis=new FileInputStream(new File(".\\PropertyFile\\TestData.properties"));
		Properties prop=new Properties();
		prop.load(fis);
		BROWSER=prop.getProperty("browser");
		URL=prop.getProperty("url");
		String str = prop.getProperty("implicitWait");
		IMPLICITWAIT=Integer.parseInt(str);
	}
	

	

}
