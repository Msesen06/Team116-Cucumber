package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExersizePage;
import utilities.Driver;

public class AutomationExersizeStepdefiinitions {
    AutomationExersizePage automationExersizePage=new AutomationExersizePage();
    Actions actions =new Actions(Driver.getDriver());
    Faker faker=new Faker();
    @Given("user sign linkine click yapar")
    public void user_sign_linkine_click_yapar() {
        automationExersizePage.ilksignupButonu.click();
    }
    @Given("user Create an account bolumune email adresi girer")
    public void user_create_an_account_bolumune_email_adresi_girer() {
       automationExersizePage.isimKutusu.sendKeys(faker.name().fullName());
       automationExersizePage.emailKutusu.sendKeys(faker.internet().emailAddress());
    }
    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        automationExersizePage.signupButonu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        actions.click(automationExersizePage.passwordKutusu).
                 sendKeys(faker.internet().password()).
                 sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                 sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                 sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                 sendKeys(faker.name().fullName()).
                 sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).
                 sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                 sendKeys(faker.address().fullAddress()).
                 sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                 sendKeys(faker.address().state()).sendKeys(Keys.TAB).
                 sendKeys(faker.address().city()).
                 sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB).
                 sendKeys(faker.phoneNumber().phoneNumber()).perform();



    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {
        automationExersizePage.createButonu.click();

    }
    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {
        String ecpectedword="CREATED";

        String testWord=automationExersizePage.actualWordElementi.getText();
        Assert.assertTrue(testWord.contains(ecpectedword));
    }
}
