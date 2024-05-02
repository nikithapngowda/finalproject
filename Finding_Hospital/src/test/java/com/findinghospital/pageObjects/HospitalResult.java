package com.findinghospital.pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.findinghospitals.utilities.ExcelUtils;

public class HospitalResult {

	WebDriver driver;
	
	//Constructor
	
	public HospitalResult(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Locators
	@FindBy(xpath="//*/div[@class='c-feedback']//span[@class='u-bold']")
	List<WebElement> ratingList;
	
	@FindBy(xpath="//a[@class='line-1']")
	List<WebElement> hospitalList;
	
	@FindBy(xpath="//span[@class='practo-logo']")
	WebElement logoElement;
	
	
	//Methods
	public void findHospitals() throws IOException {
		ExcelUtils ee=new ExcelUtils();
		List<String> lst1=new ArrayList<String>();
		List<String> lst2=new ArrayList<String>();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for(int i=0; i<30;i++) {
			jse.executeScript("window.scrollBy(0,250)");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i=0; i<=20;i++) {
		
			String rat = ratingList.get(i).getText();
			double rate = Double.parseDouble(rat);
			if(rate>3.5) {
				lst1.add(hospitalList.get(i).getText());
				lst2.add(rat);
				System.out.println(hospitalList.get(i).getText()+" - "+rat);
			}
		}
		logoElement.click();
		ee.writeExcel1(lst1,lst2);
		
	}
	
}
