package com.orangehrm.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver, this);

        // configuring for Log4j reports
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/com/orangehrm/resources/propertiesfile/log4j.properties");

    }
}