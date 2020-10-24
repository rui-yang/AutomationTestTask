package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "stepDefinitions",
        plugin= {
                "pretty",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "summary"
        }
)
public class TestRunner {
}
