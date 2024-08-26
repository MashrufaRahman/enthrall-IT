package pagesTest;

import org.testng.annotations.Test;

import baseUtil_7_26_2024.BaseClass;

public class HomePageTest extends BaseClass {

	@Test()
	public void enrollmentTest() {
		homePages.clickLoginButton();
		homePages.clickAutomationButton();
		homePages.use_of_dropdown_selectByValue();
		homePages.use_of_dropdown_selectByIndex();
		homePages.use_of_dropdown_selectByVisibleText();

	}

}
