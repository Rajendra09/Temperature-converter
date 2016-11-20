import cucumber.api.PendingException;
import cucumber.api.java.en.*;

/**
 * Created by rajen on 20/11/2016.
 */
public class StepDef {
    @Given("^I want to convert (\\d+)\\.(\\d+) Fahreneit to celsium$")
    public void i_want_to_convert_Fahreneit_to_celsium(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I input the value of Fahreneit as (\\d+)\\.(\\d+) in text field$")
    public void i_input_the_value_of_Fahreneit_as_in_text_field(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^It should be converted to Celsius as (\\d+) degree$")
    public void it_should_be_converted_to_Celsius_as_degree(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
