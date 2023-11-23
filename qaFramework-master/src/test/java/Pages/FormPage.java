package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage extends BasePage{
    public FormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//span[text()='Practice Form']")
    private WebElement practiceFormElement;

    public void clickPracticeFormElement(){
        elementMethods.clickElement(practiceFormElement);
        LoggerUtility.infoTest("The user clicks on Practice Form element");
    }
}
