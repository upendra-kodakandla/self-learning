package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.selflearning.base.Pagebase;

public class PersonalInformationPage extends Pagebase{
    public PersonalInformationPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "first_name_1")
    WebElement text_firstName;
    @FindBy(how = How.NAME, using = "last_name_1")
    WebElement text_lasttName;

    @FindBy(how = How.NAME, using = "passport_1")
    WebElement text_passportOrIDNumber;

    @FindBy(how = How.XPATH, using = "//input[@id='agreechb']")
    WebElement checkbox_agree;

    @FindBy(how = How.XPATH, using = "//button[text()=' Booking Confirm']")
    WebElement button_bookingConfirm;

    public PersonalInformationPage enterFirstName(String firstname){
        text_firstName.sendKeys(firstname);
        return this;
    }

    public PersonalInformationPage enterLastName(String lastName){
        text_lasttName.sendKeys(lastName);
        return this;
    }

    public PersonalInformationPage enterPassportOrIDNumber(){
        text_passportOrIDNumber.sendKeys("123456");
        return this;
    }
    public PersonalInformationPage selectAgree(){
        try {
            scrollToElement(checkbox_agree);
            Thread.sleep(3000);
            checkbox_agree.click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return this;
    }
    public PersonalInformationPage clickConfirmBooking(){
        button_bookingConfirm.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

}
