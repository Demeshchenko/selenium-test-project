package saucedemo.step;

import io.cucumber.java.After;

import static saucedemo.util.WebDriverSingleton.getDriver;


public class Hook {

    @After
    public void closeBrowser() {
        getDriver().close();
    }
}
