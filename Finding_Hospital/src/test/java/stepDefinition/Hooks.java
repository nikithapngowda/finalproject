package stepDefinition;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
public class Hooks {
	public static WebDriver driver;
	public static Properties p;
    
	@BeforeAll
   public static void setup() throws IOException
   {
   	driver=BaseClass.initilizeBrowser();
   	    	
   	p=BaseClass.getProperties();
   	driver.manage().window().maximize();
   	driver.get(p.getProperty("appURL"));
   
   			
	}
		
   
   @AfterAll
   public static void tearDown() {
       		
      //driver.quit();
	   
      driver.quit();
   }
   

   @AfterStep
   public void addScreenshot(Scenario scenario) {
       
   	// this is for cucumber junit report
       if(scenario.isFailed()) {
       	//Screenshot taken if the scenario is failed and stored as Bytes
       	TakesScreenshot ts=(TakesScreenshot) driver;
       	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
       	scenario.attach(screenshot, "image/png",scenario.getName());
       	            
       }
       else {
    	   TakesScreenshot ts=(TakesScreenshot) driver;
          	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
          	scenario.attach(screenshot, "image/png",scenario.getName());
       }
     
   }

}
