package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static common.CommonAction.*;
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
	@FindBy(xpath = "//input[@id='id_m_name']")
	WebElement middleNamElement;

	@FindBy(xpath = "//small[contains(text(), 'alphabetic')]")
	WebElement mustBeAlphabeticCharactersErrorMessage;

	@FindBy(xpath = "//small[contains(text(), 'First Name is a required field.')]")
	WebElement firstNameIsARequiredFieldErrorMesssage;

	@FindBy(xpath = "//input[@id='id_m_name']")
	WebElement middleName;

	@FindBy(xpath = "//input[@id='id_m_name']")
	WebElement mustBeAlphabeticCharactersErrorMessag;

	@FindBy(xpath = "//input[@name='l_name']")
	WebElement lName;
	@FindBy(xpath = "//input[@name='l_name']")
	WebElement lastNameIsARequiredFieldErrorMessage;

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

	@FindBy(xpath = "//input[@name='email']")
	WebElement emailAddressErrorMessag;
	@FindBy(xpath = "//input[@name='email']")
	WebElement MustBeAValidEmailddressErrorMessage;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordElement;

	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement HomeAddressLine1;
	@FindBy(xpath = "//span[@id='home_address_error']")
	WebElement HomeAddressLine1IsARequiredFieldErrorMessage;
	@FindBy(xpath = "//span[@id='home_address_error']")
	WebElement mustBeAlphanumericCharactersErrorMessagElement;

	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement HomeAddressLine2;

	@FindBy(xpath = "//input[@name='city']")
	WebElement city;

	@FindBy(xpath = "//select[@id='id_state']")
	WebElement state;
	@FindBy(xpath = "//select[@id='id_state']")
	List<WebElement> listOfState;

	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement zipCode;

	@FindBy(xpath = "//input[@name='emergency_contact']")
	WebElement emergencyContract;

	@FindBy(xpath = "//input[@name='sign_by_name']")
	WebElement Signature;

	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement birthYear;
	@FindBy(xpath = "//select[@name='birth_year']/option")
	List<WebElement> birthYearList;
	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement birthYearIsARequiredFieldErrorMessage;
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
	@FindBy(xpath = "//input[@id='id_arrival_date']")
	WebElement dateOfArrivalTimElement;
	@FindBy(xpath = "//input[@id='id_know_us']")
	WebElement howDidYouKnowAboutEnthrallIt;
	@FindBy(xpath = "//select[@id='id_primary_language']")
	WebElement primaryLanguag;
	@FindBy(xpath = "//select[@id='id_primary_language']/option")
	List<WebElement> primaryLanguageList;
	@FindBy(xpath = "//select[@name='country_of_origin']")
	WebElement countryOfOrigin;
	@FindBy(xpath = "//select[@name='country_of_origin']/option")
	List<WebElement> setCountryOfOrigin;
	@FindBy(css = "input#id_f_name")
	WebElement signature;
	@FindBy(css = "input[id='id_emergency_contact']")
	WebElement eEmergencyContact;
	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement highestEducation;
	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement educationGraduate;
	@FindBy(xpath = "//select[@id='id_country_of_origin']")
	WebElement countryOfOriging;
	@FindBy(xpath = "//select[@name='country_of_origin']")
	WebElement countryOfOriginBangladesh;
	@FindBy(css = "select[id='id_primary_language']")
	WebElement languag;
	@FindBy(xpath = "//select[@name='primary_language']/option")
	List<WebElement> listOfLanguag;
	@FindBy(linkText = "Select your course from the dropdown")
	WebElement enrollHeader;
	@FindBy(linkText = "Please enter your personal and contact information.")
	WebElement enrollSubHeader;
	@FindBy(linkText = "All fields are required unless marked (optional).")
	WebElement enrollOtherHeader;
	@FindBy(xpath = "//input[@id='is_agree_terms']")
	WebElement selectAgreeButton;
	
	

	// @FindBy(xpath = "//select[@name='i_am' and @class='form-control']")
	// WebElement IamDd;
	/*
	 * public void clickLogo() { logo.click(); pause(4000); }
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
	 * public void use_of_dropdown_selectByValue() { //pause(4000);
	 * clickLoginButton();
	 * driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000)); select =
	 * new Select(IAm); select.selectByValue("Student"); pause(4000);
	 * //https://enthrallit.com/course/dashboard/enrolls/ }
	 */

	public void use_of_dropdown_selectByValue() {
		select = new Select(iAm);
		select.selectByValue("Student");
		pause(4000);
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
		verifyErrorMessageUnderTheField(mustBeAlphabeticCharactersErrorMessage, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(fName);
		inputTextThenClickTab(fName, "");
		verifyErrorMessageUnderTheField(firstNameIsARequiredFieldErrorMesssage, Attribute.INNER_HTML,
				"First Name is a required field.");
		pause(3000);
		inputTextThenClickTab(fName, "176351245");
		verifyErrorMessageUnderTheField(mustBeAlphanumericCharactersErrorMessagElement, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
	}

	public void dropDownValidation() {
		selectElelementFromDropdownOnebyOne(iAm, iAmList);
		pause(3000);
		selectDropdown(iAm, "Employed");
		pause(3000);
		selectElelementFromDropdownOnebyOne(countryOfOrigin, setCountryOfOrigin);
		pause(3000);
		selectDropdown(countryOfOrigin, "Albanina");
		pause(3000);
		selectElelementFromDropdownOnebyOne(birthYear, birthYearList);
		pause(4000);
		selectDropdown(birthYear, "1960");
		inputTextThenClickTab(birthYear, "");
		pause(4000);
		verifyErrorMessageUnderTheField(birthYearIsARequiredFieldErrorMessage, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		pause(4000);
		selectElelementFromDropdownOnebyOne(languag, listOfLanguag);
		pause(3000);
		selectDropdown(languag, "Bengali");

	}

	public void inputTextValidation() {
		verifyLengthOfTheFieldContent(fName, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(fName, "$$^&@$(");
		verifyErrorMessageUnderTheField(mustBeAlphabeticCharactersErrorMessage, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(fName);
		inputTextThenClickTab(fName, "");
		verifyErrorMessageUnderTheField(firstNameIsARequiredFieldErrorMesssage, Attribute.INNER_HTML,
				"First Name is a required field.");
		pause(3000);
		inputTextThenClickTab(fName, "176351245");
		verifyErrorMessageUnderTheField(mustBeAlphanumericCharactersErrorMessagElement, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
		inputTextThenClickTab(middleName, "@#$%");
		verifyErrorMessageUnderTheField(mustBeAlphabeticCharactersErrorMessag, Attribute.ID,
				"Must be alphabetic characters");
		clearTextFromTheField(middleName);
		inputTextThenClickTab(middleName, "123654");
		verifyErrorMessageUnderTheField(mustBeAlphabeticCharactersErrorMessag, Attribute.ID,
				"Must be alphabetic characters");

		verifyLengthOfTheFieldContent(lName, Attribute.MAX_LENGTH, "25");
		clearTextFromTheField(lName);
		verifyErrorMessageUnderTheField(lastNameIsARequiredFieldErrorMessage, Attribute.NAME,
				"Last Name is a required field");
		clearTextFromTheField(lName);
		inputTextThenClickTab(lName, "@#$%&");
		verifyErrorMessageUnderTheField(mustBeAlphabeticCharactersErrorMessag, Attribute.NAME,
				"Must be alphabetic characters");

		inputTextThenClickTab(emailAddress, "");
		verifyErrorMessageUnderTheField(emailAddressErrorMessag, Attribute.NAME, "Email Address is a requir field");
		pause(4000);
		verifyLengthOfTheFieldContent(emailAddress, Attribute.MAX_LENGTH, "74");
		inputTextThenClickTab(emailAddress, "asdfghjklz");
		verifyErrorMessageUnderTheField(emailAddressErrorMessag, Attribute.INNER_HTML,
				"Must be a valid Email Address.");
		pause(4000);
		inputTextThenClickTab(MustBeAValidEmailddressErrorMessage, "Must be a valid Email Address.");
		pause(4000);

		inputTextThenClickTab(HomeAddressLine1, "");
		verifyErrorMessageUnderTheField(HomeAddressLine1IsARequiredFieldErrorMessage, Attribute.ID,
				"Home Address Line 1 is a required field.");
		inputTextThenClickTab(HomeAddressLine1, "'-,._");

		verifyErrorMessageUnderTheField(mustBeAlphanumericCharactersErrorMessagElement, Attribute.ID,
				"Must be alphanumeric characters.");
		inputText(emergencyContract, "603-755-2561");

		inputText(signature, "MashrufaRahman");
		pause(3000);
	}

	public void primaryLanguageValidation() {
		selectElelementFromDropdownOnebyOne(primaryLanguag, primaryLanguageList);

	}

	public void inputDataInTheFields() {
		validationOfHeader(enrollHeader, "Select your course from the dropdown");
		validationOfSubHeader(enrollSubHeader, "Please enter your personal and contact information.");
		validationOfOtherHeader(enrollOtherHeader, "All fields are required unless marked (optional).");
		fName.sendKeys("Mashrufa");
		pause(4000);
		middleName.sendKeys("Haque");
		pause(4000);
		lName.sendKeys("Rahman");
		pause(3000);
		selectDropdown(iAm, "a Student");
		pause(4000);
		selectDropdown(CourseWishToEnroll, "Python");
		pause(3000);
		phonNumber.sendKeys("6092538899");
		pause(3000);
		emailAddress.sendKeys("kaylith1@gmail.com");
		pause(3000);
		password.sendKeys("Abcd12345%");
		pause(4000);
		selectDropdown(Gender, "Female");
		pause(4000);
		selectDropdown(birthYear, "1960");
		pause(4000);
		selectDropdown(birthMonth, "February");
		pause(4000);
		selectDropdown(BirthDate, "Select Birth Date");
		pause(4000);
		HomeAddressLine1.sendKeys("709 North Oks Blvd");
		pause(3000);
		HomeAddressLine2.sendKeys("70 Tennyson Rd");
		pause(3000);
		city.sendKeys("North Brunswick");
		pause(4000);
		selectDropdown(state, "Alabama");
		pause(4000);
		zipCode.sendKeys("07781");
		pause(3000);
		selectDropdown(ImmigrationStatus, "Citizen");
		pause(4000);
		// selectDropdown(DateOfArrival, "08-27-2024");
		DateOfArrival.sendKeys("08/03/2024");
		pause(4000);
		emergencyContract.sendKeys("Adam phone number 609-555-8246");
		pause(3000);
		emergencyContract.sendKeys("609-522-6532");
		pause(4000);
		howDidYouKnowAboutEnthrallIt.sendKeys("friend");
		pause(4000);
		selectDropdown(highestEducation, "Graduate");
		pause(3000);
		selectDropdown(countryOfOrigin, "Bangladesh");
		pause(3000);
		selectDropdown(primaryLanguag, "Bengali");
		pause(3000);
		Signature.sendKeys("MashrufaRahman");
		pause(4000);
		selectAgreeButton.click();
		

	}

	public void use_of_navigate_method() {
		pause(4000);
		driver.navigate().to("https://www.macys.com/");
		pause(4000);
		driver.navigate().back();
		pause(4000);
		driver.navigate().forward();
		pause(4000);
		driver.navigate().refresh();
		pause(4000);

	}

}
