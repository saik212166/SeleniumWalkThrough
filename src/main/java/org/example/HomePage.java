package org.example;

import Utility.JavaScriptUtility;
import org.example.AlertsFrameWindowsCardsPages.AlertsFrameWindowsCard;
import org.example.ElementsPages.ElementsCard;
import org.example.FormsCardPages.FormsPage;
import org.openqa.selenium.By;

public class HomePage extends BasePage{
    private final By formsCard = By.xpath("//div[@Id='app']//h5[text() = 'Forms']");
    private final By alertsCard = By.xpath("//div[@Id='app']//h5[text() = 'Alerts, Frame & Windows']");
    private final By elementsCard = By.xpath("//div[@id ='app']//h5[text() = 'Elements']");



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
    public ElementsCard clickElementsCard(){
        JavaScriptUtility.scrollingOnWebPage(elementsCard);
        click(elementsCard);
        return new ElementsCard();
    }
}
