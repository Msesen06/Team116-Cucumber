package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QdPage;
import utilities.ConfigReader;

public class QdStepDefinitions {
    QdPage qdPage=new QdPage();
    @Then("anasayfada login linkine click yapar")
    public void anasayfada_login_linkine_click_yapar() {
        qdPage.ilkLoginLinki.click();
    }
    @Then("email kutusuna {string} yazar")
    public void email_kutusuna_yazar(String email) {
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty(email));
    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String password) {
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
    }
    @When("loginOl butonuna basar")
    public void login_butonuna_basar() {
       qdPage.loginButonu.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(qdPage.basariliGirisKontrolElementi.isDisplayed());
    }

    @And("Kullanici cookie'i kabul eder")
    public void kullaniciCookieIKabulEder() {
        qdPage.qdCookie.click();
    }

    @Then("basarili olarak giris yapilamadigini test eder")
    public void basariliOlarakGirisYapilamadiginiTestEder() {
        Assert.assertTrue(qdPage.loginButonu.isDisplayed());
    }

    @And("email kutusuna listeden {string} yazar")
    public void emailKutusunaListedenYazar(String listedekiIsim) {
        qdPage.emailKutusu.sendKeys(listedekiIsim);
    }

    @And("password kutusuna listeden {string} yazar")
    public void passwordKutusunaListedenYazar(String listedekiPassword) {

        qdPage.passwordKutusu.sendKeys(listedekiPassword);
    }
}
