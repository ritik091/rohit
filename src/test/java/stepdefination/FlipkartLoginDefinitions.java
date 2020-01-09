package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FlipkartLoginDefinitions {


@Given("Flipcart is up and running and is launched")
public void flipcart_is_up_and_running_and_is_launched() {
	System.out.println("Flipcart is up");
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@Then("User clicks on Login link")
public void user_clicks_on_Login_link() {
	System.out.println("User clicks ");
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@Then("User provides valid crendentials")
public void user_provides_valid_crendentials() {
	System.out.println("valid crendentials");
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}

@Then("user clicks on OK button")
public void user_clicks_on_OK_button() {
	System.out.println("OK button");
    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
}




}
