import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"org.testing.stepdefinitions"},
        monochrome = false,
        tags = "@ApiTest",
        plugin = {
                "pretty",
                "html:target/test-reports.html"
        }
)

public class CucumberRunner {

}
