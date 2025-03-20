package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

    AppiumDriver<MobileElement> driver;
    public static final long wait_duration= 15;

    public BasePage( AppiumDriver<MobileElement> driver){
        this.driver =driver;

    }
    public void waitElementVisibility(MobileElement element)
    {if (driver == null) {throw new IllegalStateException("Driver is not initialized.");}
        WebDriverWait wait=new WebDriverWait(driver,wait_duration);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement( By element)
    { MobileElement  element1 = driver.findElement(element);
        waitElementVisibility(element1);
        element1.click();
    }

    public void enterText(By element, String val)
    {   MobileElement  element1 = driver.findElement(element);
        waitElementVisibility(element1);
        element1.sendKeys(val);
    }

    public void verifyText(By element, String val){
        MobileElement tostmsg = driver.findElement(element);
        waitElementVisibility(tostmsg);
        Assert.assertTrue(tostmsg.isDisplayed());
        Assert.assertEquals(tostmsg.getText(), val);
    }

}
