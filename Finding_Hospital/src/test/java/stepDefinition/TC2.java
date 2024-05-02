package stepDefinition;

import java.io.IOException;

import com.findinghospital.pageObjects.DiagnosticTests;
import com.findinghospital.pageObjects.Homepage;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2 {
	DiagnosticTests diag_test;
	Homepage home;
	@When("user will select Book Diagnostic Tests")
	public void user_will_select_book_diagnostic_tests() {
		BaseClass.getLogger().info("Click  On the Book Diagnostic Tests");
		home = new Homepage (BaseClass.getDriver());
		home.clickDiagnostics();
		 
	}

	@Then("user will capture the all top cities name")
	public void user_will_capture_the_all_top_cities_name() throws IOException {
		BaseClass.getLogger().info("Capturing all the top cities");
		diag_test = new DiagnosticTests(BaseClass.getDriver());
		diag_test.topCities();
	}

}
