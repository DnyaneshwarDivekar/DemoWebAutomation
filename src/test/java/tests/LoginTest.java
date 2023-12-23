package tests;



import pages.HomePage;
import pages.LoginPage;
import base.TestBase;
import utils.WebDriverFactory;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void testLogin() {
        // Open the home page
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginLink();

        // Perform login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("yourUsername", "yourPassword");

        // Add assertions or verifications as needed
    }
}
