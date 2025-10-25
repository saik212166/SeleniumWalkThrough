package org.example;

import Utility.JavaScriptUtility;
import org.openqa.selenium.By;

public class AlertsFrameWindowsCard extends BasePage{
    private final By alertsField = By.xpath("//li[@id='item-1']//span[text() = 'Alerts']");

    public AlertsPage clickAlertsField(){
        JavaScriptUtility.scrollingOnWebPage(alertsField);
        click(alertsField);
        return new AlertsPage();
    }

}
