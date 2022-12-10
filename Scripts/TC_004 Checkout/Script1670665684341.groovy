import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//****Login****
WebUI.callTestCase(findTestCase('TC_003 Get Harga Barang (Sauce Labs Backpack)'), [:], null)

//****Click button Add To Cart****
WebUI.click(findTestObject('/AddToCart/btn_addtocart'))
WebUI.takeScreenshot()

float GetPriceItem = 22.99
println('Get Price Sauce Labs Backpack is ' + GetPriceItem)

//****Click button Cart****
WebUI.click(findTestObject('/AddToCart/btn_cart'))
WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('/AddToCart/header_cart'), 5)
WebUI.takeScreenshot()

//****Click button Checkout****
WebUI.click(findTestObject('/AddToCart/btn_cekout'))

WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('/AddToCart/header_cekout'), 5)

//****Input First Name****
WebUI.takeScreenshot()
WebUI.click(findTestObject('/DataUser/firstname_field'))
WebUI.setText(findTestObject('/DataUser/firstname_field'), GlobalVariable.firstname)

//****Input Last Name****
WebUI.click(findTestObject('/DataUser/lastname_field'))
WebUI.setText(findTestObject('/DataUser/lastname_field'), GlobalVariable.lastname)

//****Input Zipcode****
WebUI.click(findTestObject('/DataUser/zipcode_field'))
WebUI.setText(findTestObject('/DataUser/zipcode_field'), GlobalVariable.zipcode)
WebUI.takeScreenshot()
WebUI.scrollToPosition(350, 150)

//****Click button Continue****
WebUI.click(findTestObject('/AddToCart/btn_Cancel_continue'))
WebUI.delay(5)

WebUI.scrollToPosition(1, 1)
WebUI.delay(5)
WebUI.takeScreenshot()

WebUI.scrollToPosition(900, 700)
WebUI.takeScreenshot()

//****Click button Finish****
WebUI.click(findTestObject('/AddToCart/btn_finish'))
WebUI.delay(5)
WebUI.takeScreenshot()

WebUI.scrollToPosition(1, 1)
WebUI.verifyElementText(findTestObject('/AddToCart/header_cekoutcomplete'), 'THANK YOU FOR YOUR ORDER')
WebUI.takeScreenshot()

