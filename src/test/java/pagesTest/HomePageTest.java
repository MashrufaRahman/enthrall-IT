package pagesTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseUtil_7_26_2024.BaseClass;

public class HomePageTest extends BaseClass {

	@Test()
	public void enrollmentTest() {
		homePages.clickLoginButton();
		homePages.clickAutomationButtonAndDirectToEnrollmentPage();
		homePages.inputDataInTheFields();
		// homePages.use_of_dropdown_selectByValue();
		// homePages.use_of_dropdown_selectByIndex();
		// homePages.use_of_dropdown_selectByVisibleText();
	}

	@Test
	public void personalImageValidationTest() {
		homePages.clickLoginButton();
		homePages.clickAutomationButtonAndDirectToEnrollmentPage();
		homePages.personalImageValidation();

	}

	@Test()
	public void use_of_dropdown_selectByValue_test() {
		// homePages.use_of_dropdown_selectByValue();
		// homePages.clickAutomationButton();
	}

	@Test
	public void useAutomationBttn() {
		homePages.clickLoginButton();
		homePages.clickAutomationButtonAndDirectToEnrollmentPage();
	}

	/*
	 * @Test public void homeAddress1ValiidationTest() {
	 * homePages.clickLoginButton(); }
	 */
	@Test
	public void primaryLanguageValidationTest() {
		homePages.clickLoginButton();
		homePages.clickAutomationButtonAndDirectToEnrollmentPage();
		homePages.primaryLanguageValidation();
	}

	@Test
	public void enrollmentProcess() {
		homePages.clickLoginButton();
		homePages.clickAutomationButtonAndDirectToEnrollmentPage();
		homePages.firstNameValidation();
		homePages.dropDownValidation();
		homePages.inputTextValidation();
	}

	@Test
	public void use_Of_navigate_method_test() {
		homePages.use_of_navigate_method();
	}

	@Test
	public void enrolementPageErrorMessageValidationTest() {
		homePages.clickLoginButton();
		homePages.clickAutomationButtonAndDirectToEnrollmentPage();
		homePages.enrolementPageErrorMessageValidation();

	}

}
