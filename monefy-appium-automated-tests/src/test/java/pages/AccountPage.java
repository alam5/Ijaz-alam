package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.lang.management.MonitorInfo;

public class AccountPage extends BasePage  {

    AppiumDriver<MobileElement> driver;

    public AccountPage(AppiumDriver<MobileElement> driver){
        super(driver);
        this.driver = driver;
    }

    private By rightMenu = By.id("overflow");
    private By accountBtn = By.id("accounts_imagebutton");
    private By addCategory = By.id("imageButtonAddCategory");
    private By categoryName = By.id("editTextCategoryName");
    private By iniAmount = By.id("initialAmount");
    private By selectImage = By.xpath("//android.widget.GridView[@resource-id=\"com.monefy.app.lite:id/gridViewCategoryImages\"]/android.widget.FrameLayout[1]/android.widget.FrameLayout");
    private By saveAccount = By.id("save");
    private By accTaost = By.id("snackbar_text");

    public void clickRightMenu(){
         clickElement(rightMenu);
    }

    public void clickAccountButton(){
        clickElement(accountBtn);
    }

    public void addCategory(){
        clickElement(addCategory);
    }

    public void enterName(String txt){
        enterText(categoryName,txt);
    }

    public void addInitialAmount(String txt){
        enterText(iniAmount,txt);
    }

    public void selectCategoryImage(){
        clickElement(selectImage);
    }

    public void saveAccount(){
        clickElement(saveAccount);
    }

    public void verifyAccount(){
        verifyText(accTaost,"New account was added");
    }

}
