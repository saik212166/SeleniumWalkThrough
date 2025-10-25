package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicPropertiesExplicitWaitTest extends BaseTest{
    @Test
    public void DynamicPropertiesTest(){
        elementsCard = homePage.clickElementsCard();
        dynamicPropertiesPage = elementsCard.clickDynamicProperties();
        dynamicPropertiesPage.clickDynamicVisibleButton(5);
        String actualText = dynamicPropertiesPage.getText();
        Assert.assertEquals(actualText , "Visible After 5 Seconds");

    }
}
