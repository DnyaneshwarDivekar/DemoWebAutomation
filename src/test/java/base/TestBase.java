package base;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.WebDriverFactory;

public class TestBase {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver();
//        driver.get("https://dd-demo-tau.vercel.app/");
    }

//    @AfterClass
//    public void tearDown() {
//        WebDriverFactory.quitDriver();
//    }
    
   
}
