package pagesTest;

import org.testng.annotations.Test;

import baseUtil_7_26_2024.BaseClass;

public class HomePageTest extends BaseClass {

	@Test()
	public void enrollmentTest() {
		homePages.clickLoginButton();
		homePages.clickAutomationButtonAndDirectToEnrollmentPage();
		//homePages.use_of_dropdown_selectByValue();
		//homePages.use_of_dropdown_selectByIndex();
		//homePages.use_of_dropdown_selectByVisibleText();

	}
	@ Test()

	public void use_of_dropdown_selectByValue_test() {
		//homePages.use_of_dropdown_selectByValue();
		//homePages.clickAutomationButton();
	}
	
	@Test
	
	public void useAutomationBttn() {
		homePages.clickAutomationButtonAndDirectToEnrollmentPage();
	}
	@Test
	public void homeAddress1ValiidationTest() {
		homePages.clickLoginButton();
		
		
	}
	@Test
	public void primaryLanguageValidationTest() {
		homePages.clickLoginButton();
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
	
	
		
	}
	
	