package com.AssignmentQA.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.AssignmentQA.FileLib.PropertyLib;
import com.AssignmentQA.webdriverUtils.Utils;

public class Base {
	public WebDriver driver;
	@BeforeClass
	public void setUp() {
		if(PropertyLib.BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(PropertyLib.BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(PropertyLib.IMPLICITWAIT, TimeUnit.SECONDS);
		driver.get(PropertyLib.URL);
		

	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws Throwable {
		if(result.getStatus()==ITestResult.FAILURE) {
			Utils.takeScreenshot(driver, result.getMethod().getMethodName());
		}
		
		driver.close();
	}

}
