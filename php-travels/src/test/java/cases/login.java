package cases;

import org.openqa.selenium.WebDriver;
import org.selflearning.base.Testbase;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

public class login extends Testbase {

    @Test
    public void loginToApplication(){
        WebDriver driver = getDriver();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.loginToPhpApp();
    }

}
