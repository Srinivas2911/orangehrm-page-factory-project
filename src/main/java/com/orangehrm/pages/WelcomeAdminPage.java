package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WelcomeAdminPage extends Utility {

    //Log the webelements and methods into Log4j reports
    private static final Logger log = LogManager.getLogger(WelcomeAdminPage.class.getName());

//Using selenium @Findby and initElement methods
// using _ help separate from variable

    //  By welcomeAdminText = By.xpath("//a[@id='welcome']");

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement _welcomeAdminText;

      public String getWelcomeAdminText() {
        Reporter.log("Displaying Welcome AdminText :" + _welcomeAdminText.toString() + "<br>");
        log.info("Displaying Welcome AdminText : " + _welcomeAdminText.toString());
        return getTextFromElement(_welcomeAdminText);
    }
}
