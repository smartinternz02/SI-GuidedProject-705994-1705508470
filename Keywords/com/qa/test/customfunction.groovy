package com.qa.test

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

public class customfunction {

	@Keyword
	def CuraDropdown(TestObject ojb ,String str_opt) {
		//		System.out.println("funstion called");
		boolean flag=false;
		//		System.out.println("boolean calledd");
		WebElement element = WebUiCommonHelper.findWebElement(ojb, 25);
		//		System.out.println("commonhelper");
		Select dropdownlist= new Select(element);
		//		System.out.println("select"+dropdownlist+"  ;");
		//		WebElement ele;

		for (WebElement ele : dropdownlist.getOptions()) {
			//			System.out.println("in for loop")

			if (ele.getText().equals(str_opt)){
				System.out.println("Element " +str_opt+" Exist");
				flag=true;
			}
			else {
				System.out.println('Element '+str_opt+' not exist');
			}
		}
		return flag;
	}
}