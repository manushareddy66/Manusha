package com.Nykaa;

public class ConfigReader {
	
	private String browser = PropertyReader.propfile().getProperty("browser");
	public String url = PropertyReader.propfile().getProperty("url");
	public String cardno = PropertyReader.propfile().getProperty("cardNo");
	public String cvv = PropertyReader.propfile().getProperty("cvv");
	public String getBrowserName() {
		
		return browser;
	}
	
		
	}
	



