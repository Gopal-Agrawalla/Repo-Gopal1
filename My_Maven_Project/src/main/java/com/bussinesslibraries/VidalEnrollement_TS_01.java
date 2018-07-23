package com.bussinesslibraries;


import org.testng.Assert;
import com.genecriclibraries.DriverScript;
import com.genecriclibraries.WebDriverCommonUtilities;
import com.pageobjectmodellibraries.VHC_HomePageLocators;

public class VidalEnrollement_TS_01 {

	VHC_HomePageLocators  pageLocators = new VHC_HomePageLocators();

	public void verifyLoginBtnErrorMSG_TC01(){
		//mouseover login button
		WebDriverCommonUtilities.performActions().moveToElement
		(DriverScript.driver.findElement(pageLocators.login_Button)).perform();
		WebDriverCommonUtilities.captureScreenshots();
		//enter UserName
		String userName = WebDriverCommonUtilities.getTestData("Data",5, 0);
		String password = WebDriverCommonUtilities.getTestData("Data",5, 1);
		WebDriverCommonUtilities.clearEnter(pageLocators.login_UserName, 
				userName);
		WebDriverCommonUtilities.normalWait(3000);
		//Enter password
		WebDriverCommonUtilities.clearEnter(pageLocators.login_Password, 
				password);
		//click on login button
		WebDriverCommonUtilities.normalWait(3000);
		WebDriverCommonUtilities.performClick(pageLocators.login_GoButton);
		String erroMSG =WebDriverCommonUtilities.getPageText(pageLocators.login_ErrorMSG);
		WebDriverCommonUtilities.setTestData("Data", 5, 2, erroMSG);
		String exp ="Please enter valid username and password";
		Assert.assertEquals(erroMSG, exp,"Both texts are not same.");
		//close popup
		WebDriverCommonUtilities.performClick(pageLocators.login_CrossMark);

	}


	public void verifyNewUserForm_Tc02(){

		//mouse over on login button
		WebDriverCommonUtilities.performActions().
		moveToElement(DriverScript.driver.findElement(pageLocators.login_Button)).perform();

		//click on new user link
		WebDriverCommonUtilities.performClick(pageLocators.newUserLnk);
		//wait for name filed
		WebDriverCommonUtilities.waitForElement(pageLocators.newUserLnk_NameTextBox);

		WebDriverCommonUtilities.captureScreenshots();
		
		//enter user name
		String name =WebDriverCommonUtilities.getTestData("Data", 1, 0);
		String corporateName =WebDriverCommonUtilities.getTestData("Data", 1, 1);
		String date =WebDriverCommonUtilities.getTestData("Data", 12, 1);
		String month =WebDriverCommonUtilities.getTestData("Data", 12, 0);
		String year =WebDriverCommonUtilities.getTestData("Data", 12,2);
		String age =WebDriverCommonUtilities.getTestData("Data", 1, 2);
		String city =WebDriverCommonUtilities.getTestData("Data", 1, 3);
		String state =WebDriverCommonUtilities.getTestData("Data", 1, 4);
		String email =WebDriverCommonUtilities.getTestData("Data", 1, 5);
		String query =WebDriverCommonUtilities.getTestData("Data", 1, 6);
		String mobileNo =WebDriverCommonUtilities.getTestData("Data", 1, 7);
		String landlineNo =WebDriverCommonUtilities.getTestData("Data", 1, 8);


		WebDriverCommonUtilities.clearEnter(pageLocators.newUserLnk_NameTextBox,
				name);
		WebDriverCommonUtilities.clearEnter(pageLocators.newUserLnk_CorporateNameTextBox, corporateName);
		WebDriverCommonUtilities.clearEnter(pageLocators.newUserLnk_AgeTextField, age);
		WebDriverCommonUtilities.clearEnter(pageLocators.newUserLnk_CityTextField, city);
		WebDriverCommonUtilities.clearEnter(pageLocators.newUserLnk_StatetextField, state);
		WebDriverCommonUtilities.clearEnter(pageLocators.newUserLnk_EmailIdTextField, email);
		WebDriverCommonUtilities.clearEnter(pageLocators.newUserLnk_QueryTextField, query);
		WebDriverCommonUtilities.clearEnter(pageLocators.newUserLnk_MobileNoTextField, mobileNo);
		WebDriverCommonUtilities.clearEnter(pageLocators.newUserLnk_MobileLandlineNoTextField, landlineNo);
		WebDriverCommonUtilities.performClick(pageLocators.newUserLnk_MaleGenderRadioBtn);
		WebDriverCommonUtilities.performSelect(pageLocators.newUserLnk_Month).selectByVisibleText(month);
		WebDriverCommonUtilities.performSelect(pageLocators.newUserLnk_Day).selectByVisibleText(date);
		WebDriverCommonUtilities.performSelect(pageLocators.newUserLnk_Year).selectByVisibleText(year);
		WebDriverCommonUtilities.captureScreenshots();
		WebDriverCommonUtilities.performClick(pageLocators.newUserLnk_SubmitBtn);
		WebDriverCommonUtilities.normalWait(4000);
		WebDriverCommonUtilities.captureScreenshots();
		//close popup
		WebDriverCommonUtilities.performClick(pageLocators.crossMark);
	}

	
	public void verifyHealthCareButtons_Tc03(){
		
		WebDriverCommonUtilities.waitForElement(pageLocators.fitnessButton);
		
		//click on fitness
		WebDriverCommonUtilities.performClick(pageLocators.fitnessButton);
		//close popup
		WebDriverCommonUtilities.performClick(pageLocators.crossMark);
		
		//click on diet
		WebDriverCommonUtilities.performClick(pageLocators.dietButton);
		//close popup
		WebDriverCommonUtilities.performClick(pageLocators.crossMark);
		//click on stress
		WebDriverCommonUtilities.performClick(pageLocators.stressButton);
		//close popup
		WebDriverCommonUtilities.performClick(pageLocators.crossMark);
		//click on illness
		WebDriverCommonUtilities.performClick(pageLocators.illnessButton);
		//close popup
		WebDriverCommonUtilities.performClick(pageLocators.crossMark);
		//click on lifeStyle
		WebDriverCommonUtilities.performClick(pageLocators.lifestyleButton);
		//close popup
		WebDriverCommonUtilities.performClick(pageLocators.crossMark);
		
	}
	
	
}