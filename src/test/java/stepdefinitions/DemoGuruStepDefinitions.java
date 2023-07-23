package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GuruPage99;
import utilities.Driver;

public class DemoGuruStepDefinitions {
    Faker faker =new Faker();
    GuruPage99 guruPage99 =new GuruPage99();
    @Then("sayfanin Title inin Telecom icerdigini test eder")
    public void sayfanin_title_inin_telecom_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Telecom"));
    }
    @Then("add custumer sayfasina gider")
    public void add_custumer_sayfasina_gider() {
        guruPage99.addCustomer.click();
        Driver.getDriver().switchTo().frame(guruPage99.iframe);
        guruPage99.reklamKapat.click();
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("Formu doldurup musteri ekler")
    public void formu_doldurup_musteri_ekler() {
        guruPage99.doneButonu.click();
        guruPage99.firstName.sendKeys(faker.name().firstName());
        guruPage99.lastName.sendKeys(faker.name().lastName());
        guruPage99.email.sendKeys(faker.internet().emailAddress());
        guruPage99.addres.sendKeys("Ankara");
        guruPage99.telefon.sendKeys("545545455454545");
        guruPage99.submitButonu.click();

    }
    @Then("musteri eklendigini dogrular")
    public void musteri_eklendigini_dogrular() {

        Assert.assertTrue(guruPage99.girisYazisi.isDisplayed());
    }
    @Then("kullanicinin customer idsini yazdirir")
    public void kullanicinin_customer_idsini_yazdirir() {
        System.out.println("Customer Id :"+guruPage99.customerId.getText());
    }

}
