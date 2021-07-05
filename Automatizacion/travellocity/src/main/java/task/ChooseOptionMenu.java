package task;

import interactions.Loop;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userInterface.HomePage;

public class ChooseOptionMenu implements Task {

    private String options;
    public ChooseOptionMenu(String options){
        this.options = options;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Loop.elements(HomePage.OPTION_MENU, this.options));

    }
    public static ChooseOptionMenu main(String option){
        return Tasks.instrumented(ChooseOptionMenu.class, option);
    }
}
