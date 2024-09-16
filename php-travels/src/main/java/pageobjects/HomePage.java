package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.selflearning.base.Pagebase;

public class HomePage extends Pagebase{

    public HomePage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[@href='https://phptravels.net/flights']")
    WebElement button_flight;

    @FindBy(how = How.XPATH, using = "(//a[@href='https://phptravels.net/bookings'])[2]")
    WebElement button_myBookings;

    //div[@class= 'nav-item--right']/ul/li[3]

    @FindBy(how = How.XPATH, using = "//div[@class= 'nav-item--right']/ul/li[3]")
    WebElement button_account;

    public HomePage clickFlights() {
        button_flight.click();
        return this;
    }

    public HomePage clickMyBookings() {
        button_myBookings.click();
        return this;
    }

    public HomePage clickAccounts() {
        button_account.click();
        return this;
    }








}
