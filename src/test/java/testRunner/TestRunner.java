package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//Verzar-folder//Documents//selenium-test-project//Features//Saucedemo.feature",
        glue = "stepdefinitions")

public class TestRunner {
//run

}
