package task;

import interactions.Click;
import interactions.Type;
import interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userInterface.HomePage;

public class ChooseStady implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePage.BUTTON_GOING_TO_STAYS));
        actor.attemptsTo(Type.on(HomePage.INPUT_GOING_TO_STAYS, "punta cana"));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(HomePage.INPUT_GOING_TO_STAYS));
        actor.attemptsTo(Click.on(HomePage.BUTTON_SEARCH));
        actor.attemptsTo(WaitElement.visible(HomePage.LABEL_REFERENCE));

    }
    public static ChooseStady user(){
        return Tasks.instrumented(ChooseStady.class);
    }
}
