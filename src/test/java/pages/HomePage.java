package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "search-input")
    public WebElement searchBox;


    @FindBy(id = "searchInput")
    public WebElement inputBox;


    @FindBy(className = "suggestions-dropdown")
    public WebElement suggestionsDropDown;

}
