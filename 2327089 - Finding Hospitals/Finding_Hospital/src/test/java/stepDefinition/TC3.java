package stepDefinition;

import java.io.IOException;

import com.findinghospital.pageObjects.Homepage;
import com.findinghospital.pageObjects.SpecialitiesDetails;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3 {
	Homepage home;
	SpecialitiesDetails spec_det;
	
	@When("user will select View All Specialties")
	public void user_will_select_view_all_specialties() {
		BaseClass.getLogger().info("Clicking on the View All Specialites");
		home = new Homepage (BaseClass.getDriver());
		home.clickSpecialties();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user will capture the all specialties with price")
	public void user_will_capture_the_all_specialties_with_price(){
		BaseClass.getLogger().info("Capturing the all the specialities along with price ");
		spec_det = new SpecialitiesDetails (BaseClass.getDriver());
		try {
			spec_det.displaySpecialties();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
