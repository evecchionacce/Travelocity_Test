package task;

import interactions.Click;
import interactions.Type;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userInterface.HomePage;
import userInterface.SignInPage;

public class SignInSuccessful implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePage.BUTTON_SING_IN));
        actor.attemptsTo(Click.on(HomePage.BUTTON_SING_IN_TWO));
        actor.attemptsTo(Type.on(SignInPage.INPUT_EMAIL, "evecchionacce@gmail.com"));
        actor.attemptsTo(Type.on(SignInPage.INPUT_PASSWORD, "massimo2513"));
        actor.attemptsTo(Click.on(SignInPage.BUTTON_CONFIRM_SIGN_IN));

    }
    public static SignInSuccessful user(){
        return Tasks.instrumented(SignInSuccessful.class);
    }
}
