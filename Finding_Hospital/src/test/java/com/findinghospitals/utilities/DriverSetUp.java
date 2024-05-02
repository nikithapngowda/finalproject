package com.findinghospitals.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSetUp {
	public static WebDriver driver;
	public static String url = "https://www.practo.com/";
	

	public static WebDriver driverInstantiate() {
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebDriverWait wait1 = new WebDriverWait(driver,  Duration.ofSeconds(60));
		wait1.until(ExpectedConditions.titleIs("Practo | Video Consultation with Doctors, Book Doctor Appointments, Order Medicine, Diagnostic Tests"));
	    wait1.until(ExpectedConditions.urlToBe("https://www.practo.com/"));
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

	public static void driverTearDown() {
		
		driver.quit();
	}


}
