package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility extends Utilities{
    public static Select  selectClassInit(By locator){
        return new Select(driver.findElement(locator));

    }
    public void selectByVisibleText(By locator, String text){
        selectClassInit(locator).selectByVisibleText(text);

    }
}
