package Tests;

import org.example.FormsPage;
import org.example.PracticeFormPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormsPageTest extends BaseTest{
    @Test
    public void LoggedIntoFormPageTest()  {
        FormsPage page = homePage.clickFormsCard();
        PracticeFormPage practiceFormPage1 = page.clickedFormsPage();
        practiceFormPage1.setFirstName ("Sai");
        practiceFormPage1.setLastName("Kalyan");
        practiceFormPage1.setEmail("mssaikalyan@gmail.com");
        practiceFormPage1.setMobile("8925666100");
        practiceFormPage1.setCurrAddress("1072/A Prithivi Nagar Gummidipoondi-601201");
        practiceFormPage1.clickRadioButton();
        practiceFormPage1.sendSubjects();
        practiceFormPage1.selectMusicCheckBox();
        practiceFormPage1.selectSportsCheckBox();
        practiceFormPage1.selectReadingCheckBox();
        practiceFormPage1.unselectSportsCheckBox();
        practiceFormPage1.sendState();
        //Thread.sleep(300);
        practiceFormPage1.sendCity();

        Assert.assertTrue(practiceFormPage1.TitleTagPracticeFormDisplayed());
        Assert.assertFalse(practiceFormPage1.isSportsCheckBoxSelected());
        practiceFormPage1.clickSubmit();


    }
}
