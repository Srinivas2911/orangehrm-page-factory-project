package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    //Log the webelements and methods into Log4j reports
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

//Using selenium @Findby and initElement methods
// using _ help separate from variable

//    By loginPanelText = By.xpath("//div[@id='logInPanelHeading']");
//    By usernameField = By.id("txtUsername");
//    By passwordField = By.id("txtPassword");
//    By loginBtn = By.id("btnLogin");


    @FindBy(xpath ="//div[@id='logInPanelHeading']")
    WebElement _loginPanelText;

    @FindBy(id = "txtUsername")
    WebElement _usernameField;

    @FindBy(id = "txtPassword")
    WebElement _passwordField;

    @FindBy(id = "btnLogin")
    WebElement _loginBtn;

        public String getLoginPanelText (){
        Reporter.log("Displaying Login Panel Link " + _loginPanelText.toString() + "<br>");
        log.info("Displaying Login Panel Link : " + _loginPanelText.toString());
        return getTextFromElement(_loginPanelText);
    }
    public void enterUsernameField (String username){
        Reporter.log("Entering Username  : " + username +" "+ _usernameField.toString() + "<br>");
        sendTextToElement(_usernameField, username);
        log.info("Entering Username : " + username + " "+_usernameField.toString());
    }

    public void enterPasswordField (String password){
        Reporter.log("Entering Password  : " + password +" "+ _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("Entering Password : " + password + " "+_passwordField.toString());
    }
    public void clickonLoginBtn(){
        Reporter.log("Clicking on Login Button  : " + _loginBtn.toString() + "<br>");
        clickOnElement(_loginBtn );
        log.info("Clicking on Login Button : " + _loginBtn.toString());

    }
}
