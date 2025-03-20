package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.WizardPage;

public class WizardTest extends BaseTest {

    private WizardPage wizard;

    @BeforeClass
    public void setUp() {
        wizard = new WizardPage(driver);
    }

    @Test(priority = 1)
    public void passThroughWizard(){
        wizard.wizardStep1();
        wizard.wizardStep2();
        wizard.wizardStep3();
        wizard.closeWizard();
    }


}
