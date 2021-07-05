package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target BUTTON_SING_IN = Target.the("Button Sing In").located(By.id("gc-custom-header-nav-bar-acct-menu"));
    public static final Target BUTTON_SING_IN_TWO = Target.the("Button Sing In").located(By.className("uitk-button-primary"));
    public static final Target OPTION_MENU = Target.the("option Menu").located(By.className("uitk-tab-text"));
    public static final Target BUTTON_GOING_TO_STAYS = Target.the("Button going to stays").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div[1]/div/form/div[1]/div[1]/div/div/div/div/div/div/div[1]/button"));
    public static final Target INPUT_GOING_TO_STAYS = Target.the("Input going to stays").located(By.id("location-field-destination"));
    public static final Target BUTTON_SEARCH = Target.the("Button Search").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div[1]/div/form/div[2]/div[2]/button"));
    public static final Target LABEL_REFERENCE = Target.the("Label Reference").located(By.xpath("/html/body/div[2]/div[1]/div/div/main/div/div/div[1]/section/div[2]/div/div[1]/section/form/fieldset[1]/div/h3/legend"));
    public static final Target BUTTON_lEAVING_FROM = Target.the("Button leaving from").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div[2]/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/button"));
    public static final Target INPUT_LEAVING_FROM = Target.the("Input leaving from").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div[2]/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div/div[2]/div[1]/section/div/input"));
    public static final Target BUTTON_GOING_TO = Target.the("Button going to").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div[2]/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div/div/div[1]/button"));
    public static final Target INPUT_GOING_TO = Target.the("Input going to").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div[2]/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div/div/div[2]/div/section/div/input"));
    public static final Target BUTTON_SEARCH_FLY = Target.the("Sear fly").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/button"));
    public static final Target REFERENCE_2 = Target.the("Reference 2").located(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/div[1]/section/main/section/div/div/ul/li[1]/div"));
    public static final Target OPTION_ONE = Target.the("option One").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div[2]/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div/div/div[2]/ul/li[1]/button/div/div[1]"));
    public static final Target OPTION_ONE_ = Target.the("option one").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div[2]/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div/div[2]/ul/li[1]/button/div"));
    public static final Target MESSAGE_ERROR = Target.the("Message error").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/figure/div[3]/div/div/div/div[2]/div/form/div[2]/div/div[1]/div[2]/div[1]/div/h3"));
}
