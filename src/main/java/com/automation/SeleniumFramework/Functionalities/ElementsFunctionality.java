package com.automation.SeleniumFramework.Functionalities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.SeleniumFramework.Utils.ExcelUtils;

public class ElementsFunctionality extends BasePage{
	WebDriverWait wait;

	public ElementsFunctionality(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void TextBoxFunctionality() {
		try {
			Map<String, String> data = ExcelUtils.getDataForTestCase("TC01");
			wait.until(ExpectedConditions.elementToBeClickable(textBoxTab)).click();
			wait.until(ExpectedConditions.elementToBeClickable(textBoxLabel));
			wait.until(ExpectedConditions.elementToBeClickable(usernameTB)).sendKeys(data.get("name"));
			wait.until(ExpectedConditions.elementToBeClickable(userEmailTB)).sendKeys(data.get("email"));
			wait.until(ExpectedConditions.elementToBeClickable(currentAddressTB)).sendKeys(data.get("currentAddress"));
			wait.until(ExpectedConditions.elementToBeClickable(permanentAddressTB)).sendKeys(data.get("permanentAddress"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBT);
			wait.until(ExpectedConditions.elementToBeClickable(submitBT)).click();
			
			//Get Output
			ArrayList<String> output = new ArrayList<String>();
			output.add(outputName.getText());
			output.add(outputEmail.getText());
			output.add(outputCurrAddress.getText());
			output.add(outputPermanentAddress.getText());
			
			for(String s : output) {
				System.out.println(s);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void CheckBoxFunctionality() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(checkBoxTab)).click();
			wait.until(ExpectedConditions.elementToBeClickable(checkBoxLabel));
			wait.until(ExpectedConditions.elementToBeClickable(expandAllBT)).click();
			wait.until(ExpectedConditions.elementToBeClickable(homeCB)).click();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", reactCB);
			wait.until(ExpectedConditions.elementToBeClickable(officeCB)).click();
			wait.until(ExpectedConditions.elementToBeClickable(reactCB)).click();
			wait.until(ExpectedConditions.elementToBeClickable(wordCB)).click();
			wait.until(ExpectedConditions.elementToBeClickable(excelCB)).click();
			wait.until(ExpectedConditions.elementToBeClickable(collapseAllBT)).click();
			wait.until(ExpectedConditions.elementToBeClickable(toggleCB.get(0))).click();
			
			for(int i=0;i<resultCB.size();i++) {
				System.out.println(resultCB.get(i).getText());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void checkRadioButtonFunctionality() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(radioBTTab)).click();
			wait.until(ExpectedConditions.elementToBeClickable(radioButtonLabel));
			wait.until(ExpectedConditions.elementToBeClickable(yesRadioBT)).click();
			System.out.println("You have selected radio button as: "+selectedRadioBTLabel.getText());
			wait.until(ExpectedConditions.elementToBeClickable(impressiveRadioBT)).click();
			System.out.println("You have selected radio button as: "+selectedRadioBTLabel.getText());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
