package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikiPage extends BasePage{
    public WikiPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "coordinates")
    public WebElement coordinates;

    @FindBy(id = "Logistics")
    public WebElement logistics;

    @FindBy(id = "Site_concerns")
    public WebElement siteConcerns;

}
