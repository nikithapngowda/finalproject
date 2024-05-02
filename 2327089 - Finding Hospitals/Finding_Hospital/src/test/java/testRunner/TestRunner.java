package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class)
@CucumberOptions(
					features= {".//FeaturesFiles/Feature1.feature",".//FeaturesFiles/Feature2.feature",".//FeaturesFiles/Feature3.feature",".//FeaturesFiles/Feature4.feature",".//FeaturesFiles/Feature5.feature"},
//							features = {"@target/rerun.txt"},			//rerun failure
					glue="stepDefinition",
					plugin= {"pretty", "html:reports/myreport.html", 
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output
					publish=true   // to publish report in cucumber server
					
					//tags="@Smoke"
					//smoke test
					//tags = "@regression"
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
