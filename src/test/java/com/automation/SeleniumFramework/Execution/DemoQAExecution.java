package com.automation.SeleniumFramework.Execution;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.SeleniumFramework.Extras.DriverFactory;
import com.automation.SeleniumFramework.Functionalities.*;
import com.automation.SeleniumFramework.Utils.ReusableComponent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class DemoQAExecution {
	WebDriver driver;
	HomePage homePage;
	ElementsFunctionality elementsFunctionality;
	FormsFunctionality formsFunctionality;
	

	@Parameters({"browser"})
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser) {
		driver = ReusableComponent.LaunchBrowser(browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage(driver);
        elementsFunctionality = new ElementsFunctionality(driver);
        formsFunctionality = new FormsFunctionality(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver. quit();
        }
        DriverFactory.unload();
    }
    
    @Test
    public void TC01_CheckElementsFunctionality(){
    	homePage.openElemetsTab();
    	elementsFunctionality.TextBoxFunctionality();
    	elementsFunctionality.CheckBoxFunctionality();
    	elementsFunctionality.checkRadioButtonFunctionality();
    }
    
    @Test
    public void TC02_FillPracticeForm() {
    	homePage.openFormsTab();
    	formsFunctionality.fillPracticeForm();
    }
}
