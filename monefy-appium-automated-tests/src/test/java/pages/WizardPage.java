package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WizardPage extends BasePage {

    AppiumDriver<MobileElement> driver;

    public WizardPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;

    }

    private By getsstartedBtn = By.xpath("//android.widget.Button[@resource-id=\"com.monefy.app.lite:id/buttonContinue\"]");
    public void wizardStep1(){
        clickElement(getsstartedBtn);
        verifyText(getsstartedBtn,"GET STARTED");

    }

    private By amazingBtn = By.xpath("//android.widget.Button[@resource-id=\"com.monefy.app.lite:id/buttonContinue\"]");
    public void wizardStep2(){
        clickElement(amazingBtn);
        verifyText(amazingBtn,"AMAZING");
    }

    private By ReadyBtn = By.xpath("//android.widget.Button[@resource-id=\"com.monefy.app.lite:id/buttonContinue\"]");
    public void wizardStep3(){
        clickElement(ReadyBtn);

    }
    private  By closeBtn = By.id("com.monefy.app.lite:id/buttonClose");
    public void closeWizard(){
        clickElement(closeBtn);
    }

}
