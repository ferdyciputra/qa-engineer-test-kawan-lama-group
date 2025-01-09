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

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Common Test Cases/Login'), [('Username') : 'John Doe', ('Password') : 'ThisIsNotAPassword'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Page_CuraAppointment/lst_Facility'), valueFacility, false)

WebUI.check(findTestObject('Page_CuraAppointment/chk_Readmission'))

WebUI.check(findTestObject('Page_CuraAppointment/chk_Medicaid'))

'User fill blank field visit date'
WebUI.setText(findTestObject('Page_CuraAppointment/txt_VisitDate'), '')

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), valueComment)

WebUI.click(findTestObject('Page_CuraAppointment/btn_BookAppointment'))

'Verify User Failed Make Appointment'
WebUI.verifyTextNotPresent('Appointment Confirmation', false)

'Verify User still on Make Appointment Form'
WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/div_Appointment'), GlobalVariable.timeout)

WebUI.closeBrowser()

