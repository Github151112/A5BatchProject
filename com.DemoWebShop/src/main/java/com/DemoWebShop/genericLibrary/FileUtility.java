package com.DemoWebShop.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	/*
	 * this method is used to fetch the data from property file
	 * @parameter path
	 * @parameter key
	 */
	
	public String getDataFromProperty(String path,String key) throws IOException
	{
		FileInputStream f = new FileInputStream(path);
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(key);
	}

}
