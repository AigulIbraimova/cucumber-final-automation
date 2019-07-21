package stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Log;

public class Test_steps {

    @When("user tests")
    public void user_tests() {
        System.out.println("Testing");
        Log.info("testing first step");

    }

    @Then("users verifies")
    public void users_verifies() {
        System.out.println("testing sec");
        Log.warn("warning on second step");
    }
}
