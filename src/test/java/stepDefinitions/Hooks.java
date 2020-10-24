package stepDefinitions;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.ScreenShot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setUp() {
        String browserName = System.getProperty("browser");
        if (browserName == null) {
            browserName = "chrome";
        }

        if(browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver");
            driver= new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }

    @BeforeStep
    public void beforeStep(Scenario scenario) {
        ScreenShot.message = scenario;
    }

    @AfterStep
    public void afterStep() {
        ScreenShot.takeScreenShot(driver);
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

}
