package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExersizePage {
    public AutomationExersizePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement ilksignupButonu;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement isimKutusu;

    @FindBy(xpath = "//input[@data-qa='signup-email']']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@data-qa='signup-button']']")
    public WebElement signupButonu;

    @FindBy(id="id_gender1")
    public WebElement cinsiyetButonu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement createButonu;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement actualWordElementi;

}
