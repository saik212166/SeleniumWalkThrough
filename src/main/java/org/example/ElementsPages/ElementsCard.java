package org.example.ElementsPages;

import Utility.JavaScriptUtility;
import org.example.BasePage;
import org.openqa.selenium.By;

public class ElementsCard extends BasePage {
    private final By DynamicPropertiesButton = By.xpath("//li[@id ='item-8']//span[text() = 'Dynamic Properties']");

    public DynamicPropertiesPage clickDynamicProperties(){
        JavaScriptUtility.scrollingOnWebPage(DynamicPropertiesButton);
        click(DynamicPropertiesButton);
        return new DynamicPropertiesPage();
    }

}
