package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/paralel-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-reports/cucumber2.xml"
        },
        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@maamut",
        dryRun = false
)


public class ParalelRunner2 {




}
