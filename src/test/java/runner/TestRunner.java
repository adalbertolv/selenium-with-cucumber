package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"} , plugin = {"pretty", "json:target/cucumber.json","html:target/site/cucumber-pretty"},
        glue = "classpath:steps")
public class TestRunner extends AbstractTestNGCucumberTests{

}
