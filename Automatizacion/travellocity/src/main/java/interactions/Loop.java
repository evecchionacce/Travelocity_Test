package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import java.util.List;

public class Loop implements Interaction {

    private Target list;
    private String option;

    public Loop(Target list, String option) {
        this.list = list;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> optionsFromList = this.list.resolveAllFor(actor);
        for (WebElementFacade optionList : optionsFromList) {
            if(optionList.getText().equalsIgnoreCase(this.option)){
                actor.attemptsTo(Click.on(optionList));
                break;
            }
        }
    }

    public static Loop elements(Target List, String option) {
        return new Loop(List, option);
    }
}