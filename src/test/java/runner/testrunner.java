package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/features"
        ,glue= {"seleniumgluecode"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucmber-report.html/",
                "json:target/cucumber-reports/cucumber-report.json/","junit:target/cucumber-reports/junit-report.xml","testng:target/cucumber-reports/testng-output.xml"},
        monochrome = true

)

public class testrunner {
    @AfterClass
    public static void writeExtentReport() {
        //Reporter.loadXMLConfig(new File("config/report.xml"));

    }

}