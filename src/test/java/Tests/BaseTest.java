package Tests;

import Utility.Utilities;
import org.example.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;
    BasePage basePage;
    HomePage homePage;
    FormsPage formsPage;
    PracticeFormPage practiceFormPage;
    Utilities utilities;
    AlertsFrameWindowsCard alertsFrameWindowsCard;
    AlertsPage alertsPage;
    BrowserWindowsPage browserWindowsPage;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        basePage = new BasePage();
        basePage.setDriver(driver);
        homePage = new HomePage();
        utilities = new Utilities();
        utilities.setUtilityDriver();
        formsPage = new FormsPage();
        practiceFormPage = new PracticeFormPage();
        alertsFrameWindowsCard = new AlertsFrameWindowsCard();
        alertsPage = new AlertsPage();
        browserWindowsPage = new BrowserWindowsPage();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }
    @AfterTest
    public void wrapUp() throws InterruptedException {
        Thread.sleep(2000);
       driver.quit();
    }
}
