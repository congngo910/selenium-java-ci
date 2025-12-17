package drivers;

import config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public WebDriver createDriver() {
        FirefoxOptions options = new FirefoxOptions();
        
        // Support headless mode from config
        if (ConfigReader.getBoolean("headless")) {
            options.addArguments("--headless");
        }
        
        return new FirefoxDriver(options);
    }
}
