package tests;


import pages.HomePage;
import base.BaseTest;
import utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void testHomePageLoginLink() {
        // Open the home page
        HomePage homePage = new HomePage(driver);

        // Click the login link
        homePage.clickLoginLink();

        // Verify that the login page is opened
        String expectedLoginUrl = "expected_login_url"; // Replace with the actual expected URL
        String actualLoginUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualLoginUrl, expectedLoginUrl, "Login link didn't navigate to the expected URL.");

        // You can add more assertions or verifications based on the home page functionality
    }
}

