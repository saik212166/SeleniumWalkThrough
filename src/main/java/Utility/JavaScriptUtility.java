package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utilities{
    public static void scrollingOnWebPage(By locator){
    WebElement element = driver.findElement(locator);
    JavascriptExecutor js =  (JavascriptExecutor) driver;
    String javScript = "arguments[0].scrollIntoView();";
    js.executeScript(javScript, element);


    }
    public static void clickJs(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        String javScript = "arguments[0].click();";
        js.executeScript(javScript, element);


    }
}
