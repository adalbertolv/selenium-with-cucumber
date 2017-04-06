package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"} , plugin = {"pretty", "json:target/cucumber.json","html:target/cucumber-html-report"},
        glue = "classpath:steps")
public class TestRunner {

}
