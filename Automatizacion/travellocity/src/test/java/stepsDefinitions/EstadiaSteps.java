package stepsDefinitions;

//package stepsDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

//import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.ChooseStady;
import task.ChooseOptionMenu;
import userInterface.HomePage;
import utils.Words;


public class EstadiaSteps {

    //@Managed(driver = "Chrome")
	@Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user =Actor.named("user");

    @When("^user enter the data on Stays$")
    public void user_enter_the_data_on_Stays() throws Throwable {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(ChooseOptionMenu.main("Stays"));
        user.attemptsTo(ChooseStady.user());
    }

    @Then("^user should the result$")
    public void user_should_the_result() throws Throwable {
        user.attemptsTo(Ensure.that(HomePage.LABEL_REFERENCE.resolveFor(user).getText()).isEqualToIgnoringCase(Words.REFERENCE));
    }


}
