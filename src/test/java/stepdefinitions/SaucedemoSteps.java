package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucedemoSteps {

    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", GetPropertyValues.getProperty("chromedriver"));
        driver=new ChromeDriver();
    }

    @When("I open Saucedemo HomePage")
    public void i_open_saucedemo_home_page() {
        driver.get(GetPropertyValues.getProperty("homepage"));
    }

    @Then("I Verify that the Logo present on page")
    public void i_verify_that_the_logo_present_on_page() {

        boolean status = driver.findElement(By.cssSelector("#root > div > div.login_logo")).isDisplayed();
        Assert.assertEquals(true, status);

    }

    @And("Close browser")
    public void close_browser() {
        driver.quit();
    }
}
