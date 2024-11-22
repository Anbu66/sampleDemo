package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSteps {

    WebDriver driver;

    @Given("the browser is launched")
    public void the_browser_is_launched() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
    //  WebDriver driver = new ChromeDriver();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    


    @When("I open the URL {string}")
    public void i_open_the_url(String url) {
        driver.get(url);
    }
    
    @When("search Automation")
    public void search_automation() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) throws InterruptedException {
        String actualTitle = driver.getTitle();
        if (!actualTitle.equals(expectedTitle)) {
            throw new AssertionError("Expected: " + expectedTitle + ", but got: " + actualTitle);
        }
        driver.quit();
    }
}
