package Utility;

public class SwitchToUtility extends Utilities{

    public static void switchTo(String handle){
        driver.switchTo().window(handle);

    }

}
