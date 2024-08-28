package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import lombok.experimental.FieldNameConstants;

import static common.CommonAction.*;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import constants.Attribute;

public class HomePages {

	WebDriver driver;
	JavascriptExecutor js;
	public Select select;

	public HomePages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;

	}

	@FindBy(xpath = "//img//parent::a//parent::nav")
	WebElement logo;

	@FindBy(xpath = "//a[text()='Login']")
	WebElement logInFromToolbar;

	@FindBy(xpath = "//input[@name='username']")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(css = "input.btn.btn-lg.px-5")
	WebElement loginButton;

	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;

	@FindBy(xpath = "//a[text()='Enroll Now']")
	WebElement enrollNow;

	@FindBy(xpath = "//input[@name='f_name']")
	WebElement fName;
	
	@FindBy(xpath = "//small[contains(text(), 'alphabetic')]")
	WebElement mustBeAlphabeticCharactersErrorMessage;
	
	@FindBy(xpath = "//small[contains(text(), 'First Name is a required field.')]")
	WebElement firstNameIsARequiredFieldErrorMesssage;

	@FindBy(xpath = "//input[@name='l_name']")
	WebElement lName;

	@FindBy(xpath = "//select[@name = 'i_am']")
	WebElement iAm;
	
	@FindBy(xpath = "//select[@name='i_am']/option")
	List<WebElement> iAmList;

	@FindBy(xpath = "//select[@id='id_course_wish_to_enroll']")
	WebElement CourseWishToEnroll;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phonNumber;

	@FindBy(xpath = "//input[@name='email']")
	WebElement emailAddress;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordElement;

	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement HomeAddressLine1;

	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement HomeAddressLine2;

	@FindBy(xpath = "//input[@name='city']")
	WebElement city;

	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement zipCode;

	@FindBy(xpath = "//input[@name='emergency_contact']")
	WebElement emergencyContract;

	@FindBy(xpath = "//input[@name='sign_by_name']")
	WebElement Signature;

	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement birthYear;
	@FindBy(xpath = "//select[@name='birth_month']")
	WebElement birthMonth;
	@FindBy(xpath = "//select[@name='gender']")
	WebElement Gender;
	@FindBy(xpath = "//select[@id='id_birth_date']")
	WebElement BirthDate;
	@FindBy(xpath = "//select[@name='immigration_status']")
	WebElement ImmigrationStatus;
	@FindBy(xpath = "//input[@name='arrival_date']")
	WebElement DateOfArrival;

	

	// @FindBy(xpath = "//select[@name='i_am' and @class='form-control']")
	// WebElement IamDd;
/*
	public void clickLogo() {
		logo.click();
		pause(4000);
	}
*/
	public void clickLoginButton() {
		elementDisplayed(logInFromToolbar);
		// clickEliment(logInFromToolbar);
		js.executeScript("arguments[0].click()", logInFromToolbar);
		pause(4000);
		// elementDisplayed(email);
		elementDisplayed(email);
		inputText(email, "Kaylith1@gmail.com");
		elementDisplayed(password);
		inputText(password, "Abcd12345%");
		pause(4000);
		elementEnabled(loginButton);
		// verifyTextOfTheWebElement(loginButton, "log in");
		clickElement(loginButton);
		pause(2000);

	}
/*
	public void use_of_dropdown_selectByValue() {
		//pause(4000);
		clickLoginButton();
		 driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
		select = new Select(IAm);
		select.selectByValue("Student");
		pause(4000);
		//https://enthrallit.com/course/dashboard/enrolls/
	}

	public void use_of_dropdown_selectByIndex() {
		select = new Select(CourseWishToEnroll);
		select.selectByIndex(1);
		pause(4000);

	}

	public void use_of_dropdown_selectByVisibleText() {
		select = new Select(birthYear);
		select.selectByVisibleText("1960");
		pause(4000);

	}
	*/

	public void clickAutomationButtonAndDirectToEnrollmentPage() {
		elementEnabled(automation);
		verifyTextOfTheWebElement(automation, "Automation");
		clickElement(automation);
		pause(2000);
		elementEnabled(enrollNow);
		verifyTextOfTheWebElement(enrollNow, "Enroll Now");
		clickElement(enrollNow);
		pause(4000);
		Set<String> allWindowHandales = driver.getWindowHandles();
		// Extract parent and child
		String parent = (String) allWindowHandales.toArray()[0];
		String child = (String) allWindowHandales.toArray()[1];
		driver.switchTo().window(child);
		pause(4000);
		
	}
	
	public void firstNameValidation() {
		verifyLengthOfTheFieldContent(fName, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(fName, "$$^&@$(");
		verifyErrorMessageUnderTheField(mustBeAlphabeticCharactersErrorMessage, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(fName);
		inputTextThenClickTab(fName, "");
		verifyErrorMessageUnderTheField(firstNameIsARequiredFieldErrorMesssage, Attribute.INNER_HTML, "First Name is a required field.");
		pause(3000);
		inputTextThenClickTab(fName, "176351245");
		verifyErrorMessageUnderTheField(mustBeAlphabeticCharactersErrorMessage, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
	}
	
	public void iAmValidation() {
		selectElelementFromDropdownOnebyOne(iAm, iAmList);
		pause(3000);
		selectDropdown(iAm, "Employed");
		pause(3000);
	}
	
	
	
	
	
	
	
	
	
	/*
	
	public void inputDataInTheFields() {
		fName.sendKeys("Mashrufa");
		pause(4000);
		lName.sendKeys("Rahman");
		pause(3000);
		selectDropdown(IAm, "a Student");
		pause(4000);
		selectDropdown(CourseWishToEnroll, "Python");
		pause(3000);
		selectDropdown(birthYear, "1960");
		pause(4000);
		selectDropdown(birthMonth, "February");
		pause(4000);
		selectDropdown(BirthDate, "Select Birth Date");
		pause(4000);
		phonNumber.sendKeys("6092538899");
		pause(3000);
		emailAddress.sendKeys("kaylith1@gmail.com");
		pause(3000);
		password.sendKeys("Abcd12345%");
		selectDropdown(Gender, "Female");
		pause(4000);
		HomeAddressLine1.sendKeys("709 North Oks Blvd");
		pause(3000);
		HomeAddressLine2.sendKeys("69 Tennyson Rd");
		pause(3000);
		city.sendKeys("North Brunswick");
		pause(4000);
		zipCode.sendKeys("07781");
		pause(3000);
		selectDropdown(ImmigrationStatus, "Citizen");
		pause(4000);
		selectDropdown(DateOfArrival, "08-27-2024");
		emergencyContract.sendKeys("Adam phone number 609-555-8246");
		pause(3000);
		Signature.sendKeys("MashrufaRahman");
		pause(4000);
		

	}
*/


}
