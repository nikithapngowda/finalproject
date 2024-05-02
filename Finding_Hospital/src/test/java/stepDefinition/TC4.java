package stepDefinition;

import java.io.IOException;

import com.findinghospital.pageObjects.Homepage;
import com.findinghospital.pageObjects.PractoDrive;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4 {
	Homepage home;
	PractoDrive pdrive;
	@When("user will select practo drive")
	public void user_will_select_practo_drive() throws InterruptedException {
		BaseClass.getLogger().info("Scroll Down to bottom of the page and clicking on practo drive ");
		home = new Homepage (BaseClass.getDriver());
		home.clickPracto();
	}
	
	@Then("user will enter invalid details and capture the warning message")
	public void user_will_enter_invalid_details_and_capture_the_warning_message() throws IOException {
		BaseClass.getLogger().info("Entering invalid details and cpature warning messages ");
		pdrive = new PractoDrive (BaseClass.getDriver());
		pdrive.clickPractoDrive();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
