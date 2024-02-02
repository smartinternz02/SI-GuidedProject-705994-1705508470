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
//WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/amenu-toggle'))
//
//WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/a_Login'))
//
//WebUI.setText(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/input_username'), 
//    'John Doe')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/input_password'), 
//    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
//
//WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/button_Login'))
WebUI.click(findTestObject('Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/a_Home'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/footer_CURA Healthcare Service             _54f5c2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/p_Atlanta 550 Pharr Road NE Suite 525Atlant_8f4c85'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/li_(678) 813-1KMS'), 
    '(678) 813-1KMS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/i_fa fa-envelope-o fa-fw'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/i_fa fa-facebook fa-fw fa-3x'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/i_fa fa-twitter fa-fw fa-3x'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/i_fa fa-dribbble fa-fw fa-3x'))

WebUI.verifyElementText(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/p_Copyright  CURA Healthcare Service 2024'), 
    'Copyright © CURA Healthcare Service 2024')

WebUI.verifyElementClickable(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_FOOTER_OR/Page_CURA Healthcare Service/a_infokatalon.com'))

