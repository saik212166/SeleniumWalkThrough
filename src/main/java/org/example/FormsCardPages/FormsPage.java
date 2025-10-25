package org.example.FormsCardPages;

import Utility.JavaScriptUtility;
import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsPage extends BasePage {
    WebDriver driver  = BasePage.driver;
    private By locator = By.xpath("//span[text() = 'Practice Form']");

    public PracticeFormPage clickedFormsPage(){
         //WebElement element = driver.findElement(locator);
        JavaScriptUtility.scrollingOnWebPage(locator);
        click(locator);
        return new PracticeFormPage();
        //Assert.
        //return element.isDisplayed();


    }

}
