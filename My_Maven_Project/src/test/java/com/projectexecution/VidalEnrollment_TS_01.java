package com.projectexecution;

import org.testng.annotations.Test;

import com.bussinesslibraries.VidalEnrollement_TS_01;

public class VidalEnrollment_TS_01 {
	
	
	
  @Test(priority=0)
  public void verifyLoginTabErrorMSG_TC01() {
	  //creating an object for bussines libararies
	  VidalEnrollement_TS_01  ts01 = new VidalEnrollement_TS_01();
	  ts01.verifyLoginBtnErrorMSG_TC01();
	  
  }
  
  @Test(priority=1)
  public void verifyNewUserLnk_TC02() {
	  //creating an object for bussines libararies
	  VidalEnrollement_TS_01  ts01 = new VidalEnrollement_TS_01();
	  ts01.verifyNewUserForm_Tc02();
  }
  
  @Test(priority=2)
  public void verifyHealthCareButtons_Tc03() {
	  //creating an object for bussines libararies
	  VidalEnrollement_TS_01  ts01 = new VidalEnrollement_TS_01();
	  ts01.verifyHealthCareButtons_Tc03();
  }
  
}
