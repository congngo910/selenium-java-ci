package drivers;

import config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverManager extends DriverManager {
    @Override
    public WebDriver createDriver() {
        EdgeOptions options = new EdgeOptions();
        
        // Support headless mode from config
        if (ConfigReader.getBoolean("headless")) {
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
        }
        
        return new EdgeDriver(options);
    }
}
