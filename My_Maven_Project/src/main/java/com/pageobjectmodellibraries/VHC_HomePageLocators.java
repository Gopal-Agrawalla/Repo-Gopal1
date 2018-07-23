package com.pageobjectmodellibraries;

import org.openqa.selenium.By;

public class VHC_HomePageLocators {
	
	

	//*********Login Tab Locators*********//
	//Login Button
	public By  login_Button  = By.className("login");
	//login_UserName
	public By login_UserName = By.id("usernameforshow");
	//Login_password
	public By login_Password = By.id("passwordforshow");
	//login_go button
	public By login_GoButton = By.id("edit-submit");
	//login_erroeMessage
	public By login_ErrorMSG = By.xpath("//div[contains(text(),'P')]");
	//login_closeButton
	public By login_CrossMark  = By.id("fancy_login_close_button");
	
	
	//************ New User Link Locators *********//
	public By newUserLnk_CloseBtn = By.className("close");
	public By newUserLnk  = By.linkText("New User?");
	public By newUserLnk_CustomerFormText =By.xpath("//a[contains(text(),'Cu')]");
	public By newUserLnk_NameTextBox =By.xpath("//*[@id='edit-submitted-name-full-name']");
	public By newUserLnk_CorporateNameTextBox =By.xpath("//*[@id='edit-submitted-corporate-name']");
	public By newUserLnk_Month =By.xpath("//*[@id='edit-submitted-date-of-birth-month']");
	public By newUserLnk_Day =By.xpath("//*[@id='edit-submitted-date-of-birth-day']");
	public By newUserLnk_Year =By.xpath("//*[@id='edit-submitted-date-of-birth-year']");
	public By newUserLnk_AgeTextField =By.id("edit-submitted-age");
	public By newUserLnk_MaleGenderRadioBtn =By.xpath("//label[contains(text(),'Mal')]");
	public By newUserLnk_CityTextField =By.id("edit-submitted-city");
	public By newUserLnk_StatetextField =By.id("edit-submitted-state");
	public By newUserLnk_EmailIdTextField =By.id("edit-submitted-e-mail-id");
	public By newUserLnk_QueryTextField =By.id("edit-submitted-query");
	public By newUserLnk_MobileNoTextField =By.id("edit-submitted-mobile-no");
	public By newUserLnk_MobileLandlineNoTextField =By.id("edit-submitted-landline");
	public By newUserLnk_CheckBox =By.id("edit-submitted-terms-cond-1");
	public By newUserLnk_SubmitBtn =By.id("edit-submit--2");
	public By crossMark =By.xpath("//a[@class='close']");
	
	

	//Footer Links
	public By aboutUs =By.linkText("ABOUT US");
	public By talkToUs =By.linkText("TALK TO US");
	public By becomeAPartner =By.linkText("BECOME A PARTNER");
	public By termsOfUse =By.linkText("TERMS OF USE");
	public By privacyPolicy =By.linkText("PRIVACY POLICY");
	public By whistle =By.linkText("WHISTLE BLOWER");
	
	
	public By homepageLink =By.className("logo");
	
	
	//hompage buttons
	public By fitnessButton = By.xpath("//*[@id='disc_1']");
	public By illnessButton = By.xpath("//*[@id='disc_3']");
	public By stressButton = By.xpath("//*[@id='disc_4']");
	public By lifestyleButton = By.xpath("//*[@id='disc_5']");
	public By dietButton = By.xpath("//*[@id='disc_2']");
	
    
    
    
    
    
	

}
