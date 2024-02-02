import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
//
//WebUI.verifyMatch(WebUI.getWindowTitle(), 'CURA Healthcare Service', false)

WebUI.click(findTestObject('Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/a_Login'))

// 	USE OF GLOBAL VARIABLE FOR USERNAME AND PASSWORD  
WebUI.setText(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/input_username'), 
    GlobalVariable.user)

WebUI.setText(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/input_password'), 
    GlobalVariable.pass)

WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/h2_Make Appointment'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/a_History'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/a_Profile'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/a_Home'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/a_Logout'))

WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_LOGIN_OR/CURA_LOGIN_LOGIN VALIDATION_OR/Page_CURA Healthcare Service/a_Logout'))

