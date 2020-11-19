package com.AssignmentQA.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AssignmentQA.webdriverUtils.Utils;

public class AssignmentQAPage {
	WebDriver driver;
	public AssignmentQAPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="textField1")
	private WebElement textField1;
	
	@FindBy(id="textField2")
	private WebElement textField2;
	
	@FindBy(xpath = "//button[text()='Find']")
	private WebElement findBtn;
	public WebElement getTextField1() {
		return textField1;
	}

	public WebElement getTextField2() {
		return textField2;
	}

	public WebElement getFindBtn() {
		return findBtn;
	}
	
	public String getOccurance(String text1,String text2) {
		textField1.sendKeys(text1);
		textField2.sendKeys(text2);
		findBtn.click();
		String msg = Utils.getAlertTest(driver);
		Utils.AlertOK(driver);
		return msg;
	}

}
