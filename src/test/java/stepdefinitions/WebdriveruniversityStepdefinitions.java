package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.WebdriveruniversityPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WebdriveruniversityStepdefinitions {
    Faker faker = new Faker();
    String ilkSayfaWHD=Driver.getDriver().getWindowHandle();
    String ikinciSayfaWHD="";
    WebdriveruniversityPage webdriveruniversityPage=new WebdriveruniversityPage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("Kullanici {string} sitesine gider")
    public void kullanici_sitesine_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Then("Login Portal a kadar iner")
    public void login_portal_a_kadar_iner() {
      actions.scrollToElement(webdriveruniversityPage.loginPortalElementi).perform();
    }
    @Then("Login Portal'a tiklar")
    public void login_portal_a_tiklar() {
       webdriveruniversityPage.loginPortalElementi.click();
    }
    @Then("Diger windowa gecer")
    public void diger_windowa_gecer() {

        for (String each:Driver.getDriver().getWindowHandles()
             ) {
            if (!each.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWHD);

    }
    @Then("username ve password kutularina deger yazdirir")
    public void username_ve_password_kutularina_deger_yazdirir() {
         webdriveruniversityPage.usernameKutusu.sendKeys(faker.name().username());
         webdriveruniversityPage.passwordKutusu.sendKeys(faker.internet().password());

    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        webdriveruniversityPage.loginOlButonu.click();
    }
    @Then("Popup'ta cikan yazinin -validation failed- oldugunu test edin")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_edin() {
       String expectedYazi="validation failed";
       String actualYazi=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedYazi,actualYazi);
    }
    @Then("Ok tusuna basar ve Popup'i kapatir")
    public void ok_tusuna_basar_ve_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        Driver.getDriver().switchTo().window(ilkSayfaWHD);
    }
    @When("ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
        Assert.assertEquals(ilkSayfaWHD,Driver.getDriver().getWindowHandle());
    }

    @And("tum sayfalari kapatir")
    public void tumSayfalariKapatir() {
        Driver.quitDriver();
    }
}
