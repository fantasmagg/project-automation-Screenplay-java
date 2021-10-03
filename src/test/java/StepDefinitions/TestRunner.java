package StepDefinitions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
@CucumberOptions(
        features = "classpath:Features",
        glue =  "classpath:StepDefinitions",
        tags = "@tests"
)
public class TestRunner extends AbstractTestNGCucumberTests  {
}
