package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Feature/",
        glue = "stepsDefinitions",
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        tags = "@RegresionTest"
)

public class testRunner {
}
