package com.automation.SeleniumFramework.Functionalities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStoreFunctionality extends BasePage{
	WebDriverWait wait;

	public BookStoreFunctionality(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
}
