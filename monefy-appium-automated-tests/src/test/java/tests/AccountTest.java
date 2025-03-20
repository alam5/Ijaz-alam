package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountPage;

public class AccountTest extends BaseTest {

    private AccountPage account;

    @BeforeClass
    public void setup(){
        account = new AccountPage(driver);
    }

    @Test
    public void createAccount(){
        ExtentTest test = extent.createTest("REGRESSION TESTS - TC02 - CREATE AN NEW ACCOUNT", "Check that adding income to the account is working as expected");
        test.log(Status.INFO, "Test Started");
       account.clickRightMenu();
        test.log(Status.INFO, "Right top menu button is clicked");

       account.clickAccountButton();
        test.log(Status.INFO, " Account Button is clicked");

       account.addCategory();
        test.log(Status.INFO, "Add Category button is clicked");

       account.enterName("New-acc-a");
        test.log(Status.INFO, "Category name is entered");

       account.addInitialAmount("450");
        test.log(Status.INFO, "Initial amount is entered");

       account.selectCategoryImage();
        test.log(Status.INFO, "AMEX Category image is selected");

       account.saveAccount();
        test.log(Status.INFO, "New Account is saved");

       account.verifyAccount();
        test.log(Status.PASS, "success message is displayed");

    }


}
