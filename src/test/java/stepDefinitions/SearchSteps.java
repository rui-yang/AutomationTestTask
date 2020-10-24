package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePage;
import pages.WikiPage;

public class SearchSteps extends BaseSteps {
    private HomePage homePage;
    private WikiPage wikiPage;

    public SearchSteps() {
        super();
    }

    @Given("I am on Google Homepage")
    public void i_am_on_the_page() {
        driver.get("https://www.google.com");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q"))));
    }

    @When("I navigate to wikipedia page")
    public void i_navigate_to_wikipedia_page() {
        driver.get("https://www.wikipedia.com");
    }

    @Then("I should see the search box")
    public void i_should_see_the_search_box() {
        homePage = new HomePage(driver);
        wait.until(ExpectedConditions.visibilityOf(homePage.searchBox));
    }

    @When("I search {string}")
    public void i_search(String string) {
        homePage.inputBox.sendKeys(string);
    }

    @And("I select the suggested result")
    public void i_select_the_suggested_result() {
        wait.until(ExpectedConditions.visibilityOf(homePage.suggestionsDropDown));
        homePage.suggestionsDropDown.click();
    }

    @Then("I should see the coordinates of the location")
    public void i_should_see_the_coordinates_of_the_location() {
        wikiPage = new WikiPage(driver);
        wait.until(ExpectedConditions.visibilityOf(wikiPage.coordinates));
    }

    @Then("I should see logistics content")
    public void i_should_see_logistics_content() {
        wait.until(ExpectedConditions.visibilityOf(wikiPage.logistics));
    }

    @Then("I should see site concerns content")
    public void i_should_see_site_concerns_content() {
        wait.until(ExpectedConditions.visibilityOf(wikiPage.siteConcerns));
    }

}
