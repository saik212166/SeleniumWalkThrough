package org.example.AlertsFrameWindowsCardsPages.WindowsPages;

import Utility.JavaScriptUtility;
import Utility.SwitchToUtility;
import Utility.Utilities;
import org.example.AlertsFrameWindowsCardsPages.AlertsFrameWindowsCard;
import org.openqa.selenium.By;

import java.util.Set;

public class BrowserWindowsPage extends AlertsFrameWindowsCard {
    private final By windowButton = By.id("windowButton");
    public void clickNewWindowButton(){
        JavaScriptUtility.scrollingOnWebPage(windowButton);
        click(windowButton);
    }
    public void switchToNewWindow(){
        //Step 1 Get Current Window Handle
        String currentHandle = driver.getWindowHandle();
        //Step 2 Get All Window Handles
        Set<String> handles = driver.getWindowHandles();
        //Step 3 find the window which is not the current Windows Switch To new Window
        System.out.println("The Total windows : " + handles.size());
        for(String handle : handles){
            if (currentHandle.equals(handle)){
                System.out.println("The Current Handle : " + handle);

            }
            else {
                SwitchToUtility.switchTo(handle);
                System.out.println("The New Window Handle : " + handle);
            }
        }
    }
    public String getUrl(){
        return Utilities.getUrl();
    }
}
