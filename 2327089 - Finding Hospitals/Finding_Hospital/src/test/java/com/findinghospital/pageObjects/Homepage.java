package com.findinghospital.pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.findinghospitals.utilities.ExcelUtils;


public class Homepage {
	
	WebDriver driver;
	
	
	//Constructor
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Locators
	@FindBy(css="input[placeholder='Search location']")
	WebElement city_InputField;
	
	@FindBy(xpath="//div[normalize-space()='Bangalore']")
	WebElement city_option;
	
	@FindBy(css="input[placeholder='Search doctors, clinics, hospitals, etc.']")
	WebElement hosp_InputField;
	
	@FindBy(xpath="//div[normalize-space()='Hospital']")
	WebElement hosp_option;
	
	@FindBy(linkText="Book Diagnostic Tests")
	WebElement bookDiagnostic;
	
	@FindBy(xpath="//button[normalize-space()='View All Specialities']")
	WebElement clickSpecial;
	
	@FindBy(xpath = "//span[text()='Practo Drive']")
	WebElement practoDrive;
	
	@FindBy(xpath = "//span[text()='Social']")
	WebElement socialHeading;
	
	@FindBy(xpath="//div[@class='c-footer__column'][6]//a")
	List <WebElement> social;

	//Methods
	
	public void enterCity() {
		Actions act = new Actions(driver);
		city_InputField.clear();
		try {
			List<String> excelInputs = ExcelUtils.readExcel();
			city_InputField.sendKeys(excelInputs.get(0));
		} catch (IOException e) {
			e.printStackTrace();
		}
		act.moveToElement(city_option);
		act.click().perform();
	}
	
	public void enterHospital() {
		Actions act = new Actions(driver);
		hosp_InputField.clear();
		try {
			List<String> excelInputs = ExcelUtils.readExcel();
			hosp_InputField.sendKeys(excelInputs.get(1));
		} catch (IOException e) {
			e.printStackTrace();
		}
		act.moveToElement(hosp_option);
		act.click().perform();
	}
	
	public void clickDiagnostics() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		bookDiagnostic.click();
	}
	
	public void clickSpecialties() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,250)");
		clickSpecial.click();
	}
	
	public void scrollToBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	
	public void checkInstagram() {
		do {
		for(WebElement s : social) {
			if(s.getText().equalsIgnoreCase("Instagram")) {
				System.out.println("Instagram is present");
				break;
			}
		}
		System.out.println("Instagram is not present");
		} while(false);
	}
	
	public void clickPracto() {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		practoDrive.click();
	}
	
}
