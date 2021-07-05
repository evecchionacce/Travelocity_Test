package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignInPage extends PageObject {

    public static final Target INPUT_EMAIL = Target.the("Input Email").located(By.id("signin-loginid"));
    public static final Target INPUT_PASSWORD = Target.the("Input password").located(By.id("signin-password"));
    public static final Target BUTTON_CONFIRM_SIGN_IN = Target.the("Button confirm sing in").located(By.id("submitButton"));


}
