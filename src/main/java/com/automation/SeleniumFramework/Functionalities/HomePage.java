package com.automation.SeleniumFramework.Functionalities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void openElemetsTab() {
		try {
			String className = subElementsTab.getAttribute("class");
			if(!className.contains("show")) {
				wait.until(ExpectedConditions.elementToBeClickable(elementsTab)).click();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void openFormsTab() {
		try {
			String className = subElementsTab.getAttribute("class");
			if(!className.contains("show")) {
				wait.until(ExpectedConditions.elementToBeClickable(formsTab)).click();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void openAlertsFrameWindowsTab() {
		try {
			String className = subElementsTab.getAttribute("class");
			if(!className.contains("show")) {
				wait.until(ExpectedConditions.elementToBeClickable(alertsFrameWindowsTab)).click();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void openWidgetsTab() {
		try {
			String className = subElementsTab.getAttribute("class");
			if(!className.contains("show")) {
				wait.until(ExpectedConditions.elementToBeClickable(widgetsTab)).click();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void openInteractionsTab() {
		try {
			String className = subElementsTab.getAttribute("class");
			if(!className.contains("show")) {
				wait.until(ExpectedConditions.elementToBeClickable(interactionsTab)).click();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void openBookStoreTab() {
		try {
			String className = subElementsTab.getAttribute("class");
			if(!className.contains("show")) {
				wait.until(ExpectedConditions.elementToBeClickable(bookStoreTab)).click();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
