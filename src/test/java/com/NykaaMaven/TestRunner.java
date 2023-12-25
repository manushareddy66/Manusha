package com.NykaaMaven;

import com.Nykaa.ConfigReader;
import com.Nykaa.Login_Page;

public class TestRunner {
	
	public static void a() {
		Login_Page lp = new Login_Page();
		ConfigReader cr = new ConfigReader();
		cr.getBrowserName();
			
	}
	
	public static void main(String[] args) {
		
		ConfigReader cr = new ConfigReader();
		a();
		System.out.println();
		System.out.println(cr.getBrowserName());
	}
	
		
		
	}


