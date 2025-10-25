package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitUtility extends Utilities{

    public static void explicitWait(int sec, By dynamicVisibleButton) {
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicVisibleButton));
    }

}
