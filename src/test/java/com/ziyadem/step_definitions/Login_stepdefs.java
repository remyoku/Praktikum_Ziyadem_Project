package com.ziyadem.step_definitions;

import com.ziyadem.utilities.ConfigurationReader;
import com.ziyadem.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepdefs {

    @Given("User is on the main login page")
    public void user_is_on_the_main_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters valid email and password and clicks the Login button")
    public void the_user_enters_valid_email_and_password_and_clicks_the_login_button() {

    }
    @Then("The user should see the main page")
    public void the_user_should_see_the_main_page() {

    }

}
