package runners;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.Driver;


@CucumberOptions(
        features ={"src/test/java/features"},
        glue = {"stepdefinitions","utilities"},
        tags = "",
        plugin = {
                "summary","pretty","html:Reports/CucumberReport/Reports.html"
        }
)

public class Runner extends AbstractTestNGCucumberTests {
    static AppiumDriver driver = Driver.getDriver();

    {
    }
}
