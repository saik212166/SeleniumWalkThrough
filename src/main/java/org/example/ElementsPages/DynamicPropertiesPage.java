package org.example.ElementsPages;

import Utility.ExplicitWaitUtility;
import org.openqa.selenium.By;

public class DynamicPropertiesPage extends ElementsCard{
    private final By dynamicVisibleButton = By.id("visibleAfter");

    public void clickDynamicVisibleButton(int sec){

        ExplicitWaitUtility.explicitWait(sec , dynamicVisibleButton);
    }

    public String getText() {
        return find(dynamicVisibleButton).getText();
    }
}
