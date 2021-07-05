package stepsDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.ChooseFly;
import task.ChooseStady;
import task.ChooseOptionMenu;
import task.FillWrongChooseFly;
import userInterface.HomePage;
import utils.MessageSystem;
import utils.Words;

public class VuelosSteps {

    @Managed(driver = "Chrome")
    WebDriver herBrowser;
    Actor user =Actor.named("user");

    @When("^user enter the data on fly$")
    public void user_enter_the_data_on_fly() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(ChooseOptionMenu.main("Flights"));
        user.attemptsTo(ChooseFly.user());
    }

    @Then("^user should the result fly$")
    public void user_should_the_result_fly() {
        user.attemptsTo(Ensure.that(HomePage.REFERENCE_2.resolveFor(user).getText()).isEqualToIgnoringCase(Words.REFERENCE_2));
    }

    @When("^user dont enter the destiny$")
    public void user_dont_enter_the_destiny() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(ChooseOptionMenu.main("Flights"));
        user.attemptsTo(FillWrongChooseFly.user(1));
    }

    @Then("^user shoud see a mesaage informaty$")
    public void user_shoud_see_a_mesaage_informaty() {
        user.attemptsTo(Ensure.that(HomePage.MESSAGE_ERROR.resolveFor(user).getText()).isEqualToIgnoringCase(MessageSystem.MESSAGE_ERROR));
    }

    @When("^user choose same destiny$")
    public void user_choose_same_destiny() {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(ChooseOptionMenu.main("Flights"));
        user.attemptsTo(FillWrongChooseFly.user(2));
    }


}
