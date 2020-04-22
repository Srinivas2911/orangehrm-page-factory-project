package com.orangehrm.testsuite;

import com.orangehrm.pages.WelcomeAdminPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    HomePage homePage;
    WelcomeAdminPage welcomeAdminPage;
    SoftAssert sa = new SoftAssert();

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void setUpMethod() {
        homePage = new HomePage();
        welcomeAdminPage = new WelcomeAdminPage();
    }

    @Test(priority = 0, groups = {"smoke", "regression"})
    public void UserIsAbleToLoginSuccessfully() {
        homePage.enterUsernameField("Admin");
        homePage.enterPasswordField("admin123");
        homePage.clickonLoginBtn();
        sa.assertTrue(welcomeAdminPage.getWelcomeAdminText().contains("Welcome Admin"));
        sa.assertAll();

    }
}
