package utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/PC Solutions/Desktop/BDDTwitter/src/test/java/resources/reqres.feature",
        glue = {"StepDefs"},plugin ="json:target/cucumber.json" )

public class RunCukesTest {
}
