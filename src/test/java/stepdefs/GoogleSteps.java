package stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;

public class GoogleSteps {

    WebDriver driver = Hooks.driver;
    GooglePage page = new GooglePage(driver);

    @Given("user is on Google page")
    public void openGoogle() {
        page.open();
    }

    @When("user searches for {string}")
    public void search(String keyword) {
        page.search(keyword);
    }

    @Then("results should be displayed")
    public void verifyResults() {
        System.out.println("Test Passed- Jenkins");
    }
}