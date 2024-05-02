package com.findinghospitals.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.findinghospital.pageObjects.DiagnosticTests;
import com.findinghospital.pageObjects.Homepage;
import com.findinghospital.pageObjects.HospitalResult;
import com.findinghospital.pageObjects.PractoDrive;
import com.findinghospital.pageObjects.SpecialitiesDetails;
import com.findinghospitals.utilities.DriverSetUp;


public class test_case {
	WebDriver driver;
	DiagnosticTests diag_test;
	Homepage home;
	HospitalResult hosp_res;
	PractoDrive pdrive;
	SpecialitiesDetails spec_det;
	JavascriptExecutor js;
	FileInputStream file;
	XSSFWorkbook workbook;
	String datapath;
	
	
	@Test(priority=-1)
	void setUp() {
		driver = DriverSetUp.driverInstantiate();
		System.out.println("Browser opened..");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		diag_test = new DiagnosticTests(driver);
		home = new Homepage (driver);
		hosp_res = new HospitalResult(driver) ;
		pdrive = new PractoDrive (driver);
		spec_det = new SpecialitiesDetails (driver);
		js = (JavascriptExecutor)driver;
		
	}
  @Test(priority =0)
  public void clickCity() {
	  home.enterCity();
  }
  
  @Test(priority =1)
  public void enterHospital() {
	  home.enterHospital();
	  
	  
  }
  
  @Test(priority =2)
  public void list_Hospitals() throws IOException {
	  hosp_res.findHospitals();
	  
  }
  
  @Test(priority =3)
  public void bookDiagnostic() throws IOException {
	  home.clickDiagnostics();
	 diag_test.topCities();
  }
  
  @Test(priority =5)
  public void docSpecialities() throws IOException {
	  home.clickSpecialties();
	  spec_det.displaySpecialties();
	  spec_det.navigateBack();
  }
  
  @Test(priority =6)
  public void clickPractoDrive() throws IOException, InterruptedException {
	  home.clickPracto();
	  pdrive.clickPractoDrive();
  }
  
  @Test(priority =7)
  public void validateInstagram() {
	  home.scrollToBottom();
	  home.checkInstagram();
  }
  
  @Test(priority=8)
  public void tearDown() {
	  
		DriverSetUp.driverTearDown();
	
  }
}
