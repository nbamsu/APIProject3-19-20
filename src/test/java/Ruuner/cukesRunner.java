package Ruuner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target\\cucumber-html-report","json:target\\cucumber.json","junit:target\\cucumber.xml"},
        features = "src\\test\\resources",//src\test\resources\singleResource.feature
        //src\test\resources\SingleResource\singleResource.feature
        glue = "StepDefinition",
        dryRun = true,
        monochrome = true



)
public class cukesRunner {
//src\test\resources\com.cucumber.features\RunnerTest.feature

}
