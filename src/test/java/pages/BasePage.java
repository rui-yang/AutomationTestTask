package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private static final long WAIT_TIME = 30;
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean waitForElementPresence(WebElement element) {
        try {
            WebDriverWait driverWait = new WebDriverWait(driver, WAIT_TIME);
            driverWait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (Exception err) {
            System.out.println(err.getMessage());
            return false;
        }
    }
}
