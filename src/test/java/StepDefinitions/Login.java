package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {


    @Given("login page is browsed")
    public void login_page_is_browsed() {

        System.out.println("step 1");

    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {

        System.out.println("step 2");

    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("step 3");

    }
    @Then("user is navigated to the homepage")
    public void user_is_navigated_to_the_homepage() {
        System.out.println("step 4");

    }


}
