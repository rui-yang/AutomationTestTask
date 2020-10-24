package utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ScreenShot {
    public static Scenario message;

    public static void takeScreenShot(WebDriver driver) {
        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        message.attach(screenshot, "image/png", dateFormat.format(new Date())+".png");

    }

}