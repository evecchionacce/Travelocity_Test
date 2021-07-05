package task;

import interactions.Click;
import interactions.Type;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userInterface.HomePage;

public class FillWrongChooseFly implements Task {

    private int error;
    public FillWrongChooseFly(int error){
        this.error = error;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (error == 1){
            actor.attemptsTo(Click.on(HomePage.BUTTON_lEAVING_FROM));
            actor.attemptsTo(Type.on(HomePage.INPUT_LEAVING_FROM, "Bogota"));
            BrowseTheWeb.as(actor).waitFor(2).seconds();
            actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(HomePage.INPUT_LEAVING_FROM));
            actor.attemptsTo(Click.on(HomePage.BUTTON_SEARCH_FLY));
        } if (error == 2) {
            actor.attemptsTo(Click.on(HomePage.BUTTON_lEAVING_FROM));
            actor.attemptsTo(Type.on(HomePage.INPUT_LEAVING_FROM, "Bogota"));
            BrowseTheWeb.as(actor).waitFor(2).seconds();
            actor.attemptsTo(Click.on(HomePage.OPTION_ONE_));
            actor.attemptsTo(Click.on(HomePage.BUTTON_GOING_TO));
            actor.attemptsTo(Type.on(HomePage.INPUT_GOING_TO, "Bogota"));
            actor.attemptsTo(Click.on(HomePage.OPTION_ONE));
            actor.attemptsTo(Click.on(HomePage.BUTTON_SEARCH_FLY));
        }

    }
    public static FillWrongChooseFly user(int error){
        return Tasks.instrumented(FillWrongChooseFly.class, error);
    }
}
