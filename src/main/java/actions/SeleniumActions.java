package actions;



import pages.HomePage;
import org.openqa.selenium.WebDriver;

public class SeleniumActions {

    private final HomePage homePage;

    public SeleniumActions(WebDriver driver) {
        this.homePage = new HomePage(driver);
    }

    public void navigateToLoginPage() {
        homePage.clickLoginLink();
    }

    // Add more actions related to the home page
}
