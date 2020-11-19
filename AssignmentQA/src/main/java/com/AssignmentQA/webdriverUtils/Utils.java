package com.AssignmentQA.webdriverUtils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utils {
	
	public static void takeScreenshot(WebDriver driver,String methodName) throws Throwable {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("./Screenshot/"+methodName+".PNG"));
		
	}
	
	public static String getAlertTest(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}
	
	public static void AlertOK(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

}
