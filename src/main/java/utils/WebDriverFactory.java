package utils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class WebDriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
        	
            driver = new EdgeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
