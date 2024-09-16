package cases;

import org.openqa.selenium.WebDriver;
import org.selflearning.base.Testbase;
import org.testng.annotations.Test;
import pageobjects.*;

public class FlightBooking extends Testbase {
    @Test
    public void bookFlight(){
        WebDriver driver = getDriver();
        LoginPage loginPage= new LoginPage(driver);
        FlightsPage flightsPage = new FlightsPage(driver);
        HomePage homePage = new HomePage(driver);
        FlightsListPage flightsListPage = new FlightsListPage(driver);
        PersonalInformationPage personalInformationPage =new PersonalInformationPage(driver);
        navigateToURL();
        loginPage.loginToPhpApp();
        homePage.clickFlights();
        flightsPage.selectFromCity();
        flightsPage.selectToCity();
        flightsPage.clickSearch();
        flightsListPage.selectFlight();
        personalInformationPage.enterFirstName("My Name");
        personalInformationPage.enterLastName("Last Name");
        personalInformationPage.enterPassportOrIDNumber();
        personalInformationPage.selectAgree();
        personalInformationPage.clickConfirmBooking();
    }
}
