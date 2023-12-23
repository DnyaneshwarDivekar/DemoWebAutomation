package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "login-link")
    private WebElement loginLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginLink() {
        loginLink.click();
    }

    // Add more methods for interacting with elements on the home page
}
