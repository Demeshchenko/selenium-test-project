package saucedemo.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import saucedemo.stepdefenition.common.GetPropertyValues;

public class WebDriverSingleton {
    private static WebDriver driver;

    private WebDriverSingleton() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", GetPropertyValues.getProperty("chromedriver"));
            driver = new ChromeDriver();
        }
        return driver;
    }
}
