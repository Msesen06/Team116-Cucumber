package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebdriveruniversityPage {
    public WebdriveruniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement loginPortalElementi;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement usernameKutusu;

    @FindBy(id="password")
    public  WebElement passwordKutusu;

    @FindBy(id="login-button")
    public WebElement loginOlButonu;

}
