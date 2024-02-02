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
//WebUI.verifyMatch(WebUI.getWindowTitle(), 'CURA Healthcare Service', false)
//WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/amenu-toggle'))
//
//WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/a_Login'))
//
//WebUI.setText(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/input_username'), 
//    'John Doe')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/input_password'), 
//    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
//
//WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/button_Login'))
WebUI.delay(2)

CustomKeywords.'com.qa.test.customfunction.CuraDropdown'(findTestObject('Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center')

WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/div_input-group-addon'))

WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/td_30'))

WebUI.setText(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/textarea_comment'), 
    'csdiufhasicmals;kcopa')

WebUI.click(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Cura_Pages/CURA_MAKEAPPOINTMENT_OR/CURA_MAKINGAPPOINTMENT_OR/Page_CURA Healthcare Service/p_Please be informed that your appointment _11813a'), 
    0)

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/CURA_CHECKPOINT_DATA'), true)

