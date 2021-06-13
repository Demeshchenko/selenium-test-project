package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static saucedemo.util.WebDriverSingleton.getDriver;

public class ProductsPage {

    protected WebDriver driver = getDriver();

    private static final String LOGOUT_BUTTON_CSS = "#logout_sidebar_link";

    public Boolean isLogoutButtonProvided() {
        return driver.findElement(By.cssSelector(LOGOUT_BUTTON_CSS)).isDisplayed();
    }
}
