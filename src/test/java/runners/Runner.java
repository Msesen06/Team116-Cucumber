package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-reports5.html",
                 "json:target/json-reports/cucumber2.json",
                 "junit:target/xml-report/cucumber2.xml"
                  },
        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false

)
public class Runner {


}

    /*
    Runner classı BOS bir class'tır
    Runner classı sahip oldugu iki notasyon sayesinde
    @Runwith
    dryRun =true yaptıgımızda var olan adımları calıstırmadan eksik olan adımları calıstırır ve
    methodları bize verir

     features = "src/test/resources",
        glue = "stepdefinitions",

        bu iki klasor birbiriyle ilisiklendirildigi icin
        bunların altındaki tum class ve dosyalar ilisiklidir.


    */
