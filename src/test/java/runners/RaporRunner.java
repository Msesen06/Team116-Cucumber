package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/parallel-reports3.html",
                "json:target/json-reports/cucumber3.json",
                "junit:target/xml-report/cucumber3.xml"
        },
        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false

)

public class RaporRunner {
}
