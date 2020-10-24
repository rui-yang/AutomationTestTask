package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSteps {
    public WebDriver driver;
    public WebDriverWait wait;

    public BaseSteps() {
        this.driver = Hooks.getDriver();
        this.wait = new WebDriverWait(driver, 30);
    }

}
