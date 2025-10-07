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

WebUI.navigateToUrl('https://portofolio-wildan-zeta.vercel.app/')

WebUI.click(findTestObject('Page_Create Next App/button_View My Projects'))

WebUI.scrollToElement(findTestObject('Page_Create Next App/button_Collaborate With Me'), 3)

WebUI.delay(3)

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory

// Temukan element-nya (pakai TestObject kamu)
def buttonObj = findTestObject('Page_Create Next App/button_Collaborate With Me')

// Ambil WebElement dari TestObject
def driver = DriverFactory.getWebDriver()
def element = WebUI.findWebElement(buttonObj, 10)

// Eksekusi JavaScript click
JavascriptExecutor js = (JavascriptExecutor) driver
js.executeScript("arguments[0].click();", element)


WebUI.setText(findTestObject('Page_Contact  Wildan Syukri Niam/input_Nama_name'), 'willy')

WebUI.setText(findTestObject('Page_Contact  Wildan Syukri Niam/input_Email_email'), 'willy@gmail.com')

WebUI.setText(findTestObject('Page_Contact  Wildan Syukri Niam/textarea_Pesan_message'), 'semangat TA nya wildaaaan')

WebUI.click(findTestObject('Page_Contact  Wildan Syukri Niam/button_Kirim'))

