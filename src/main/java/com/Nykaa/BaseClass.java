package com.Nykaa;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static WebDriver xxx;

	//Browser Launch

	public static void 
(String browser) {

		if(browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Se_Demo\\Drivers\\chromedriver.exe");
			xxx = new ChromeDriver();

		}

		else if(browser.equals("Firefox")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Se_Demo\\Drivers\\chromedriver.exe");
			xxx = new FirefoxDriver();
		}

		//url launch

		public static void url_launch(String url) {

			xxx.get(url);
			xxx.manage().window().maximize();

		}

		//click Action
		public void elementclick(WebElement element) {
			element.click();
		}

		//Send Keys Action
		public void inputelement(WebElement element, String input) {
			element.sendKeys(input);
		}

		//Screen Shot
		public void screenshot(String filename) {
			TakesScreenshot ts = (TakesScreenshot)xxx;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("E:\\backup c\\eclipse\\eclipse-workspace\\Se_Demo\\Screenshots" +filename +".png");
			try {
				FileHandler.copy(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//Drop Down List
		public void dropdown_option(WebElement element, String option, String value) {
			Select s = new Select(element);
			if(option.equals("index")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			}

			else if(option.equals("text")){
				s.selectByVisibleText(value);
			}
			else if(option.equals("Value")){
				s.selectByValue(value);
			}
		}

		//Wait

		public WebElement wait(WebElement element, long waitTimeSeconds) {
			WebDriverWait wait = new WebDriverWait(xxx, waitTimeSeconds);
			WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
			return element1;
		}

		//MouseHover and Click

		public void mouseHoverAndClickOnElement(WebElement element) {
			Actions action = new Actions(xxx);
			action.moveToElement(element).click().build().perform();
		}


		//Simple Alert

		public void acceptAlert(WebDriver driver) {
			xxx.switchTo().alert().accept();
		}

		//get Window Handle

		public String getcurrentWindowID() {
			return xxx.getWindowHandle();
		}



	}

