package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.selflearning.base.Pagebase;

import java.util.List;


public class MyBookingsPage extends Pagebase {

    public MyBookingsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//table[@id='DataTables_Table_0']/tbody/tr/td/strong")
    List<WebElement> text_bookingNames;

    @FindBy(how = How.XPATH, using = "//table[@id='DataTables_Table_0']/tbody/tr/td/strong)[1]")
    WebElement text_latestBookingName;

    public boolean isBookingSuccessfull(String name) {
       boolean isBookingSuccesfull = false;
        for (WebElement bookingUserName : text_bookingNames) {
            System.out.println(bookingUserName.getText());
            if (bookingUserName.getText().equalsIgnoreCase(name)) {
                isBookingSuccesfull = true;
                break;
            }
        }
        return isBookingSuccesfull;
    }
}
