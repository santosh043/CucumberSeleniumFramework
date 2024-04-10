package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features"
		,glue={"stepDefinitions"},
		plugin = { "pretty" },
		monochrome = true
		)

public class TestRunner {

}