package com.Nykaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page implements Login_Page_1{

	public Login_Page() {
		
		PageFactory.initElements(xxx, this);
	}

	@FindBy(xpath=SignIn_btn_xpath)
	private WebElement SignIn_btn;
	
	
	public WebElement getSignIn_btn() {
		return SignIn_btn;
	}

	@FindBy(xpath = Button_xpath)
	private WebElement Button;
	
	public WebElement getButton() {
		return Button;
	}
	
	@FindBy(id=Proceed_id)
	private WebElement Proceed;
	
	public WebElement getProceed() {
		return Proceed;
	}

	@FindBy(xpath = submit_xpath)
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
}
