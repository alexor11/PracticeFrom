package Tests;

import ObjectData.PracticeFormObject;
import ObjectData.WebTableObject;
import Pages.FormPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import ReportUtility.ExtentUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;

public class PracticeFormTest extends Hooks {

    @Test
    public void PracticeFormTest() {

        PracticeFormObject practiceobject = new PracticeFormObject(propertyUtility.getAllData());
        HomePage homePage = new HomePage(getDriver());
        FormPage formPage = new FormPage(getDriver());
        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());

        homePage.clickFormsPage();
        ExtentUtility.attachTestLog("pass","I make a click on forms element");

        formPage.clickPracticeFormElement();
        ExtentUtility.attachTestLog("pass","I make a click on practiceForm element from list");

        practiceFormPage.completeFirstRegion(practiceobject);
        ExtentUtility.attachTestLog("pass","I filled first Region");

        practiceFormPage.clickOnGenderType(practiceobject);
        ExtentUtility.attachTestLog("pass","I clicked on genders type");

        practiceFormPage.completeCalendar(practiceobject);
        ExtentUtility.attachTestLog("pass","I completed the calendar");

        practiceFormPage.completeSecondRegion(practiceobject);
        ExtentUtility.attachTestLog("pass","I completed the second region");

        practiceFormPage.hobbiesHandle(practiceobject);
        ExtentUtility.attachTestLog("pass","I completed hobbies");

        practiceFormPage.uploadPhotoMethod();
        ExtentUtility.attachTestLog("pass","I have uploaded an image");

        practiceFormPage.completeStateAndCity(practiceobject);
        ExtentUtility.attachTestLog("pass","I have completed state and City");

        practiceFormPage.submmit();
        ExtentUtility.attachTestLog("pass","I clicked on submit");

        practiceFormPage.validateTableContent(practiceobject);
        ExtentUtility.attachTestLog("pass","I validated all data");

    }
}
