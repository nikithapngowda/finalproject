package stepDefinition;

import java.io.IOException;

import com.findinghospital.pageObjects.DiagnosticTests;
import com.findinghospital.pageObjects.Homepage;
import com.findinghospital.pageObjects.HospitalResult;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1 {
	Homepage home;
	HospitalResult hosp_res;
	DiagnosticTests diag_test;

@Given("the user is on Practo Home Page")
public void the_user_is_on_practo_home_page() {
	BaseClass.getLogger().info("Navigating to Home Page ");
	home = new Homepage(BaseClass.getDriver());
}
@When("user will select City from the City Input Field")
public void user_will_select_city_from_the_city_input_field() {
	BaseClass.getLogger().info("Select the city from the location listbox in Search input field");
	home.enterCity();
}
@When("user will select Hospital Type from Type Input Field")
public void user_will_select_hospital_type_from_type_input_field() {
	BaseClass.getLogger().info("Select the Hospital type from the listbox in Search input field ");
	home.enterHospital();
}
@Then("user will capture the list of Hospital name from rating")
public void user_will_capture_the_list_of_hospital_name_from_rating() throws IOException {
	BaseClass.getLogger().info("Capturing the hospital names and rating more than 3.5");
	hosp_res = new HospitalResult(BaseClass.getDriver()) ;
	hosp_res.findHospitals();
}

}
