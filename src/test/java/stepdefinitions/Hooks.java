package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    tum senaryolar icin calısacak
    @Before @After notasyonlarına sahip methodalri icerir
    Testng deki TestBase classlari gibidir
    Ancak TestNGde testbase classını istersek extend diyerek kullanabiliyorduk
    istemezsek kullanmıyorduk
    Cucumber yapısı geregi stepdefinitions package altındaki
    @Before @After
    her senaryo icin calısacak
     */

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
            Driver.closeDriver();
        }
    }
}
