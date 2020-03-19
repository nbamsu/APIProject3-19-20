package Ruuner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target\\cucumber-html-report","json:target\\cucumber.json","junit:target\\cucumber.xml"},
        features = "src\\test\\resources",
        //C:\Users\Nurkulov\Downloads\Cucumber-Class\src\test\resources\IceHRM\DataTableMap.feature
        glue = "StepDefinitions",
        dryRun = false,
        monochrome = true,
        tags="@TC-15"


)
public class cukesRunner {
//src\test\resources\com.cucumber.features\RunnerTest.feature

}
