package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.selflearning.base.Pagebase;

public class FlightsPage extends Pagebase {
    public FlightsPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//div[@id='onereturn']/div[1]//span[@id='select2--container']")
    WebElement drp_selectFromCity;

    @FindBy(how = How.XPATH, using = "//div[@id='onereturn']/div[2]//span[@id='select2--container']")
    WebElement drp_selectToCity;

    @FindBy(how = How.XPATH, using = "//button[@id='flights-search']")
    WebElement button_search;

    @FindBy(how = How.XPATH, using = "//input[@class='select2-search__field']")
    WebElement button_searchBox;

    @FindBy(how = How.XPATH, using = "//ul[@id='select2--results']/li/button")
    WebElement selectSuggestedOption;

    public FlightsPage selectFromCity() {
        drp_selectFromCity.click();
        button_searchBox.sendKeys("Hyd");
        selectSuggestedOption.click();
        return this;
    }

    public FlightsPage selectToCity() {
        drp_selectToCity.click();
        button_searchBox.sendKeys("DEL");
        selectSuggestedOption.click();
        return this;
    }

    public FlightsPage clickSearch() {
        button_search.click();
        return this;
    }

}
