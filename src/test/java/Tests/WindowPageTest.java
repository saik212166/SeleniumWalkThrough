package Tests;

import Utility.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowPageTest extends BaseTest{
    @Test
    public void TestSwitchWindow() throws InterruptedException {
        alertsFrameWindowsCard = homePage.clickAlertsFrameWindowsCard();
        browserWindowsPage = alertsFrameWindowsCard.clickBrowserWindowField();
        browserWindowsPage.clickNewWindowButton();
        browserWindowsPage.switchToNewWindow();
        Thread.sleep(500);
        String actual = browserWindowsPage.getUrl();
        Assert.assertEquals(actual , "https://demoqa.com/sample");
    }
}
