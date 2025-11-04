package com.automation.SeleniumFramework.Functionalities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;

    // Constructor'0
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
//    =============== HomePage Side Tabs ==================
    
    @FindBy(xpath = "//div[@class='accordion']/div[1]")
    protected WebElement elementsTab;
    
    @FindBy(xpath = "//div[@class='accordion']/div[2]")
    protected WebElement formsTab;
    
    @FindBy(xpath = "//div[@class='accordion']/div[3]")
    protected WebElement alertsFrameWindowsTab;
    
    @FindBy(xpath = "//div[@class='accordion']/div[4]")
    protected WebElement widgetsTab;
    
    @FindBy(xpath = "//div[@class='accordion']/div[5]")
    protected WebElement interactionsTab;
    
    @FindBy(xpath = "//div[@class='accordion']/div[6]")
    protected WebElement bookStoreTab;
    
//    ================== Elements Tab =====================
    
    @FindBy(xpath = "//div[@class='accordion']/div[1]/div")
    protected WebElement subElementsTab;
    
    @FindBy(xpath = "//div[@class='accordion']/div[1]//li[@id='item-0']")
    protected WebElement textBoxTab;
    
    @FindBy(xpath = "//h1[text()='Text Box']")
    protected WebElement textBoxLabel;
    
    @FindBy(id = "userName")
    protected WebElement usernameTB;
    
    @FindBy(id = "userEmail")
    protected WebElement userEmailTB;
    
    @FindBy(id = "currentAddress")
    protected WebElement currentAddressTB;
    
    @FindBy(id = "permanentAddress")
    protected WebElement permanentAddressTB;
    
    @FindBy(id = "submit")
    protected WebElement submitBT;
  
    @FindBy(xpath = "//div[@id='output']/div/p[@id='name']")
    protected WebElement outputName;
  
    @FindBy(xpath = "//div[@id='output']/div/p[@id='email']")
    protected WebElement outputEmail;
  
    @FindBy(xpath = "//div[@id='output']/div/p[@id='currentAddress']")
    protected WebElement outputCurrAddress;
  
    @FindBy(xpath = "//div[@id='output']/div/p[@id='permanentAddress']")
    protected WebElement outputPermanentAddress;
    
    @FindBy(xpath = "//div[@class='accordion']/div[1]//li[@id='item-1']")
    protected WebElement checkBoxTab;
    
    @FindBy(xpath = "//h1[text()='Check Box']")
    protected WebElement checkBoxLabel;
    
    @FindBy(xpath = "//button[@title='Expand all']")
    protected WebElement expandAllBT;
    
    @FindBy(xpath = "//button[@title='Collapse all']")
    protected WebElement collapseAllBT;
    
    @FindBy(xpath = "//div[@id='tree-node']//span[text()='Home']")
    protected WebElement homeCB;
    
    @FindBy(xpath = "//div[@id='tree-node']//span[text()='Office']")
    protected WebElement officeCB;
    
    @FindBy(xpath = "//div[@id='tree-node']//span[text()='React']")
    protected WebElement reactCB;
    
    @FindBy(xpath = "//div[@id='tree-node']//span[text()='Word File.doc']")
    protected WebElement wordCB;
    
    @FindBy(xpath = "//div[@id='tree-node']//span[text()='Excel File.doc']")
    protected WebElement excelCB;
    
    @FindBy(xpath = "//div[@id='result']/span")
    protected List<WebElement> resultCB;
    
    @FindBy(xpath = "//div[@id='tree-node']//button[@title='Toggle']")
    protected List<WebElement> toggleCB;
    
    @FindBy(xpath = "//div[@class='accordion']/div[1]//li[@id='item-2']")
    protected WebElement radioBTTab;
    
    @FindBy(xpath = "//h1[text()='Radio Button']")
    protected WebElement radioButtonLabel;
    
    @FindBy(xpath = "//label[@for='yesRadio']")
    protected WebElement yesRadioBT;
    
    @FindBy(xpath = "//label[@for='impressiveRadio']")
    protected WebElement impressiveRadioBT;
    
    @FindBy(xpath = "//h1/following::div/p/span")
    protected WebElement selectedRadioBTLabel;
    
    @FindBy(xpath = "//div[@class='accordion']/div[1]//li[@id='item-3']")
    protected WebElement webTableTab;
    
    @FindBy(xpath = "//div[@class='accordion']/div[1]//li[@id='item-4']")
    protected WebElement buttonsTab;
    
    @FindBy(xpath = "//div[@class='accordion']/div[1]//li[@id='item-5']")
    protected WebElement linksTab;
    
    @FindBy(xpath = "//div[@class='accordion']/div[1]//li[@id='item-6']")
    protected WebElement linksTab2;
    
    @FindBy(xpath = "//div[@class='accordion']/div[1]//li[@id='item-7']")
    protected WebElement uploadTab;
    
    @FindBy(xpath = "//div[@class='accordion']/div[1]//li[@id='item-8']")
    protected WebElement dynamicPropTab;
    
