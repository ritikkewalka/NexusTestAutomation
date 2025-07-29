package runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import base.BaseTest;

@CucumberOptions(
    features = "src/test/java/features",
    glue = "stepdefs",
    plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void setup() {
        BaseTest.setUp();
    }

    @AfterClass
    public void teardown() {
        BaseTest.tearDown();
    }
}
