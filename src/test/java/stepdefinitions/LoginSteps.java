package stepdefinitions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;

    @Before
    public void setUp() {
        initializeDriver();
    }

    @After
    public void tearDownScenario() {
        tearDown();
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("I enter valid username {string} and password {string}")
    public void iEnterValidUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Then("I should see the welcome message {string}")
    public void iShouldSeeTheWelcomeMessage(String expectedMessage) {
        homePage = new HomePage(driver);
        String actualMessage = homePage.getWelcomeMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
