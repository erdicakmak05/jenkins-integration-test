package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = "src/test/resources/features",
                glue = "stepdefinitions",
                tags = "@smoke",
                plugin = {
                        "pretty",
                        "json:json-reports/cucumber.json",
                        "html:build/cucumber-report/cucumber.html",
                        "junit:build/cucumber-report/cucumber.xml"}
        )
        // plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
public class TestRunner {

}
