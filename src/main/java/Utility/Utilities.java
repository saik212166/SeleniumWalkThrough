package Utility;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;

public class Utilities {
    static WebDriver driver;
    public void setUtilityDriver(){
        driver = BasePage.driver;
    }
    public static String getUrl(){
        return driver.getCurrentUrl();
    }
}
