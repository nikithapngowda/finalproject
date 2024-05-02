package com.findinghospital.pageObjects;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.findinghospitals.utilities.ExcelUtils;

public class PractoDrive {

	WebDriver driver;
	
	
	public PractoDrive (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	
	
	@FindBy(css="input[id='loginPhone']")
	WebElement phoneNumber_InputField;
	
	@FindBy(css="input[id='loginName']")
	WebElement name_InputField;
	
	@FindBy(xpath="//button[normalize-space()='VIEW RECORDS']")
	WebElement submit_btn;
	
	@FindBy(xpath="//div[@id='mobileValidationError']")
	WebElement invalidNumber_msg;
	
	@FindBy(xpath="//div[normalize-space()='View records']")
	WebElement viewRecords;
	
	
	
	//Methods
	
	public void clickPractoDrive() throws IOException {
		
		//ExcelUtils ee=new ExcelUtils();
		String originalWindow = driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		
		for(String w : windows) {
		driver.switchTo().window(w);
		}
		
		viewRecords.click();
		
		Random random= new Random();
		long random_number = 100000000L + random.nextLong(900000000L);
		String random_number_str = Long.toString(random_number);
		phoneNumber_InputField.sendKeys(random_number_str);
		try {
			List<String> excelInputs = ExcelUtils.readExcel();
			name_InputField.sendKeys(excelInputs.get(2));
		} catch (IOException e) {
			e.printStackTrace();
		}
		submit_btn.click();
		String errorMessage= invalidNumber_msg.getText();
		System.out.println(errorMessage);
		ExcelUtils.writeExcel3(errorMessage);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		driver.switchTo().window(originalWindow);
	}
}
