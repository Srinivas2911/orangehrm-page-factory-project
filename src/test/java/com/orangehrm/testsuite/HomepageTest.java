package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomepageTest extends TestBase {

    HomePage homePage ;
    SoftAssert sa = new SoftAssert();

    @BeforeMethod ( groups = {"sanity", "smoke", "regression"})
    public void setUpMethod(){
        homePage = new HomePage();
    }

    @Test (priority = 0, groups = {"sanity", "smoke"})
    public void verifyThatLoginPanelTextisDisplayed(){
        sa.assertTrue(homePage.getLoginPanelText().contains("LOGIN Panel"));
        sa.assertAll();
    }

}