//    ================== Forms Tab ======================
    
    @FindBy(xpath = "//div[@class='accordion']/div[2]//li[@id='item-0']")
    protected WebElement practiceFormTab;
    
    @FindBy(xpath = "//h1[text()='Practice Form']")
    protected WebElement practiceFormLabel;
    
    @FindBy(id = "firstName")
    protected WebElement firstNameTextField;
    
    @FindBy(id = "lastName")
    protected WebElement lastNameTextField;
    
    @FindBy(id = "userEmail")
    protected WebElement userEmailTextField;
    
    @FindBy(xpath = "//input[@id='gender-radio-1']/following::label")
  	protected WebElement maleRB;
    
    @FindBy(xpath = "//input[@id='gender-radio-2']/following::label")
  	protected WebElement femaleRB;
    
    @FindBy(xpath = "//input[@id='gender-radio-3']/following::label")
  	protected WebElement otherRB;
    
    @FindBy(id = "userNumber")
    protected WebElement userNumberTextField;
    
    @FindBy(id = "dateOfBirth")
    protected WebElement dobContainer;
    
    @FindBy(id = "dateOfBirthInput")
    protected WebElement dobInput;
    
    @FindBy(id = "subjectsContainer")
    protected WebElement subjectsContainer;
    
    @FindBy(id = "subjectsInput")
    protected WebElement subjectsInputTextField;
    
    @FindBy(xpath = "//input[@id='hobbies-checkbox-1']/following::label")
    protected WebElement sportsCB;
    
    @FindBy(xpath = "//input[@id='hobbies-checkbox-2']/following::label")
    protected WebElement readingCB;
    
    @FindBy(xpath = "//input[@id='hobbies-checkbox-3']/following::label")
    protected WebElement musicCB;
    
    @FindBy(id = "uploadPicture")
    protected WebElement uploadPicture;
    
    @FindBy(id = "currentAddress")
    protected WebElement currentAddressTextField;
    
    @FindBy(id = "state")
    protected WebElement stateDD;
    
    @FindBy(xpath = "//*[text(),'Uttar Pradesh']")
    protected WebElement uttarPradeshStateDD;
    
    @FindBy(xpath = "//div[@id='state']//*[text(),'NCR']")
    protected WebElement ncrStateDD;
    
    @FindBy(xpath = "//div[@id='state']//*[text(),'Haryana']")
    protected WebElement haryanaStateDD;
    
    @FindBy(xpath = "//div[@id='state']//*[text(),'Rajasthan']")
    protected WebElement rajasthanStateDD;
    
    @FindBy(id = "city")
    protected WebElement cityDD;
    
    @FindBy(xpath = "//div[@id='city']//*[text(),'Agra']")
    protected WebElement agraCityDD;
    
    @FindBy(xpath = "//div[@id='state']//*[text(),'Lucknow']")
    protected WebElement lucknowCityDD;

    @FindBy(xpath = "//div[@id='state']//*[text(),'Merrut']")
    protected WebElement merrutCityDD;

    @FindBy(xpath = "//div[@id='state']//*[text(),'Delhi']")
    protected WebElement delhiCityDD;
    
    @FindBy(xpath = "//div[@id='state']//*[text(),'Gurgaon']")
    protected WebElement gurgaonCityDD;
    
    @FindBy(xpath = "//div[@id='state']//*[text(),'Noida']")
    protected WebElement noidaCityDD;
    
    @FindBy(xpath = "//div[@id='state']//*[text(),'Karnal']")
    protected WebElement karnalCityDD;
    
    @FindBy(xpath = "//div[@id='state']//*[text(),'Panipat']")
    protected WebElement panipatCityDD;
    
    @FindBy(xpath = "//div[@id='state']//*[text(),'Jaipur']")
    protected WebElement jaipurCityDD;
    
    @FindBy(xpath = "//div[@id='state']//*[text(),'Jaiselmer']")
    protected WebElement jaiselmerCityDD;
    
    @FindBy(id = "example-modal-sizes-title-lg")
    protected WebElement modalTitle;
    
    @FindBy(id = "closeLargeModal")
    protected WebElement closeModalBT;
    
    @FindBy(xpath = "//div[@role='document']//table")
    protected WebElement tableModal;
    
    
//    ===================================================
    
    
    
//    @FindBy(xpath = "")
//    protected WebElement ;
    
}
