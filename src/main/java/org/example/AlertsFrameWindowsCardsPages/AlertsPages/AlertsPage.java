package org.example.AlertsFrameWindowsCardsPages.AlertsPages;

import org.example.AlertsFrameWindowsCardsPages.AlertsFrameWindowsCard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends AlertsFrameWindowsCard {
    private final By alertButton = By.id("alertButton");
    private final By promptAlertButton = By.id("promtButton");
    public void clickPromptAlertButton(){
        click(promptAlertButton);
    }
    public void clickAlertButton(){
        //WebElement el = find(alertButton);
        click(alertButton);
        //getAlertText
    }
    private WebDriver.TargetLocator switchTo(){
        return driver.switchTo();

    }
    public String getTextOfAlertButton(){
        return switchTo().alert().getText();
    }
    public void alertAccept(){
        switchTo().alert().accept();
    }
    public void sendPrompt(String text){
        switchTo().alert().sendKeys(text);
    }

    public String getTextOfResultPrompt() {
        return find(promptAlertButton).getText();
    }
}
