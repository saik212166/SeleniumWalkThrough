package org.example;

import Utility.JavaScriptUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends  FormsPage{
    private final By TitleTaginPracticeForm  = By.xpath("//div[@id='app']//h1");
    private final By maleRadioButton =  By.id("gender-radio-1");
    private final By sportsCheckBox = By.id("hobbies-checkbox-1");
    private final By readingCheckBox = By.id("hobbies-checkbox-2");
    private final By musicCheckBox = By.id("hobbies-checkbox-3");
    private final By firstName = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By email = By.id("userEmail");
    private final By mobile = By.id("userNumber");
    private final By currAddress = By.id("currentAddress");
    private final By subjects = By.id("subjectsInput");
    private final By dropDownState = By.id("react-select-3-input");
    private final By dropDownCity = By.id("react-select-4-input");
    private final By submitButton = By.id("submit");
    public boolean TitleTagPracticeFormDisplayed(){
        WebElement element = find(TitleTaginPracticeForm);
        return element.isDisplayed();
    }

    public void clickRadioButton(){
       // WebElement  element = find(maleRadioButton);
        JavaScriptUtility.scrollingOnWebPage(maleRadioButton);
        JavaScriptUtility.clickJs(maleRadioButton);
        //return .isSelected();
    }
    public void selectSportsCheckBox(){
        if(!find(sportsCheckBox).isSelected()){
            JavaScriptUtility.scrollingOnWebPage(sportsCheckBox);
            JavaScriptUtility.clickJs(sportsCheckBox);
        }
    }
    public void selectReadingCheckBox(){
        if(!find(readingCheckBox).isSelected()){
            JavaScriptUtility.scrollingOnWebPage(readingCheckBox);
            JavaScriptUtility.clickJs(readingCheckBox);
        }
    }
    public void selectMusicCheckBox(){
        if(!find(musicCheckBox).isSelected()){
            JavaScriptUtility.scrollingOnWebPage(musicCheckBox);
            JavaScriptUtility.clickJs(musicCheckBox);
        }
    }
    public void unselectSportsCheckBox(){
        if(find(sportsCheckBox).isSelected()){
            JavaScriptUtility.scrollingOnWebPage(sportsCheckBox);
            JavaScriptUtility.clickJs(sportsCheckBox);
        }
    }

    public boolean isSportsCheckBoxSelected() {
        return find(sportsCheckBox).isSelected();
    }

    public void setFirstName(String Name) {
        set(firstName, Name);
    }
    public void setLastName(String Name) {
      //  By lastName;
        set(lastName, Name);
    }
    public void setEmail(String Name) {
        set(email, Name);
    }
    public void setMobile(String Name) {
        set(mobile, Name);
    }
    public void setCurrAddress(String Name) {
        set(currAddress, Name);
    }
    public void clickSubmit(){
        click(submitButton);
    }
    public void sendState() {
        set(dropDownState , "NCR");
        enter(dropDownState);
    }
    public void sendCity() {
       // click(dropDownCity);
        set(dropDownCity , "Delhi");
        enter(dropDownCity);
    }
    public void sendSubjects(){
        set(subjects, "Selenium and Spring Boot");
    }


}
