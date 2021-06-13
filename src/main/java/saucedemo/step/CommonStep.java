package saucedemo.step;

import org.openqa.selenium.WebDriver;

import static saucedemo.util.WebDriverSingleton.getDriver;

public class CommonStep {

    private WebDriver driver = getDriver();

    public void openPage(String pageName) {
        driver.get(pageName);
    }

}
