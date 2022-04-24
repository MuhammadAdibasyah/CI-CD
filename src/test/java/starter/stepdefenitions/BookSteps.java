package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.book.Get;

public class BookSteps {
    @Steps
    Get get;

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints(){
        get.setGetApiEndpoints();

    }
    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){
        get.sendGetHttpRequest();

    }
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){
        get.receiveValidHttpResponseCode();

    }
    @And("I receive valid data for detail book")
    public void iReceiveValidDataForDetailBook() {
        get.receiveValidDataForDetailBook();
    }
}
