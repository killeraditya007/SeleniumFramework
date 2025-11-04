package com.automation.SeleniumFramework.Functionalities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetsFunctionality extends BasePage{
	WebDriverWait wait;

	public WidgetsFunctionality(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
}
