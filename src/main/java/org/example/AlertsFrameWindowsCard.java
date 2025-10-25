package org.example;

import Utility.JavaScriptUtility;
import org.openqa.selenium.By;

public class AlertsFrameWindowsCard extends BasePage{
    private final By alertsField = By.xpath("//li[@id='item-1']//span[text() = 'Alerts']");
    private final By browserWindowField = By.xpath("//li[@id = 'item-0']//span[text() = 'Browser Windows']");

    public AlertsPage clickAlertsField(){
        JavaScriptUtility.scrollingOnWebPage(alertsField);
        click(alertsField);
        return new AlertsPage();
    }
    public BrowserWindowsPage clickBrowserWindowField(){
        JavaScriptUtility.scrollingOnWebPage(browserWindowField);
        click(browserWindowField);
        return new BrowserWindowsPage();
    }

}
