package com.findinghospital.pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.findinghospitals.utilities.ExcelUtils;

public class DiagnosticTests {

	WebDriver driver;
	
	
	//Constructors
	public DiagnosticTests(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	
	@FindBy(xpath="//li[@class='u-text--center']/div[2]")
	List<WebElement>topCity;
	
	@FindBy(xpath="/html/body/div[3]/div")
	WebElement randClick;
	
	@FindBy(css="span[class='practo-logo'] a[class='nav-interact']")
	WebElement logo;
	
	
	//Methods
	
	public void topCities() throws IOException {
		ExcelUtils ee=new ExcelUtils();
		List<String> lStrings=new ArrayList<String>();
		System.out.println("\nNumber of top cities: " + topCity.size());
		for(WebElement city : topCity) {
			lStrings.add(city.getText());
			System.out.println(city.getText());
		}
		randClick.click();
		logo.click();
		ee.writeExcel1(lStrings);
	}
}
