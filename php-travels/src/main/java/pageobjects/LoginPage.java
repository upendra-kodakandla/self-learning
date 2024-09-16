package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.selflearning.base.Pagebase;

import org.openqa.selenium.WebElement;

import static java.sql.DriverManager.getDriver;

public class LoginPage extends Pagebase {

    public LoginPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.ID, using = "email")
    WebElement  text_email;

    @FindBy(how = How.ID, using = "password")
    WebElement  text_password;

    @FindBy(how = How.ID, using = "submitBTN")
    WebElement  button_login;

    public LoginPage enterEmail() {
        text_email.sendKeys("user@phptravels.com");
        return this;
    }
    public LoginPage enterPassword() {
        text_password.sendKeys("demouser");
        return this;
    }
    public LoginPage clickLogin() {
        button_login.click();
        return this;
    }

    public LoginPage loginToPhpApp() {
        enterEmail();
        enterPassword();
        clickLogin();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }


    }







