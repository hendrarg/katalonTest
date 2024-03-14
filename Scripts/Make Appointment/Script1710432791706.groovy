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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com')

WebUI.verifyElementText(findTestObject('Page_CURA Healthcare Service/CURA Healthcare Service'), 'CURA Healthcare Service')

WebUI.click(findTestObject('Page_CURA Healthcare Service/Button Make Appointment'))

WebUI.verifyElementText(findTestObject('Page_CURA Healthcare Service/Please login to make appointment'), 'Please login to make appointment.')

WebUI.sendKeys(findTestObject('Page_CURA Healthcare Service/input_Username'), username)

WebUI.sendKeys(findTestObject('Page_CURA Healthcare Service/input_Password'), password)

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/verivy success login'), 30)

WebUI.selectOptionByValue(findTestObject('Page_CURA Healthcare Service/select Seoul CURA Healthcare Center'), 'Seoul CURA Healthcare Center', 
    false)

WebUI.click(findTestObject('Page_CURA Healthcare Service/Apply for hospital readmission'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/healthcare program no'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/datePicker'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/itemDate'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Comment'), 'Test')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/Appointment Confirmation'), 30)

WebUI.click(findTestObject('Page_CURA Healthcare Service/Homepage'))

WebUI.closeBrowser()

