package com.findinghospital.pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.findinghospitals.utilities.ExcelUtils;

public class SpecialitiesDetails {
	
	WebDriver driver;
	
	
	public SpecialitiesDetails(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath="//div[@class='top-speciality-card']//h4")
	List<WebElement> specialties;
	
	@FindBy(xpath="//div[@class='top-speciality-card']//p")
	List<WebElement> price;
	
	@FindBy(xpath="//span[@class='practo-logo']")
	WebElement logoElement;

	
	//Methods
	
	public void displaySpecialties() throws IOException {
		List<String> lst1=new ArrayList<String>();
		List<String> lst2=new ArrayList<String>();
		ExcelUtils ee=new ExcelUtils();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		TreeMap<String, String> map = new TreeMap<String, String>();
		WebElement btnElement =  driver.findElement(By.xpath("//*[@id=\"TopSpecialityCardsContainer\"]//button[2]"));
		for(int i=0; i<specialties.size(); i++) {
			lst1.add(specialties.get(i).getText());
			lst2.add(price.get(i).getText());
			for(int j=0;j<lst1.size();j++) {
				if(lst1.equals("")) {
					lst1.remove(j);
					lst2.remove(j);
				}
			}
			while(btnElement.isDisplayed()) {
				jse.executeScript("arguments[0].click();", btnElement);
				}
		}
		
		for(int k=0; k<lst1.size();k++) {
			System.out.println("Name of Specialty: "+ lst1.get(k));
			System.out.println("Price of Specialty: "+ lst2.get(k));
			System.out.println("___________________________________");
		}
		ExcelUtils.writeExcel2(lst1,lst2);
		
		}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	
}
