package stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.WebDriver;
import task.SignInSuccessful;
import userInterface.HomePage;
import utils.Words;

public class SignInSteps {

    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user =Actor.named("user");

    @Given("^user open url$")
    public void user_open_url()  {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(Open.url(SystemEnvironmentVariables.createEnvironmentVariables().getProperty(Words.URL_HOME_PAGE)));
    }

    @When("^user enter your date$")
    public void user_enter_your_date() {
        user.attemptsTo(SignInSuccessful.user());
    }

    @Then("^user should sing in$")
    public void user_should_sing_in() {
        System.out.println("hice login");
    }

}
