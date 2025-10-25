package org.example;

import Utility.JavaScriptUtility;
import org.openqa.selenium.By;

public class HomePage extends BasePage{
    private final By formsCard = By.xpath("//div[@Id='app']//h5[text() = 'Forms']");
    private final By alertsCard = By.xpath("//div[@Id='app']//h5[text() = 'Alerts, Frame & Windows']");

    public FormsPage clickFormsCard(){
        JavaScriptUtility.scrollingOnWebPage(formsCard);
        click(formsCard);
        return new FormsPage();
    }
    public AlertsFrameWindowsCard clickAlertsFrameWindowsCard(){
        JavaScriptUtility.scrollingOnWebPage(alertsCard);
        click(alertsCard);
        return new AlertsFrameWindowsCard();
    }
}
