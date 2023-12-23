package base;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.WebDriverFactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver();
    }

    @AfterClass
    public void tearDown() {
        WebDriverFactory.quitDriver();
    }
}
