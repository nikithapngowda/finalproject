package stepDefinition;

import com.findinghospital.pageObjects.Homepage;

import factory.BaseClass;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class TC5 {
	Homepage home;
	@When("The user scroll down to the social menu")
	public void the_user_scroll_down_to_the_social_menu() {
		BaseClass.getLogger().info("Scroll Down to the Social media menu");
		home = new Homepage (BaseClass.getDriver());
		home.scrollToBottom();
	}

	@Then("User check whether Instagram is present in the list of social media platforms")
	public void user_check_whether_instagram_is_present_in_the_list_of_social_media_platforms() {
		BaseClass.getLogger().info("Validating the Instagram is present or not");
		home = new Homepage (BaseClass.getDriver());
		home.checkInstagram();
	}

}
