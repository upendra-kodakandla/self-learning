package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.selflearning.base.Pagebase;

public class FlightsListPage extends Pagebase {

    public FlightsListPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "(//button[text()='Select Flight'])[1]")
    WebElement button_selectFlight;

    public FlightsListPage selectFlight(){
        button_selectFlight.click();
        return this;
    }
}
