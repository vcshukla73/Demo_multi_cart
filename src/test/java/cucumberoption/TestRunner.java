package cucumberoption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature/Multicart.feature", glue="webtablestepsdefination")
public class TestRunner {

}
