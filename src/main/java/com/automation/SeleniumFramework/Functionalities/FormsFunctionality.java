package com.automation.SeleniumFramework.Functionalities;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.SeleniumFramework.Utils.ExcelUtils;

public class FormsFunctionality extends BasePage{
	private static final Logger logger = (Logger) LogManager.getLogger(FormsFunctionality.class);
	WebDriverWait wait;

	public FormsFunctionality(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void fillPracticeForm() {
		try {
			Map<String, String> data = ExcelUtils.getDataForTestCase("TC02");
			wait.until(ExpectedConditions.elementToBeClickable(practiceFormTab)).click();
			wait.until(ExpectedConditions.elementToBeClickable(practiceFormLabel));
			wait.until(ExpectedConditions.elementToBeClickable(firstNameTextField)).sendKeys(data.get("fname"));
			wait.until(ExpectedConditions.elementToBeClickable(lastNameTextField)).sendKeys(data.get("lname"));
			wait.until(ExpectedConditions.elementToBeClickable(userEmailTextField)).sendKeys(data.get("email"));
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", maleRB);
			if(data.get("gender").equals("Male")) {
				wait.until(ExpectedConditions.elementToBeClickable(maleRB)).click();
			}else if(data.get("gender").equals("Female")) {
				wait.until(ExpectedConditions.elementToBeClickable(femaleRB)).click();
			}else {
				wait.until(ExpectedConditions.elementToBeClickable(otherRB)).click();
			}
			wait.until(ExpectedConditions.elementToBeClickable(userNumberTextField)).sendKeys(data.get("mobile"));
			
			String[] dob = data.get("dob").split("/");		
			wait.until(ExpectedConditions.elementToBeClickable(dobContainer)).click();
			wait.until(ExpectedConditions.elementToBeClickable(dobInput)).sendKeys(Keys.chord(Keys.CONTROL, "a"));
			wait.until(ExpectedConditions.elementToBeClickable(dobInput)).sendKeys(dob[0],Keys.SPACE,dob[1],Keys.SPACE,dob[2],Keys.ENTER);
//			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subjectsContainer);
			String[] subjects = data.get("subjects").split(",");
			wait.until(ExpectedConditions.elementToBeClickable(subjectsContainer)).click();
			for(int i=0;i<subjects.length;i++) {
				wait.until(ExpectedConditions.elementToBeClickable(subjectsInputTextField)).sendKeys(subjects[i]);
				wait.until(ExpectedConditions.elementToBeClickable(subjectsInputTextField)).sendKeys(Keys.ENTER);
			}
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sportsCB);
			Thread.sleep(2000);
			String[] hobbies = data.get("hobbies").split(",");
			for(int i=0;i<hobbies.length;i++) {
				if(hobbies[i].equalsIgnoreCase("Sports")) {
					wait.until(ExpectedConditions.elementToBeClickable(sportsCB)).click();
				}else if(hobbies[i].equalsIgnoreCase("Reading")) {
					wait.until(ExpectedConditions.elementToBeClickable(readingCB)).click();
				}else if(hobbies[i].equalsIgnoreCase("Music")) {
					wait.until(ExpectedConditions.elementToBeClickable(musicCB)).click();
				}else {
					throw new RuntimeException("Invalid Hobbies: "+hobbies);
				}
			}
			
			wait.until(ExpectedConditions.elementToBeClickable(uploadPicture)).sendKeys(data.get("picture"));
			wait.until(ExpectedConditions.elementToBeClickable(currentAddressTextField)).sendKeys(data.get("currentAddress"));
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stateDD);
			wait.until(ExpectedConditions.elementToBeClickable(stateDD)).click();
			Thread.sleep(1000);
			if(data.get("state").equalsIgnoreCase("Uttar Pradesh")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-3-option-1"))).click();
			}else if(data.get("state").equalsIgnoreCase("NCR")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-3-option-0"))).click();
			}else if(data.get("state").equalsIgnoreCase("Haryana")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-3-option-2"))).click();
			}else if(data.get("state").equalsIgnoreCase("Rajasthan")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-3-option-3"))).click();
			}else {
				throw new RuntimeException("Invalid State.");
			}

			wait.until(ExpectedConditions.elementToBeClickable(cityDD)).click();
			Thread.sleep(1000);
			
			selectCity(data.get("city"));
			
			wait.until(ExpectedConditions.elementToBeClickable(submitBT)).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(modalTitle));
			System.out.println(modalTitle.getText());
			
			List<WebElement> headers = tableModal.findElements(By.xpath("//div[@role='document']//table//thead/tr/th"));
			for (WebElement header : headers) {
			    System.out.print(header.getText() + " | ");
			}
			System.out.println();
			// Get rows inside tbody
			List<WebElement> rows = tableModal.findElements(By.xpath("//div[@role='document']//table//tbody/tr"));

			for (WebElement row : rows) {
			    List<WebElement> cols = row.findElements(By.tagName("td"));
			    for (WebElement col : cols) {
			        System.out.print(col.getText() + " | ");
			    }
			    System.out.println();
			}
	
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", closeModalBT);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeModalBT);
			logger.info("Form Filled Successfully.");
		}catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public void selectCity(String city) {
		if(city.equalsIgnoreCase("Agra")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-option-0"))).click();
		}else if(city.equalsIgnoreCase("Lucknow")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-option-1"))).click();
		}else if(city.equalsIgnoreCase("Merrut")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-option-2"))).click();
		}else if(city.equalsIgnoreCase("Delhi")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-option-0"))).click();
		}else if(city.equalsIgnoreCase("Gurgaon")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-option-1"))).click();
		}else if(city.equalsIgnoreCase("Noida")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-option-2"))).click();
		}else if(city.equalsIgnoreCase("Karnal")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-option-0"))).click();
		}else if(city.equalsIgnoreCase("Panipat")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-option-1"))).click();
		}else if(city.equalsIgnoreCase("Jaipur")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-option-0"))).click();
		}else if(city.equalsIgnoreCase("Jaiselmer")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-4-option-1"))).click();
		}else {
			throw new RuntimeException("Invalid City.");
		}
		
	}
}
