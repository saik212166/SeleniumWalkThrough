package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsPageTest extends BaseTest{
    @Test
    public void TestClickHomePageElement(){
        alertsFrameWindowsCard = homePage.clickAlertsFrameWindowsCard();
        alertsPage = alertsFrameWindowsCard.clickAlertsField();
        alertsPage.clickPromptAlertButton();
        alertsPage.sendPrompt("Sai Kalyan");
        alertsPage.alertAccept();
        Assert.assertFalse(alertsPage.getTextofResultPrompt().contains("Sai") );



//        alertsPage.clickAlertButton();
//        String actualMsg = alertsPage.getTextOfAlertButton();
//        Assert.assertEquals(actualMsg , "You clicked a button" , "No need Worry it is working Fine");
//        alertsPage.alertAccept();




    }


}
