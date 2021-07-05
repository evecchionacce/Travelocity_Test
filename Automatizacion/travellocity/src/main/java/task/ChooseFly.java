package task;

import interactions.Click;
import interactions.Loop;
import interactions.Type;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userInterface.HomePage;

import java.text.BreakIterator;

public class ChooseFly implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePage.BUTTON_lEAVING_FROM));
        actor.attemptsTo(Type.on(HomePage.INPUT_LEAVING_FROM, "Bogota"));
        BrowseTheWeb.as(actor).waitFor(2).seconds();
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(HomePage.INPUT_LEAVING_FROM));
        actor.attemptsTo(Click.on(HomePage.BUTTON_GOING_TO));
        actor.attemptsTo(Type.on(HomePage.INPUT_GOING_TO, "Punta cana"));
        BrowseTheWeb.as(actor).waitFor(2).seconds();
        actor.attemptsTo(Click.on(HomePage.OPTION_ONE));
        actor.attemptsTo(Click.on(HomePage.BUTTON_SEARCH_FLY));

    }
    public static ChooseFly user(){
        return Tasks.instrumented(ChooseFly.class);
    }
}
