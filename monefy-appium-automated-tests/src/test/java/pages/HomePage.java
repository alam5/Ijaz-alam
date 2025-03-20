package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;



public class HomePage extends BasePage {

    AppiumDriver<MobileElement> driver;
        public HomePage(AppiumDriver<MobileElement> driver) {
            super(driver);
            this.driver = driver;
    }

    private By addIncomeBtn = By.id("income_button_title");
    private By amountText = By.id("amount_text");
    private By CategoryBtn = By.id("keyboard_action_button");
    private By selectDepositBtn = By.xpath("//android.widget.TextView[@resource-id=\"com.monefy.app.lite:id/textCategoryName\" and @text=\"Deposits\"]");
    private By Taost = By.id("snackbar_text");
    private By actionToast = By.id("snackbar_action");
    private By num5 = By.id("buttonKeyboard5");
    private By num0 = By.id("buttonKeyboard0");

    private By expensebtn = By.id("expense_button");
    private By expenscategry = By.xpath("//android.widget.TextView[@resource-id=\"com.monefy.app.lite:id/textCategoryName\" and @text=\"Bills\"]");




    public void clickIncomeBtn() {
        clickElement(addIncomeBtn);
    }

    public void enterAmount(){
        clickElement(num5);
        clickElement(num0);
        clickElement(num0);
    }

    public void clickCategory(){
        clickElement(CategoryBtn);
    }

    public void selectDeposit(){
        clickElement(selectDepositBtn);
    }

    public void verifyBalance(){
        verifyText(Taost,"Deposits: $500.00 added");
    }


    public void clickExpenseBtn() {
        clickElement(expensebtn);
    }

    public void chooseExpenseCategory(){
        clickElement(expenscategry);
    }

    public void verifyExpense(){
        verifyText(Taost,"Bills: $500.00 added");
    }

    public void cancelToast(){
        clickElement(actionToast);
    }


}
