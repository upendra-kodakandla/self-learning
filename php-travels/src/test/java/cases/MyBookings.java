package cases;

import org.openqa.selenium.WebDriver;
import org.selflearning.base.Testbase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.*;

public class MyBookings extends Testbase {
    @Test
    public void bookingHistory(){
        WebDriver driver = getDriver();
        LoginPage loginPage= new LoginPage(driver);
        FlightsPage flightsPage = new FlightsPage(driver);
        HomePage homePage = new HomePage(driver);
        FlightsListPage flightsListPage = new FlightsListPage(driver);
        PersonalInformationPage personalInformationPage =new PersonalInformationPage(driver);
        MyBookingsPage myBookingsPage = new MyBookingsPage(driver);
        loginPage.loginToPhpApp();
        homePage.clickFlights();
        flightsPage.selectFromCity();
        flightsPage.selectToCity();
        flightsPage.clickSearch();
        flightsListPage.selectFlight();
        personalInformationPage.enterFirstName("Hello");
        personalInformationPage.enterLastName("Everyone");
        personalInformationPage.enterPassportOrIDNumber();
        personalInformationPage.selectAgree();
        personalInformationPage.clickConfirmBooking();
        homePage.navigateTODashboard();
        homePage.clickMyBookings();
        boolean isAvailable = myBookingsPage.isBookingSuccessfull("Hello Everyone");
        Assert.assertTrue(isAvailable);


    }
}
