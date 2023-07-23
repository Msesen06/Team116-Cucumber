package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuruPage99 {
    public GuruPage99(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[text()='Add Customer'])[1]")
    public WebElement addCustomer;

    @FindBy(xpath = "//label[text()='Done']")
    public WebElement doneButonu;

    @FindBy(xpath = "//input[@id='fname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//textarea[@id='message']")
    public  WebElement addres;

    @FindBy(xpath = "//input[@id='telephoneno']")
    public WebElement telefon;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButonu;

    @FindBy(xpath = "//h1")
    public  WebElement girisYazisi;

    @FindBy(xpath = "//h3")
    public  WebElement customerId;

    @FindBy(xpath = "//iframe[@id='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']")
    public WebElement iframe;

    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement reklamKapat;





}
