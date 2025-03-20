package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import java.net.MalformedURLException;

public class HomeTest extends BaseTest {

    private HomePage home;

    @BeforeClass
    public void setUp() {
        home = new HomePage(driver);
    }

    @Test(priority = 1)
    public void checkIncomeFunc(){
        ExtentTest test = extent.createTest("SMOKE TEST - TC01 -ADDING INCOME TO THE MAIN ACCOUNT ", "Check that adding income to the account is working as expected");
        test.log(Status.INFO, "Test Started");

        home.clickIncomeBtn();
        test.log(Status.INFO, "Income button is clicked");

        home.enterAmount();
        test.log(Status.INFO, "Amount is entered via app keyboard");

        home.clickCategory();
        test.log(Status.INFO, "Deposit category is selected");

        home.selectDeposit();
        test.log(Status.INFO, "Verify Success toast message after entering income");

        home.verifyBalance();
        test.log(Status.PASS, "Test Finished");

        home.cancelToast();
        test.log(Status.INFO, "Toast message is cancelled");
    }

    @Test(priority = 2)
    public void checkExpenseFunc() {
        ExtentTest test = extent.createTest("SMOKE TEST - TC02 -ADDING EXPENSE TO THE MAIN ACCOUNT ", "Check that adding income to the account is working as expected");
        test.log(Status.INFO, "Test Started");

        home.clickExpenseBtn();
        test.log(Status.INFO, "Expense button is clicked");

        home.enterAmount();
        test.log(Status.INFO, "Amount is entered via app keyboard");

        home.clickCategory();
        test.log(Status.INFO, "Deposit category is selected");

        home.chooseExpenseCategory();
        test.log(Status.INFO, "Deposit category is selected");

        home.verifyExpense();
        test.log(Status.PASS, "Success toast message is displayed");

        home.cancelToast();
        test.log(Status.INFO, "Toast message is cancelled");
    }

}
